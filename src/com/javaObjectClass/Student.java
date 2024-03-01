package com.javaObjectClass;

//step1: the class should implements Cloneable interface
public class Student implements Cloneable
{

	//fields
	private Integer rollNo;
	private String name;

	public Student() 
	{

	}

	public Student(Integer rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	
	

	public Integer getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() 
	{
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}


	/**
	 * step3: declare CloneNotSupportedException class with method signature/head, 
	 *        in which method we called the clone() method
	 */
	public static void main(String[] args) throws CloneNotSupportedException
	{

		Student student1 = new Student(1001, "Karthik");
		System.out.println(student1.toString());

		System.out.println("====================================");

		//step2: call clone() method with original your object reference
		/**
		 * Step4: clone() method return an Object, so need to convert that to our 
		 *        required Object Type.
		 *        then convert from Object type to Your Required class type
		 *        for example,
		 *        
		 *        Student student2 = (Student)student1.clone()
		 */
		Student student2 = (Student)student1.clone();//Unhandled exception type CloneNotSupportedException
		System.out.println(student2.toString());
		
	}

}
