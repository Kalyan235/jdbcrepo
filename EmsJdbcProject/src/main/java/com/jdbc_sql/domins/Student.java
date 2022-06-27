package com.jdbc_sql.domins;

public class Student {

	private Integer Sid;
	private String name;
	private Double fee;
	private String adress;
	private String city;

	public Student() {
		super();
	}

	public Student(Integer sid, String name, Double fee, String adress, String city) {
		super();
		Sid = sid;
		this.name = name;
		this.fee = fee;
		this.adress = adress;
		this.city = city;
	}

	public Integer getSid() {
		return Sid;
	}

	public void setSid(Integer sid) {
		Sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
