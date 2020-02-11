package com.cg.lab7.exercise6;

import java.util.*;


public class VoteMap
{
List<Integer> votersList(Map<Integer, Integer> map)
{
	List<Integer>list=new ArrayList<>();
	 for(Map.Entry<Integer,Integer> entry:map.entrySet())
	 {
		 if(entry.getValue()>18)
		 {
			list.add(entry.getKey());
		 }
	 }
	
	 return list;
}


	
}
