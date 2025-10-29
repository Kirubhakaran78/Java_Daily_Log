package com.example.StoreJsonIntoTable.pojo;

//Model class->blueprint for what kind of information your application can handles
//It represents the structure of your data in java.

public class Analyst {

//	@Id
//	@GeneratedValue(Strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}