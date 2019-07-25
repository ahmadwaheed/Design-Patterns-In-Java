
package com.prototype.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

	private List<String> empList;
	
	//Initializing Employee ArrayList within the constructor
	public Employees() {
		
		empList = new ArrayList<String>();
	}
	
	public Employees(List<String> list) {
		
		this.empList = list;
	}
	public void loadData() {
		
		//read all employees from database and put into the list
		empList.add("Ahmad");
		empList.add("Waheed");
		empList.add("Salimi");
		empList.add("786");
	}
	
	public List<String> getEmpList() {
		
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			
		List<String> temp = new ArrayList<String>();
		
			for(String s : this.getEmpList()){
				
				//Cloning ArrayList of String to another ArrayList
				temp.add(s);
			}
			
			//returning cloned copy
			return new Employees(temp);
	}
}
