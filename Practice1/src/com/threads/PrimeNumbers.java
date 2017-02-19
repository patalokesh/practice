package com.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PrimeNumbers {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable runner = new MyRunnable(100);
		Thread t1 = new Thread(runner);
		t1.start();

		//System.out.println("Number of primes:"+t1.count);

	}

}
class MyRunnable implements Runnable{
	static int num;
	static int nextNumber = 3;
	public static long[] primes = new long[num]; 
	int count = 0;
	public MyRunnable(int num)
	{
		this.num = num;
	}
	synchronized int getNextNumber() {
		int n = nextNumber;
		nextNumber +=2;
		return n;
	} 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int myNumber=getNextNumber();
		while (myNumber <= num) {

			if (prime(myNumber)) {
				//primes[count] = myNumber;
				count++;
			}
			myNumber=getNextNumber();
		}

	}

	public boolean prime(int n)
	{
		for (int i=3; i * i<=n; i+=2)
			if (n%i==0) return false;
		return true;
	}

}