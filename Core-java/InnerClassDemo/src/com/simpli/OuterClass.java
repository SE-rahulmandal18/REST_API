package com.simpli;

public class OuterClass {
    private int price = 100;
    
    // inner class definition
    class Class1{
    	int age;
    	
    	public void display() {
    		System.out.println("I am inner class");
    	}
    	
    		public void displayPriceOfOuterClass() {
    	
    			// Inner classes have access tot the private stuff of the outer class
    		    
    		System.out.println("Outer class has price= "+ price);
    	
    	
    	
    	
    	
    	
    	
    	}
    }
}