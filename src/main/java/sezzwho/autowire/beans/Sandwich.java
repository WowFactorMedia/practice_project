package sezzwho.autowire.beans;



public class Sandwich  {
    
	
	Condiment firstCondiment;
	Condiment secondCondiment;
	Bread bread;
	
	
	public Sandwich(Condiment firstCondiment, Condiment secondCondiment,Bread bread) {
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
