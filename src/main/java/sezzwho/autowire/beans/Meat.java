package sezzwho.autowire.beans;

import org.springframework.stereotype.Component;

@Component
public class Meat implements Condiment {

	

	public void print() {
		System.out.println("Delishious roasted beef");
	}
    
    
	
	
}
