package com.cg.lab7.exercise1;

import java.util.HashMap;

public class SortHashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		hm.put(1,4);
		hm.put(1,2);
		hm.put(2,3);
		hm.put(3,8);
		hm.put(4,9);
		hm.put(5,15);
		SortHashMap obj=new SortHashMap();
		System.out.println(obj.getValues(hm));

	}

}
