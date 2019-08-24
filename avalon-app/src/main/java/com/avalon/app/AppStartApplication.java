package com.avalon.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.avalon.app",
		"com.avalon.app.controller",
		"com.avalon.service.hystrix"})
@EnableDiscoveryClient
@EnableFeignClients("com.avalon.service.api")
@EnableHystrix
public class AppStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppStartApplication.class, args);

	}
	

}



