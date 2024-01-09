package com.beans;

public class Employee {

	private Integer id;
	private String name;
	private String city;
	private Float salary;
	
	static {
		System.out.println("Employee class is loaded...");
	}

	public Employee() {
		System.out.println("Employee class object is created");
	}

	public Employee(Integer id, String name, String city, Float salary) {		
		super();
		System.out.println("Caller -> Paramterized Constructor : Employee class object is created");
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
		System.out.println("Parameterized constructor is invoked");
	}
	
	public String empActivity()
	{
		System.out.println("Employee is working till 7:30 pm");
		return "Employee activity method is called";
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}

}
