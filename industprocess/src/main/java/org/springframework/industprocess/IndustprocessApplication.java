package org.springframework.industprocess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class IndustprocessApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndustprocessApplication.class, args);
	}

}
