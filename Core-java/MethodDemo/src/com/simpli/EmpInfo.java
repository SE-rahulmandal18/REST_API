package com.simpli;

public class EmpInfo {
	int id;
	String name;
	int salary = 5000;
	
	//default constructor
	public EmpInfo() {
		
	}
	
	//parametrized constructor
	public EmpInfo(int id, String name, int salary) {
		//super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// method to return tax amount
	float getTaxAmount(){
		
		float tax =  this.salary * 0.1f;
		
		return tax;
	}
	
	//Example of another method that takes 1 argument and does not return anything
	void incrementSalaryBy(int val){
		this.salary = this.salary + val;
	}
	
	// Example of overloaded method
	float getTaxAmount(float taxRate){
		
		float tax =  this.salary * (taxRate / 100);
		
		return tax;
	}

}