package com.drm.up;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.drm")
@EnableJpaRepositories
@EnableAutoConfiguration
public class UpApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpApplication.class, args);
	}

}
