package com.javaObjectClass;

public class Example3 {

	public static void main(String[] args) {
		
		System.out.println("Step1: an object/instance is created.\n");
		Product product1 = new Product(1920, "Lenovo T480");
		
		System.out.println(product1.getProduct());
		
		product1 = null;		
		System.gc();
		

	}

}
