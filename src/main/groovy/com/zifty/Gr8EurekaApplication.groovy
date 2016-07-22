package com.zifty

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class Gr8EurekaApplication {

	static void main(String[] args) {
		SpringApplication.run Gr8EurekaApplication, args
	}
}
