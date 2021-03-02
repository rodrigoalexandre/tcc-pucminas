package org.springframework.webinterface.security.config;

import java.io.File;

import javax.net.ssl.SSLContext;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * Configura o certificado digital para handshake com o API Gateway.
 * Configura o RestTempate para chamadas Https.
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
    public SSLContext sslContext() throws Exception {
        return new SSLContextBuilder()
                .loadTrustMaterial(
                        trustStore,
                        trustStorePassword.toCharArray()
                ).build();
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder, SSLContext sslContext) {

        int defaulTimeout = 30000;
        RequestConfig requestConfig = RequestConfig.custom()
            .setConnectTimeout(defaulTimeout)
            .setConnectionRequestTimeout(defaulTimeout)
            .setSocketTimeout(defaulTimeout)
            .build();

        CloseableHttpClient httpClient = HttpClients.custom().setDefaultRequestConfig(requestConfig).setSSLHostnameVerifier(new NoopHostnameVerifier()).setSSLContext(sslContext).build();
        return builder.requestFactory(() -> new HttpComponentsClientHttpRequestFactory(httpClient)).build();

    }

}