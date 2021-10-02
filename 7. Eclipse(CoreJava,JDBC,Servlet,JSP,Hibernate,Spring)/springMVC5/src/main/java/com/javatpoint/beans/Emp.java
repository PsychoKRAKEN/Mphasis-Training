package com.javatpoint.beans;

public class Emp {
private int id;
private String name;
private Long salary;

public Emp() {}

public Emp(int id, String name, Long salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}

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
public float getSalary() {
	return salary;
}
public void setSalary(Long salary) {
	this.salary = salary;
}

}
