package com.cg.lab7.exercise3;

import java.util.Map;
import java.util.Scanner;

public class SquareMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int[size];
		for(int index=0;index<size;index++)
		{
			array[index]=sc.nextInt();
		}
		SquareMap obj=new SquareMap();
		Map<Integer,Integer> map=obj.getSquares(array);
        for(Map.Entry<Integer,Integer> me:map.entrySet())
    	{
        	System.out.print("\'"+me.getKey()+"\':"+me.getValue()+" ,");
    	}
        sc.close();

	}

}
