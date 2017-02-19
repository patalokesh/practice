package com.string;

public class StringToInt {
	
	public static void main(String[] args) {
		System.out.println(parseLong("+123.0"));
		/*String str="123";
		if(str.charAt(0)=='1')
		{
			System.out.println("yes");
		}*/
	
	}
	static long parseLong(String str) {
        int i = 0;
	    boolean bNeg=false;
	    if (str.charAt(0) == '-') {
	    	bNeg=true;
	    	str=str.substring(1, str.length());
	    }
	    else if(str.charAt(0) == '+')
	    {
	    	str=str.substring(1, str.length());
	    }
	    int num=0;
        try{
	    while( i < str.length()) {
            if(str.charAt(i)=='0'|| str.charAt(i)=='1' || str.charAt(i)=='2' || str.charAt(i)=='3' || str.charAt(i)=='4' || str.charAt(i)=='5'|| str.charAt(i)=='6' || str.charAt(i)=='7' || str.charAt(i)=='8'|| str.charAt(i)=='9')
            {
            num *= 10;
	        num += str.charAt(i) - '0';
            }    
            else
               throw new IllegalArgumentException("Ivalid inputs"); 
            i++;
        }
        }
            catch(Exception ex)
                {
                System.out.println(ex.getMessage());
            }

	    if (bNeg)
	        num = -num;
	    return num;

    }
	public static int strToInt(String str ){
	    int i = 0;
	    boolean bNeg=false;

	    if (str.charAt(0) == '-') {
	    	bNeg=true;
	    	str=str.substring(1, str.length());
	    }
	    else if(str.charAt(0) == '+')
	    {
	    	str=str.substring(1, str.length());
	    }
	    int num=0;
	    while( i < str.length()) {
	        num *= 10;
	        num += str.charAt(i++) - '0';
	    }

	    if (bNeg)
	        num = -num;
	    return num;
	}

}
