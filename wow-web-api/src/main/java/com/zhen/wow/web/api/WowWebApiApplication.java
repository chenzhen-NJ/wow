package com.zhen.wow.web.api;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class WowWebApiApplication {

	public static void main (String[] args) {
		SpringApplication.run(WowWebApiApplication.class, args);
	}

}
