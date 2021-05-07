package com.spring.DependencyInjection;

import com.spring.DependencyInjection.Controller.ConstructorInjectedController;
import com.spring.DependencyInjection.Controller.MyController;
import com.spring.DependencyInjection.Controller.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext  applicationContext= SpringApplication.run(DependencyInjectionApplication.class, args);

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.Greeting());
	}

}
