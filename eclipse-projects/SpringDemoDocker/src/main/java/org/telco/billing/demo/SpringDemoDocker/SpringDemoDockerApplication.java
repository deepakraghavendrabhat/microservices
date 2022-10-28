package org.telco.billing.demo.SpringDemoDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDemoDockerApplication {
@GetMapping("/welcome")
	public String getMessage()
	{
		return "Welcome to Docker Image Demo";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoDockerApplication.class, args);
	}

}
