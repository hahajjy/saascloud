package com.jtl.services.saascloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SaascloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaascloudEurekaApplication.class, args);
	}

}

