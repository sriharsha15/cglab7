package com.cg.lab7.exercise6;

import java.util.*;

public class VoteMapMain {

	public static void main(String[] args) {
		 Map<Integer,Integer> map=new HashMap<Integer,Integer>();  
		  map.put(100,8);  
		  map.put(101,19);  
		  map.put(102,20);  
		VoteMap obj=new VoteMap();
		System.out.println(obj.votersList(map));

	}

}
