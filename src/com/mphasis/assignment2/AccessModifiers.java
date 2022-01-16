package com.mphasis.assignment2;

public class AccessModifiers {
  public static void main(String... vr) {
	 
	  Data d = new Data();
      // access the private variable using the getter and setter
      d.setName("Hello world");
      System.out.println(d.getName());
  }
}
// default scope class name
class Data {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}
