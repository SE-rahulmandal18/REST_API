package com.simpli;

public class Main {

	public static void main(String[] args) {

		//Class1 c1 = new Class1(); //WONT WORK
		
	
		OuterClass outClassObj = new  OuterClass();
		
		OuterClass.Class1 c1 = outClassObj.new Class1();
		
		// access the inner class method
		c1.display();
		
		c1.displayPriceOfOuterClass();
		
//		//ANOTHER Way
//		OuterClass.Class1 c2 = new OuterClass().new Class1();
//         c1.display();
//		
//		c1.displayPriceOfOuterClass();
		
		
		System.out.println("\nDemo anothe inner class that was defined in a mehtod");
		
		OuterClass2 outClass2 = new OuterClass2();
		outClass2.display();
		
		//////////////////
		
		//Class3 c3 = new Class3(); // 
		
		
		//////////Anonymous class
		Class3 c3 = new Class3() {
			
			public void display3() {
				////
			}
		};
		
		c3.display4();// now we can test display4()		
		
	}
}