package com.javaObjectClass;

public class Example1 {

	public static void main(String[] args) {

		Student student1 = new Student(1001, "Karthik");
		System.out.println(student1.hashCode());
		System.out.println(student1.hashCode());
		
		System.out.println("======================================");
		
		Student student2 = new Student(1002, "Karthik");
		System.out.println(student2.hashCode());
		
		System.out.println("======================================");
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("======================================");
		
		System.out.println(s1.equals(s2));
		System.out.println(student1.getName().equals(student2.getName()));
		System.out.println(student1.getRollNo().equals(student2.getRollNo()));

	}

}
