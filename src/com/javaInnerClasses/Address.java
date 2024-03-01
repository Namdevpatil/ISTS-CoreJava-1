package com.javaInnerClasses;

//outer class
public class Address
{
	
	//fields
	private String address;
	
	//constructors
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Address(String address) {
		this.address = address;
	}

	//methods
	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}

	//inner/nested class
	//static class Customer//static class
	class Customer//non-static class
	{
		//fields
		private int id;
		private String name;
		
		//constructors
		public Customer() {
			// TODO Auto-generated constructor stub
		}

		public Customer(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		//methods
		@Override
		public String toString() 
		{
			return "Customer [id=" + id + ", name=" + name + "]";
		}
		
		
	}

}
