package com.cg.lab7.exercise2;

import java.util.Map;
import java.util.Scanner;

public class CharacterCountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		char chars[]=new char[size];
		for(int index=0;index<size;index++)
		{
			chars[index]=sc.next().charAt(0);
		}
		
        CharacterCount obj=new CharacterCount();
        obj.countCharacter(chars);
        Map<Character,Integer> map=obj.countCharacter(chars);
        for(Map.Entry<Character,Integer> me:map.entrySet())
    	{
        	System.out.print("\'"+me.getKey()+"\':"+me.getValue()+" ,");
    	}
        sc.close();
	}

}
