package com.nt.nareshit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;

@SpringBootApplication

public class FirstExample2Application {//1500697171

	

	public FirstExample2Application() {
		super();
		System.out.println("FirstExample2Application  is excuted constracter");
	}

	public static void main(String[] args) {
ConfigurableApplicationContext context= SpringApplication.run(FirstExample2Application.class, args);
              Alien a=    context.getBean( Alien.class);
              Alien a1=    context.getBean( Alien.class);
              Alien a2=    context.getBean( Alien.class);
              a.show();
              System.out.println(a.hashCode());
	}

}
