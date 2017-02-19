package com.string;

import java.util.ArrayList;
import java.util.HashSet;

public class ShortenString {

	static String subShortenString(String inp){
		HashSet<Character> hsChar=new HashSet<Character>();
		int count=0;
		for (int i = 1; i < inp.length()-1; i++) {
			if(!hsChar.contains(inp.charAt(i)))
				count++;
			hsChar.add(inp.charAt(i));
		}
		String output=String.valueOf(inp.charAt(0))+count+String.valueOf(inp.charAt(inp.length()-1));
		return output;
	}


	static String shortenString(String input)
	{
		char[] charArray = input.toCharArray();
		ArrayList<String> strArray =  new ArrayList<String>();
		StringBuilder tmp = new StringBuilder();

		for (int i=0; i<charArray.length;i++){
			if(Character.isLetter(charArray[i])){
				tmp.append(charArray[i]);
			}else{
				if(tmp.length()!=0){
					strArray.add(tmp.toString());
				}
				strArray.add(Character.toString(charArray[i]));
				tmp.setLength(0);
			}
		}
		if(tmp.length()!=0){
			strArray.add(tmp.toString());
		}
		String output="";
		for (int i = 0; i < strArray.size(); i++) {
			if(!strArray.get(i).matches("[a-zA-Z]+"))
				output=output+strArray.get(i);
			else
				output=output+subShortenString(strArray.get(i));
		}
		return output;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(shortenString("Lokesh is a good boy"));

	}


}
