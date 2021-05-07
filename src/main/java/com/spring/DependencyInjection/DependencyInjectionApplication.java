package com.spring.DependencyInjection;

import com.spring.DependencyInjection.Controller.I18nController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext  applicationContext= SpringApplication.run(DependencyInjectionApplication.class, args);
		I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
		System.out.println(i18nController.Greeting());


	}

}
