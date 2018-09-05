package sezzwho.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sezzwho.autowire.beans.Sandwich;



public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config_bean.xml");
		
	
		Sandwich s = context.getBean("sandwich", Sandwich.class);

       
		s.printSandwich();
		
		
	}

}
