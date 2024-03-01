package com.javaInnerClasses;

public class Example2 {

	public static void main(String[] args) {
		
		int vector[][] = {{10, 20},{20, 10}};
		
		//nested/inner loop
		
		//outer for loop
		for(int i = 0; i < vector.length; i++)//rows
		{
			//inner for loop
			for(int j = 0; j < vector.length; j++)//columns
			{
				System.out.println(vector[i][j]);
			}

		}

	}

}
