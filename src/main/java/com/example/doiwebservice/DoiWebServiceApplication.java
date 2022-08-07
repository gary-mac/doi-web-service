package com.example.doiwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class DoiWebServiceApplication {
	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(DoiWebServiceApplication.class, args);
	}
}
