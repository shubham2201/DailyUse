package com.MyProject.DailyUse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.MyProject" })
public class DailyUseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailyUseApplication.class, args);
	}

}
