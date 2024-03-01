package com.javaAbstractMethods;

public class Product 
{	
	
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
	}
	
	@Override
	public String toString() 
	{
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	
	//method
	//public abstract String getProduct();
	//This method requires a body instead of a semicolon
	//The abstract method getProduct in type Product can only be defined by an abstract class
	
}
