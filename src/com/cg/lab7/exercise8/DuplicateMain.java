package com.cg.lab7.exercise8;

import java.util.Scanner;

public class DuplicateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int[size];
		for(int index=0;index<array.length;index++)
		{
			array[index]=sc.nextInt();
		}
		Duplicate obj=new Duplicate();
		int result[]=obj.modifyArray(array);
		for(int index=0;index<result.length;index++)
		{
			System.out.println(result[index]);
		}
		
		sc.close();

	}

}
