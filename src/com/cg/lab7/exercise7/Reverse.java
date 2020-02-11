package com.cg.lab7.exercise7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Reverse {
	  int[] getSorted(int array[])
	{
		StringBuffer str[]=new StringBuffer[array.length];
		for(int index=0;index<array.length;index++)
		{
			str[index]=new StringBuffer(""+array[index]);
			str[index].reverse();
		}
		int  array1[]=new int[array.length];
		for(int index=0;index<array.length;index++)
		{
			array1[index]=Integer.parseInt(str[index].toString());
		}
		ArrayList<Integer> array2=new ArrayList<Integer>();
		for(int index=0;index<array.length;index++)
		  {
			  array2.add(array1[index]);
		  }
		  Collections.sort(array2);
		  int index=0;
		  int array3[]=new int[array2.size()];
		  Iterator<Integer> itr=array2.iterator();
		  while(itr.hasNext())
		  {
			  array3[index++]=itr.next();		  }
		  
			return array3 ;
	}
  
}
