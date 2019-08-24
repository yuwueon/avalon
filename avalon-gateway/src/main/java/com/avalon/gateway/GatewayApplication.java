package com.avalon.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.factory.GatewayFilterFactory;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.avalon.gateway.filter.RequestTimeGatewayFilterFactory;

@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);

	}
	
	@Bean
	public RequestTimeGatewayFilterFactory requestTimeGatewayFilterFactory(){
		return new RequestTimeGatewayFilterFactory();
	}

}
