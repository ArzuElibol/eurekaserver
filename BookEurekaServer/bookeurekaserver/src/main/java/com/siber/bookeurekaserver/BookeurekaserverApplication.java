package com.siber.bookeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BookeurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookeurekaserverApplication.class, args);
	}

}
