package org.springframework.rules.ssl;

import java.io.File;

import javax.net.ssl.SSLContext;

import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.discovery.DiscoveryClient;

/**
 * Configura o certificado digital para handshake com o servidor Eureka.
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

}