package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
    	return builder.routes()
		.route(p -> p
			.path("/user/hello","/user/signup", "/user/exists", "/user/authenticate")
			.uri("http://34.64.132.4:50055"))
		.route(p -> p
			.path("/log","/log/counts", "/log/ping")
			.uri("http://13.124.188.6:50051"))
        .build();
	}
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
}
