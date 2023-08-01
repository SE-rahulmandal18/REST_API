package com.simpli;

public class Main {
	public static void main(String[] args) {

		// Exception demo

		int[] array = new int[3]; 

		try {

			array[7] = 3;

		} catch (ArrayIndexOutOfBoundsException e) {

			//System.out.println("Caught an exception " + e.getMessage());

			System.out.println("Caught an exception " + e);

		}

		System.out.println("End of program");
 
	}

}