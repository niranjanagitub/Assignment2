package com.mphasis.assignment2;

public class InnerClassDemo {
	class Inner {
        // show() method of inner class
        public void show()
        {
            System.out.println("In a nested class method");
        }
    }
	
	public static void main(String...args) {
		InnerClassDemo.Inner in = new InnerClassDemo().new Inner();
		in.show();
	}
}
