package com.cg.lab7.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortHashMap
{
public List<Integer> getValues(HashMap<Integer,Integer> hm)
{
	List<Integer> list=new ArrayList<Integer>();
	for(Map.Entry<Integer,Integer> me:hm.entrySet())
	{
		list.add(me.getValue());
	}
	Collections.sort(list);
	return list;
	
}
}
