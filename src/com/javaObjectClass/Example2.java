package com.javaObjectClass;

public class Example2 {

	public static void main(String[] args) {

		Student student1 = new Student(1001, "Karthik");
		System.out.println(student1.getClass());
		
		System.out.println("======================================");
		
		System.out.println(student1.getClass().getSimpleName());

	}

}
