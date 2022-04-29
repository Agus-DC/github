package com.demo.github;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubapitestApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(GithubapitestApplication.class, args);
		GitHubAPITest gitHubAPITest = new GitHubAPITest();
	}

}
