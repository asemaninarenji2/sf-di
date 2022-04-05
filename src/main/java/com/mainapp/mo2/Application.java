package com.mainapp.mo2;

import com.mainapp.mo2.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		MyController myController = (MyController) ctx.getBean("myController");

		myController.sayHello();


		System.out.println(">>>property:");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println("-------------------------------\\n\\n");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(">>>setter:");
		System.out.println(setterInjectedController.getGreetingService().sayGreeting());
		System.out.println("-----------------------------");

		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(">>>>Constructor");
		System.out.println(constructorInjectedController.getGreetingService().sayGreeting());

		System.out.println("<<<<<Multi Lingual service from active profile>>>>>");
		I18Controller i18Controller = (I18Controller) ctx.getBean("i18Controller");
		System.out.println(i18Controller.getGreetingService().sayGreeting());





	}

}
