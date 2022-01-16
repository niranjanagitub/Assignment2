package com.mphasis.assignment2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,Integer> hashMap = new HashMap<>();
		Map<String,Integer> linkedHashMap = new LinkedHashMap<>();
		Map<String,Integer> treeMap = new TreeMap<>();
		Map<String,Integer> hashTable = new Hashtable<>();
		hashMap.put("one", 1);
		hashMap.put("three", 3);
		hashMap.put("two", 2);
		hashMap.put("one", 1);
		linkedHashMap.put("one", 1);
		linkedHashMap.put("three", 3);
		linkedHashMap.put("two", 2);
		linkedHashMap.put("one", 1);
		treeMap.put("one", 1);
		treeMap.put("three", 3);
		treeMap.put("two", 2);
		treeMap.put("one", 1);
		hashTable.put("one", 1);
		hashTable.put("three", 3);
		hashTable.put("two", 2);
		hashTable.put("one", 1);
		System.out.println("hashMap:"+hashMap);
		System.out.println("linkedHashMap:"+linkedHashMap);
		System.out.println("treeMap:"+treeMap);
		System.out.println("hashTable:"+hashTable);
	}

}
