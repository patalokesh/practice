package com.numbers;

public class Divison {
	
	static int division(int x, int y)
	{
	    int div = 0;
	    for(int i=0; x>y && x>0 && y>0; i++)
	    {
	        x=x-y;
	        div++;     
	    }
	    return div;
	}
	static int divide(int dividend, int divisor)
	{
        int sign = 0;
	    if((dividend<0 && divisor>0)||(dividend>0 && divisor<0))
	    	sign = -1;
	    long dividend1 = Math.abs((long)dividend);
	    long divisor1 = Math.abs((long)divisor);
		int power = 32;
	    long ypower = divisor1<<power;
	    long result = 0;
	    while(dividend1>=divisor1)
	    {
	        while(ypower > dividend1)
	        {
	            power--;
	            ypower >>>=1;
	        }
	        dividend1 -= ypower;
	        result += 1L<<power;
	    }
	    if(result > Integer.MAX_VALUE)
	        return sign==-1? Integer.MIN_VALUE: Integer.MAX_VALUE;
	    int res = (int) (sign==-1? -result: result);
	    return res;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(division(9, 2));
		System.out.println(divide(-2147483648, -2147483648));
		System.out.println(divide(12, 12));

	}

}
