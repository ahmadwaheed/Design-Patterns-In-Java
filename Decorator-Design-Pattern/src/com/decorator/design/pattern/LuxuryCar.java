
package com.decorator.design.pattern;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car c) {
		
		super(c);
	}
	
	@Override
	public void assemble(){
		
		super.assemble();
		System.out.print("Luxury Car: Feel like home while you driving home");
	}
}
