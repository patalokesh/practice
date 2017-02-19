package com.arrays;

public class Concurancy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={2,1,0,0,0};
		System.out.println(solution(A));

	}
	public static int solution(int A[]) {
	    int n = A.length;
	    int result = 0;
	    //int i;
	    for (int i = 0; i < (n - 1); i++) {
	        if (A[i] == A[i + 1])
	            result = result + 1;
	    }
	    
	    int r = 0;
	    for (int i = 0; i < n; i++) {
	    	int count = 0;
	    	
	        if (i > 0) {
	            if (A[i - 1] != A[i] && ((A[i]==1||A[i-1]==0)||A[i]==0||A[i-1]==1))
	                count = count + 1;
	            else
	                count = count - 1;
	        }
	        if (i < n - 1) {
	            if (A[i + 1] != A[i]&& ((A[i]==1&&A[i+1]==0)||A[i]==0&&A[i+1]==1))
	                count = count + 1;
	            else
	                count = count - 1;
	        }
	        r = Math.max(r, count);
	    }
	    return result + r;
	}

}
