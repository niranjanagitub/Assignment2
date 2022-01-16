package com.mphasis.assignment2;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
     int[] arr = {1,2,3,4,5};
     System.out.println("Single dimention array:"+Arrays.toString(arr));
     
     int[][] multiArray = {{1,2,3},{4,5,6},{7,8,9}};
     for(int i =0;i<multiArray.length;i++) {
    	 System.out.println("array:"+Arrays.toString(multiArray[i]));
     }
    
	}

}
