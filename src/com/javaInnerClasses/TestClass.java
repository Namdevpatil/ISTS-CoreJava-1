package com.javaInnerClasses;

import com.javaInnerClasses.Address.Customer;

public class TestClass {

	public static void main(String[] args) {

		
		Address address = new Address("Hyderabad");
		
		System.out.println(address.toString());
		
		System.out.println("-------------------------------");
		
		//Address.Customer customer = new Customer(101, "Ajay Kumar");//static inner class
		Customer customer = address.new Customer(101, "Ajay Kumar");//non-static inner class
		
		System.out.println(customer.toString());

	}

}
