package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAspects2Application {

	public static void main(String[] args) throws Exception {

		Account account = new Account();
		account.withdraw(5);
		System.out.println(account.balance);

		SpringApplication.run(DemoAspects2Application.class, args);
	}

}
