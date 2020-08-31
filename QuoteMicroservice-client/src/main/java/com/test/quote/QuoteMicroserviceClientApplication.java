package com.test.quote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class QuoteMicroserviceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuoteMicroserviceClientApplication.class, args);
	}
//	@Bean
//	public Docket swaggerApi() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//					.apis(RequestHandlerSelectors.basePackage("pl.piomin.services.department.controller"))
//					.paths(PathSelectors.any())
//				.build()
//				.apiInfo(new ApiInfoBuilder().version("1.0").title("Department API").description("Documentation Department API v1.0").build());
//	}
}
