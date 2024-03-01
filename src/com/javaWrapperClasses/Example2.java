package com.javaWrapperClasses;

public class Example2 {

	public static void main(String[] args) {
		
		
		//primitive byte value
		byte byteValue = 20;
		
		System.out.println(byteValue);
		
		System.out.println("------------------------------------");
		
		//converted from byte primitive to Byte object type: AutoBoxing
		//Byte byteObjectValue = byteValue;
		Byte byteObjectValue = Byte.valueOf(byteValue);
		
		System.out.println(byteObjectValue);
		
		
		System.out.println("================================================");
		
		//converted from Byte object type to byte primitive type : UnBoxing
		byte byteValue1 = 123;
		
		//Byte byteObjectValue
		Byte byteObjectValue1 = Byte.valueOf(byteValue1);
		
		//primitive byte value
		byte primitiveByteValue = byteObjectValue1.byteValue();
		System.out.println(primitiveByteValue);
		
	}

}
