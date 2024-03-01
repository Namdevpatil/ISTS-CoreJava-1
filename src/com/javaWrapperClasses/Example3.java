package com.javaWrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class Example3 
{
	
	public static void main(String[] args) {
		
		int values[] = {12, 34, 30, 49};
		
		for(int value: values)
		{
			System.out.println(value);
		}
		
		System.out.println("===========================");
		
		List<Integer> listOfValues = new ArrayList<Integer>();
		
		listOfValues.add(12);
		listOfValues.add(34);
		listOfValues.add(30);
		listOfValues.add(49);

		
		for(Object value: listOfValues)
		{
			System.out.println(value);
		}
		
		System.out.println("-------------------------");
		
		listOfValues.remove(0);//0 index value
		
		for(Object value: listOfValues)
		{
			System.out.println(value);
		}
		
	}

}
