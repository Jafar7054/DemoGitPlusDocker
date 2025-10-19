package com.dockerPlusGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class DemoDockerPlusGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDockerPlusGitApplication.class, args);
	}
	
	public String printMsg()
	{
		return "Demo Test Success";
	}

}
