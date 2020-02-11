package com.cg.lab7.exercise7;

import java.util.Scanner;

public class ReverseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int[size];
		for(int index=0;index<size;index++)
		{
			array[index]=sc.nextInt();
		}
		Reverse obj=new Reverse();
		int array3[]=obj.getSorted(array);
        for(int index=0;index<array3.length;index++)
        {
     	   System.out.println(array3[index]);
        }
		sc.close();

	}

}
