package com.mphasis.assignment2;

public class SgringPrimitives {

	public static void main(String[] args) {
		String strByte = "10";
		String strShort = "10";
		String strInt = "10";
		String strFloat = "10.12";
		String strLong = "10";
		String strDouble = "10d";
		String strBoolean = "true";
		String strChar = "c";
		System.out.println("String to Byte Conversion:   "+Byte.valueOf(strByte));
		System.out.println("String to Short Conversion:  "+Short.valueOf(strShort));
		System.out.println("String to Int Conversion:    "+Integer.valueOf(strInt));
		System.out.println("String to Float Conversion:  "+Float.valueOf(strFloat));
		System.out.println("String to Long Conversion:   "+Long.valueOf(strLong));
		System.out.println("String to Double Conversion: "+Double.valueOf(strDouble));
		System.out.println("String to Boolean Conversion:"+Boolean.valueOf(strBoolean));
		System.out.println("String to Char Conversion:"   +strChar.toCharArray()[0]);

	}

}
