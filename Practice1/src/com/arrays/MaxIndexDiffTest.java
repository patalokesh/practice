package com.arrays;

public class MaxIndexDiffTest {
	 
    public static void main(String[] args) {
        int[] arr = { 7, 2, 3, 10, 2, 4,8,1 };
        System.out.println(findMaxIndexDifference(arr));
    }
 
    private static int findMaxIndexDifference(int[] arr) {
 
        // boolean to check if maximum index difference is found.
        boolean found = false;
        int max=0;
        // Iterate array in reverse order.
        for (int j = arr.length - 1; j > 0; j--) {
 
            // Iterate array till &#39;i&#39; &lt; &#39;j&#39;
            for (int i = 0; i < j; i++) {
 
                if (arr[j] > arr[i]) {
                    if(arr[j]-arr[i]>max)
                    	max=arr[j]-arr[i];
           
                }
            }
 
        }
        return max;
    }
}