package com.cg.lab7.exercise5;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayInteger {
	int getSecondSmallest(int array[])
	{
		//List al = Arrays.asList(array); 
		ArrayList<Integer> array1=new ArrayList<>();
		  for(int index=0;index<array.length;index++)
		  {
			  array1.add(array[index]);
		  }
		  Collections.sort(array1);
		  Object a[] = array1.toArray();
		return (int)a[1];
	}

}
