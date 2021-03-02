package org.springframework.rules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RulesApplication {

    public static void main(String[] args) {
		SpringApplication.run(RulesApplication.class, args);
	}

}
