package com.javaObjectClass;

public class Product 
{
	
	/**
	 * 	In Java every class object has life, from creation to destroy
	 * 
	 *  step1: create an object based a class
	 *  step2: initialize an object
	 *  step3: use the object to call/to complete the activities
	 *  step4: an object is no more useful, then it has to destroy.
	 *  
	 */
	
	//fields
	private int productId;
	private String productName;
	
	//object initializers
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName) {
		this.productId = productId;
		this.productName = productName;
		System.out.println("Step2: an object is initailized\n");
	}
	
	protected void finalize()
	{
		System.out.println("\nstep4: an object has destroyed");
	}

	//service method, to product details
	public String getProduct() 
	{
		System.out.println("step3: the service method called by using object.");
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}	

}
