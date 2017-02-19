package com.string;

public class StringCompress {
	
	public static String compress(String str) {
	    if (str.isEmpty()) {
	        return "";
	    }

	    char[] chars = str.toCharArray();
	    StringBuilder builder = new StringBuilder();

	    int count = 1;
	    char prev = chars[0];
	    for (int i = 1; i < chars.length; i++) {
	        char current = chars[i];
	        if (current == prev) {
	            count++;
	        } else {
	            builder.append(prev).append(count);
	            count = 1;
	        }
	        prev = current;
	    }
	    return builder.append(prev).append(count).toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compress("aabccde"));
	}

}
