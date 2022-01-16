package com.mphasis.assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsDemo {

	public static void main(String[] args) {
     List<String> arrayList = new ArrayList<>();
     List<String> linkedList = new LinkedList<>();
     List<String> stack = new Stack<>();
     List<String> vector = new Vector<>();
     arrayList.add("arrayList1");
     arrayList.add("arrayList1");
     linkedList.add("test1");
     linkedList.add("test2");
     stack.add("stack1");
     stack.add("stack2");
     vector.add("vector1");
     vector.add("vector2");
     System.out.println(arrayList);
     System.out.println(linkedList);
     System.out.println(stack);
     System.out.println(vector);
     
     Set<String> hashSet= new HashSet<>();
     Set<String> linkedHashSet= new LinkedHashSet<>();
     Set<String> treeSet= new TreeSet<>();
     hashSet.add("abc");
     hashSet.add("bca");
     hashSet.add("cab");
     hashSet.add("abc");
     linkedHashSet.add("abc");
     linkedHashSet.add("bca");
     linkedHashSet.add("cab");
     linkedHashSet.add("abc");
     treeSet.add("abc");
     treeSet.add("cab");
     treeSet.add("bca");
     treeSet.add("abc");
     System.out.println(hashSet);
     System.out.println(linkedHashSet);
     System.out.println(treeSet);
	}

}
