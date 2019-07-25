
package com.decorator.design.pattern;

public class CarDecorator implements Car {

	//Interface
	protected Car car;
	
	//Constructor
	public CarDecorator(Car c){
		
		this.car = c;
	}
	
	@Override
	public void assemble() {
		
		System.out.println("This is Generic Car Decorator");
		this.car.assemble();
	}

}
