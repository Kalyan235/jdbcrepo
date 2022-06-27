package com.jdbc_sql.domins;

public class Employee {

	private Integer e_id;
	private String name;
	private Integer age;
	private Double salary;

	public Employee(Integer e_id, String name, Integer age, Double salary) {
		super();
		this.e_id = e_id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee(String name, Integer age, Double salary) {
		super();

		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public Integer getE_id() {
		return e_id;
	}

	public void setE_id(Integer e_id) {
		this.e_id = e_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
