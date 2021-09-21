package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@SpringBootApplication
public class GatewayApplication {
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
    	return builder.routes()
		.route(p -> p
			.path("/log", "/log/**")
			.uri("http://3.36.122.92:50051"))
		.route(p -> p
			.path("/sprint", "/sprint/**")
			.uri("http://3.36.122.92:50052"))
		.route(p -> p
			.path("/workspace", "/workspace/**")
			.uri("http://3.36.122.92:50054"))
		.route(p -> p
			.path("/card", "/card/**")
			.uri("http://3.38.108.235:50053"))
		.route(p -> p
			.path("/user", "/user/**")
			.uri("http://34.64.132.4:50055"))
		.route(p -> p
			.path("/thread", "/thread/**")
			.uri("http://34.64.132.4:50056"))
        .build();
	}
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
}
