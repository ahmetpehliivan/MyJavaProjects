package com.softtech.softtechspringboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SofttechSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext1 = SpringApplication.run(SofttechSpringBootApplication.class, args);


		/*WebService webService1 = applicationContext1.getBean(WebService.class);
		WebService webService2 = applicationContext2.getBean(WebService.class);

		System.out.println(webService1 == webService2);
		System.out.println(webService1.getResponseConverter());*/


	}

}
