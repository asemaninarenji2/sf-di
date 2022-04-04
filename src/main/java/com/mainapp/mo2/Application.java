package com.mainapp.mo2;

import com.mainapp.mo2.controllers.ConstructorInjectedController;
import com.mainapp.mo2.controllers.MyController;
import com.mainapp.mo2.controllers.PropertyInjectedController;
import com.mainapp.mo2.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);

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





	}

}
