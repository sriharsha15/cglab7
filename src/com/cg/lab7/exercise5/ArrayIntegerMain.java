package com.cg.lab7.exercise5;

import java.util.Scanner;

public class ArrayIntegerMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int [size];
		for(int index=0;index<array.length;index++)
		{
			array[index]=sc.nextInt();
		}
		ArrayInteger obj=new ArrayInteger();
		System.out.println(obj.getSecondSmallest(array));
        sc.close();
	}

}
