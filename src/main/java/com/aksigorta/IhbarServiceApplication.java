package com.aksigorta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class IhbarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IhbarServiceApplication.class, args);
	}

}
