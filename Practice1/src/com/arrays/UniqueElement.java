package com.arrays;
import java.util.*;
public class UniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(10);
		list.add(5);
		list.add(30);
		list.add(7);
		list.add(9);
		list.add(2);
		list.add(4);
		
		printPairsOfSumK(list,8);
	}
	//inp= {1 10 5 30 7 9 2 4}, k= 8
	static void printPairsOfSumK(List<Integer> inp, int k)
	{
		HashSet<Integer> tempHs = new HashSet<Integer>();
		for(Integer eachInp: inp)
		{
			if(!tempHs.contains(eachInp) && eachInp!=(k-eachInp) && inp.contains(k-eachInp))
			{
				System.out.println("Pair is:"+String.valueOf(eachInp)+","+ String.valueOf(k-eachInp));
				tempHs.add(k-eachInp);
			}

		}
	}


}
