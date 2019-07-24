
package com.design.factory;

public class TestFactory {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		
		System.out.println("Factory PC Config:: " + pc);
		System.out.println("Factory Server Config:: " + server);
	}

}

/* OUTPUT
 * 
Factory PC Config::RAM= 2 GB, HDD=500 GB, CPU=2.4 GHz
Factory Server Config::RAM= 16 GB, HDD=1 TB, CPU=2.9 GHz
 * 
 */