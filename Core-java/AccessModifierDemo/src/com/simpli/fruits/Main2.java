package com.simpli.fruits;

import com.simpli.util.SnowApple;

public class Main2 {

	public static void main(String[] args) {

		Apple apple1 = new Apple();

		// Try accessing apple 's price
		//System.out.println("Apple's price = " + apple1.price); // Compiler error
		
		System.out.println("Apple's weight = " + apple1.weight);// WORKS
		
		// Try accessing apple 's color
		System.out.println("Apple's color = " + apple1.color); // WORKS
		
		// Try accessing apple 's city of origin
		System.out.println("Apple's city of origin = " + apple1.cityOfOrgin); // Compiler error
		
		
		
	}

}