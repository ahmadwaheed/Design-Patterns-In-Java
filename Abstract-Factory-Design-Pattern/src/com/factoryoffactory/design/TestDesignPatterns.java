
package com.factoryoffactory.design;

public class TestDesignPatterns {

	public static void main(String[] args) {
		
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		
		Computer pc = ComputerFactory.getComputer(new PCFactory("4 GB","600 GB","2.7 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("64 GB","4 TB","6.9 GHz"));
		
		System.out.println("AbstractFactory PC Config::" + pc);
		System.out.println("AbstractFactory Server Config::" + server);
	}
}

/*
 * OUTPUT
 * 
AbstractFactory PC Config::RAM= 4 GB, HDD=600 GB, CPU=2.7 GHz
AbstractFactory Server Config::RAM= 64 GB, HDD=4 TB, CPU=6.9 GHz
 * */
