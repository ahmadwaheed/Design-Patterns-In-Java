
package com.decorator.design.pattern;

public class SportsCar extends CarDecorator {

	public SportsCar(Car c) {
		
		super(c);
	}

	@Override
	public void assemble(){
		
		super.assemble();
		System.out.print("Sports Car: I can blow your mind with my speed");
	}
}
