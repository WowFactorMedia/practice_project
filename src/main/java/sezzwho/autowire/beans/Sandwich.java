package sezzwho.autowire.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Sandwich  {
    
	
	Condiment firstCondiment;
	Condiment secondCondiment;
	Bread bread;
	
	@Autowired
	public Sandwich(@Qualifier("mayo") Condiment firstCondiment,@Qualifier("meat") Condiment secondCondiment,@Qualifier("toastBread") Bread bread) {
		this.firstCondiment = firstCondiment;
		this.secondCondiment = secondCondiment;
		this.bread = bread;
	}
	
	
	public void printSandwich() {
		firstCondiment.print();
		secondCondiment.print();
		bread.describeBread();
	}
	
	
}
