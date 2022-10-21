package org.tests.sanity.deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerAwsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerAwsTestApplication.class, args);
	}
	
	@GetMapping("/aws/test")
	public String welcome() {
		return "AWS Deployment Sanity Check";
		
	}

}
