package com.cg.lab7.exercise4;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {
	HashMap<Integer,String> getStudents(HashMap<Integer,Integer>map)
	{
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		  for(Map.Entry<Integer,Integer> me:map.entrySet())
		  {
			  if(!map1.containsKey(me.getKey()))
			  {
				 if(me.getValue()>=90)
				 {
					 map1.put(me.getKey(), "Gold");
				 }
				 else if(me.getValue()>=80 && me.getValue()<90)
				 {
					 map1.put(me.getKey(), "Silver");
				 }
				 else if(me.getValue()>=70 && me.getValue()<80)
				 {
					 map1.put(me.getKey(),"Bronze");
				 }
			  }  
		  }
		  
		return map1;
	}

}
