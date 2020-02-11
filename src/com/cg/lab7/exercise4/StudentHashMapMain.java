package com.cg.lab7.exercise4;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		map.put(1109450,99);
		map.put(11606712,70);
		map.put(11608248,83);
		StudentHashMap obj=new StudentHashMap();
		HashMap<Integer,String> map1=obj.getStudents(map);
		 for(Map.Entry<Integer,String> me:map1.entrySet())
	    	{
	        	System.out.print("\'"+me.getKey()+"\':"+me.getValue()+" ,");
	    	}
	       	

	}

}
