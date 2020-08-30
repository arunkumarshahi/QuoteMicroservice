package com.test.quote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class QuoteMicroserviceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuoteMicroserviceClientApplication.class, args);
	}

}
