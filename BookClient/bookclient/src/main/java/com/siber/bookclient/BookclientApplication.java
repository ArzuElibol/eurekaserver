package com.siber.bookclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookclientApplication.class, args);
	}

}
