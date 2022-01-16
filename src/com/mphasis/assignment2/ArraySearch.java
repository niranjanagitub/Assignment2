package com.mphasis.assignment2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class ArraySearch {

	public static void main(String[] args) {
        String[] strArry = {"test","test1","test2","test3","test4","test5"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to search in array"+Arrays.toString(strArry));
        String input = sc.nextLine();
        System.out.println(Stream.of(strArry).filter(str->str.equalsIgnoreCase(input)).findFirst().orElse("no string found"));
	}

}
