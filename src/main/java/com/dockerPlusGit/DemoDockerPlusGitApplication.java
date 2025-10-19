package com.dockerPlusGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class DemoDockerPlusGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDockerPlusGitApplication.class, args);
	}

	@GetMapping("/")
	public String printMsg()
	{
		return "Demo Test Success";
	}

}
