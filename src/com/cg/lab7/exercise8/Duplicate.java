package com.cg.lab7.exercise8;

import java.util.Iterator;
import java.util.TreeSet;

public class Duplicate 
{
public int[] modifyArray(int array[])
{
	TreeSet<Integer> set=new TreeSet<Integer>();
	for(int index=0;index<array.length;index++) 
	{
		set.add(array[index]);
	}
	int index=0;
	int result[]=new int[set.size()];
	Iterator<Integer> itr=set.descendingIterator();  
	  while(itr.hasNext())
	  {  
	   result[index++]=itr.next(); 	
}
	  return result;
}
}
