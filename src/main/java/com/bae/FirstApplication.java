package com.bae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(FirstApplication.class, args);
		System.out.println(ac.getBean("helloWorld"));
		System.out.println(ac.getBean("time"));
		System.out.println(ac.getBean("time"));
		System.out.println(ac.getBean("time"));
		System.out.println(ac.getBean("time"));
	}

}
