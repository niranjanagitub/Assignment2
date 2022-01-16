package com.mphasis.assignment2;

public class Constructurs {

	public static void main(String[] args) {
		Employee empDefaultCons = new Employee();
		Employee empPrameterCon = new Employee(10,"Niranjana");
	}

}
class Employee {
	private int eid;
	private String name;
	
	public Employee() {
		System.out.println("Object created from Default Constructor");
	}
	public Employee(int eid, String name) {
		this.eid = eid;
		this.name = name;
		System.out.println("Object created with Parameter Constructor with eid:"+eid +",name:"+name );
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}