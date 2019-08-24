package com.avalon.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册发现中心
 * @author wyz
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(RegisterServerApplication.class, args);

	}

}
