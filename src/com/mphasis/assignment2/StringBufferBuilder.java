package com.mphasis.assignment2;

public class StringBufferBuilder {

	public static void main(String[] args) {
      String stringBuffer = "String ";
      StringBuffer sBuffer = new StringBuffer(stringBuffer);
      sBuffer.append(" buffer");
      StringBuilder sBuilder = new StringBuilder(stringBuffer);
      sBuilder.append(" Builder");
      System.out.println(sBuffer);
      System.out.println(sBuilder);
	}

}
