package com.cg.eurekaService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceApplication {
       //main
	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceApplication.class, args);
	}

}
