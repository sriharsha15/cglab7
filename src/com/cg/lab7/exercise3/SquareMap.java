package com.cg.lab7.exercise3;

import java.util.HashMap;
import java.util.Map;

public class SquareMap 
{
	public Map<Integer,Integer> getSquares(int array[])
	{
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int index=0;index<array.length;index++)
		{
		 map.put(array[index],array[index]*array[index]);
		}
		return map;
	}

}
