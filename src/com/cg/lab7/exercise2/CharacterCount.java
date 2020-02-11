package com.cg.lab7.exercise2;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount 
{
public Map<Character,Integer> countCharacter(char chars[])
{
	Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
	for(int index=0;index<chars.length;index++)
	{
		if(map.containsKey(chars[index]))
		{
			map.put(chars[index],map.get(chars[index])+1);
		}
		else
		{
			map.put(chars[index],1);
		}
	}
	
	
	return map;
}
}
