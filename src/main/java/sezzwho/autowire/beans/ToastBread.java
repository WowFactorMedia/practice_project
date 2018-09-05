package sezzwho.autowire.beans;

import org.springframework.stereotype.Component;

@Component
public class ToastBread implements Bread {
	


	public void describeBread() {
		// TODO Auto-generated method stub
		System.out.println("Toasted Bread");
		
	}
}
