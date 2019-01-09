package com.jtl.services.saascloudprovidercrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SaascloudProviderCrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaascloudProviderCrmApplication.class, args);
	}

}

