package com.mphasis.assignment2;

public class ReturnTypes {

	public static void main(String[] args) {
		System.out.println("byte : "+returnByte());
		System.out.println("Short : "+returnShort());
		System.out.println("Integer : "+returnInt());
		System.out.println("Long : "+returnLong());
		System.out.println("Double : "+returnDouble());
		System.out.println("String : "+returnString());
		System.out.println("Boolean : "+returnBoolean());
	}
	
	public static Byte returnByte() {
		return 100;
	}
	public static Short returnShort() {
		return 20;
	}

	public static Integer returnInt() {
		return 100;
	}
	
	public static Long returnLong() {
		return 100l;
	}
	
	public static Double returnDouble() {
		return 100d;
	}
	
	public static String returnString() {
		return "hello";
	}
	public static Boolean returnBoolean() {
		return true;
	}
}
