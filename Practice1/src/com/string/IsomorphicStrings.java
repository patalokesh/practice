package com.string;

public class IsomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIsomorphic("egg", "foo"));

	}
	public static boolean isIsomorphic(String s, String t) {
        if(s.length()==t.length())
        {
            int count1=1;
            int count2=1;
            for(int i=1;i<s.length();i++)
            {
                if(s.charAt(i)==s.charAt(i-1))
                count1++;
                else
                count1=1;
                if(t.charAt(i)==t.charAt(i-1))
                count2++;
                else
                count2=1;
                if(count1!=count2)
                return false;
            }
            return true;
        }
        else
        return false;
    }

}
