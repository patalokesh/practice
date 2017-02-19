package com.stacks;

import java.util.*;

public final class BalancedParanthesis {

    private static final Map<Character, Character> brackets = new HashMap<Character, Character>();
    static {
        brackets.put('[', ']');
        brackets.put('{', '}');
        brackets.put('(', ')');
    }  

    private BalancedParanthesis() {};

    public static String[] Braces(String[] values) {
    	String res[]=new String[values.length];
    		for (int j = 0; j < values.length; j++) {
    			if(isBalanced(values[j]))
    				res[j]="YES";
    			else
    				res[j]="NO";
    		}
    		return res;
    		}
    public static boolean isBalanced(String str) {
    	
        if (str.length() == 0) {
            throw new IllegalArgumentException("String length should be greater than 0");
        }
        // odd number would always result in false
        if ((str.length() % 2) != 0) {
            return false;
        }

        final Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (brackets.containsKey(str.charAt(i))) {
                stack.push(str.charAt(i));
            } else if (stack.empty() || (str.charAt(i) != brackets.get(stack.pop()))) {
                return false;
            } 
        }
        return true;
    } 

    public static void main(String[] args) {
    	String s[]={"{}[]()","{[}]"};
		String val[]=Braces(s);
		for (int i = 0; i < s.length; i++) {
			System.out.println(val[i]);
		}
        
    }//"{}[]()","{[}]"
}