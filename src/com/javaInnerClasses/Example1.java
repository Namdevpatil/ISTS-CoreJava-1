package com.javaInnerClasses;

public class Example1 {

	public static void main(String[] args) {
		
		
		int number = 35;
		
		/**
		 * 	1. first we have to check it is positive or negative
		 * 	2. if it is positive then we have to check that value/number is even or odd.
		 */
		
		//outer condition
		
		//nesting of if condition
		if(number > 0)
		{
			//inner condition
			if(number%2 == 0)
			{
				System.out.println(number+" is an even");
			}
			else
			{
				System.out.println(number+" is an odd");
			}
		}

	}

}
