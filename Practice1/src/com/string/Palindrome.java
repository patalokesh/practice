package com.string;

public class Palindrome {
	static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]+","");
        System.out.println("After regex: "+s);
        if(s == null || s.length() == 0 || s.length() == 1 || s.equals("") || s.equals(" "))
            return true;
        int len = s.length();
        String str1="",str2="";
        if(len%2 == 0)
            {
               str1 = s.substring(0,len/2); 
               str2 = s.substring(len/2);
            }
        else
            {
               len = (int)Math.ceil(len/2);
               str1 = s.substring(0,len); 
               str2 = s.substring(len+1);
            }
        str2 = new StringBuffer(str2).reverse().toString();
        System.out.println("String1: "+str1);
        System.out.println("String1: "+str2);
        return str1.equals(str2);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("abba"));

	}

}
