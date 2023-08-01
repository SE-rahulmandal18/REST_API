package com.simpli;

public class ArrayDemo {

	public static void main(String[] args) {
	
		int[] b = new int[5];
		
		b[0] = 45;
		b[1] = 35;
		b[2] = 15;
		b[3] = 25;
		b[4] = 55;
		
		System.out.print("Printing arraya elements\n");
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.print("Printing arraya elements\n");
		int a[] = {15, 20, 30, 45, 52};
		
		for(int i=0; i<b.length; i++) {
			System.out.println("2nd approach ! elements of arrya a: "+ a[i]);
		}
	
		// MultiDimenArray
		System.out.print("Printing MultiDimenArray array\n");
	
		int [][] arr2d= {
				{10, 22, 33,}, {12, 78, 90}};

        for (int i = 0; i <arr2d.length; i++)
            for (int j = 0; j <arr2d[i].length ; j++)
                System.out.println("arr[" + i + "][" + j + "] = "
                                + arr2d[i][j]);
		
   }
}