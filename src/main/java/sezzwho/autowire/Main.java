package sezzwho.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.AppConfig;
import sezzwho.autowire.beans.Meat;
import sezzwho.autowire.beans.Sandwich;



public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
	
		Sandwich s = context.getBean("sandwich", Sandwich.class);

       
		s.printSandwich();
		
		
	}

}
