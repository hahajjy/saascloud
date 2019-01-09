package com.jtl.services.saascloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class SaascloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaascloudGatewayApplication.class, args);
	}
	@Bean
	public RequestTimeGatewayFilterFactory requestTimeGatewayFilterFactory() {
		return new RequestTimeGatewayFilterFactory();
	}
}

