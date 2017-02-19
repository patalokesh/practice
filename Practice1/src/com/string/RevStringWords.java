package com.string;

public class RevStringWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(reverseWords("the sky is blue"));

	}
	public static String reverseWords(String s) {
        String[] sList=s.split(" ");
        String srev="";
        for(int i=sList.length-1;i>=0;i--)
        {
            if(srev=="")
                srev=sList[i];
            else
                srev=srev+" "+sList[i]; 
        }
        return srev;
    }

}
