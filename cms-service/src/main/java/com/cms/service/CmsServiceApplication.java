
package com.cms.service;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
@MapperScan("com.lyc.site.mapper")
public class CmsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmsServiceApplication.class, args);
	}
}
