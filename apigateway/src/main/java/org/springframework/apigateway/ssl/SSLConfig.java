package org.springframework.apigateway.ssl;

import java.io.File;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;

import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.discovery.DiscoveryClient;

/**
 * Configura o certificado digital para handshake com o servidor Eureka.
 * Sobrescreve a instância da SSLConnectionSocketFactory para desabilitar a validação de hostname.
 * @author rodrigoalexandre
 *
 */
@Configuration
public class SSLConfig {

    @Value("${server.ssl.key-store}")
    private File trustStore;
    @Value("${server.ssl.key-password}")
    private String trustStorePassword;

    @Bean
    public DiscoveryClient.DiscoveryClientOptionalArgs getTrustStoredEurekaClient(SSLContext sslContext) {
        DiscoveryClient.DiscoveryClientOptionalArgs args = new DiscoveryClient.DiscoveryClientOptionalArgs();
        args.setSSLContext(sslContext);
        return args;
    }

    @Bean
    public SSLContext sslContext() throws Exception {
        return new SSLContextBuilder()
                .loadTrustMaterial(
                        trustStore,
                        trustStorePassword.toCharArray()
                ).build();
    }

    @Bean
    public PoolingHttpClientConnectionManager poolingConnectionManager(SSLContext sslContext) {

        HostnameVerifier allowAll = new HostnameVerifier() {
            @Override
            public boolean verify(String hostName, SSLSession session) {
                return true;
            }
        };
        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
            .register("https", new SSLConnectionSocketFactory(sslContext, allowAll))
            .build();
         return new PoolingHttpClientConnectionManager(socketFactoryRegistry);
  
    }
}