package com.grsTech.grsCart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootGitDemo2Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext run = SpringApplication.run(SpringbootGitDemo2Application.class, args);
	run.close(); 
	}

}
