package com.numbers;
import java.util.Scanner;

public class NumberGuessing {

	public static int maxLimit;
	public static int minLimit;
	/*
	 * Constructor to initialize the maxLimit and minLimit
	 */
	public NumberGuessing()
	{
		maxLimit = 101;
		minLimit = 0;
	}

	public enum Response{
		READY,YES,END,HIGHER,LOWER,INVALID
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 'ready' to start the game!");
		Response response = NumberGuessing.getResponse(sc.nextLine());
		if(response.equals(Response.READY))
		{
			(new NumberGuessing()).isGuessedNumberFound(sc);
		}
	}
	/*
	 * Converts the entered input string into a valid Response type
	 * @param input Entered user input
	 * @return input in converted Response type
	 */
	public static Response getResponse(String input)
	{
		if(input.equalsIgnoreCase("ready"))
		{
			return Response.READY;
		}
		else if(input.equalsIgnoreCase("yes"))
		{
			return Response.YES;
		}
		else if(input.equalsIgnoreCase("end"))
		{
			return Response.END;
		}
		else if(input.equalsIgnoreCase("higher"))
		{
			return Response.HIGHER;
		}
		else if(input.equalsIgnoreCase("lower"))
		{
			return Response.LOWER;
		}
		else
			return Response.INVALID;
	}
	/*
	 * Returns the guessed number
	 * @param previousNum The previous number guessed by the system
	 * @param response The given response for the previous guessed number
	 * @return guessed number based on input parameters
	 */
	public int nextNumber(int previousNum, Response response)
	{
		if(response.equals(Response.LOWER))
		{
			maxLimit = previousNum;
		}
		else if(response.equals(Response.HIGHER))
		{
			minLimit = previousNum;
		}
		int valueIncrement = (maxLimit - minLimit)/2 ;
		return (minLimit + valueIncrement);
	}
	/*
	 * Finds the guessed number in minimum number of iterations
	 * @param sc The scanner object
	 * @returns true if the number is found successfully 
	 */
	public boolean isGuessedNumberFound(Scanner sc)
	{
		boolean isNumberFound=false;
		int number=50;
		Response response;
		do{
			System.out.println("Is the number "+number+" ?");
			response=NumberGuessing.getResponse(sc.nextLine());
			if(response.equals(Response.INVALID))
			{
				System.out.println("Please enter valid input");
			}
			else if(response.equals(Response.YES))
			{
				System.out.println("Game complete!");
				isNumberFound=true;
			}
			else if(response.equals(Response.END))
			{
				System.out.println("Game terminated!");
				break;
			}
			else if(response.equals(Response.LOWER))
			{
				if(number==1)
				{
					System.out.println("Oops! You guessed a number less than 1\nPlease guess number from 1 to 100 and start the game again");
					break;
				}
					
				number=this.nextNumber(number,response);
			}
			else if(response.equals(Response.HIGHER))
			{
				if(number==100)
				{
					System.out.println("Oops! You guessed a number higher than 100\nPlease guess number from 1 to 100 and start the game again");
					break;
				}
				number=this.nextNumber(number,response);
			}
			
		}while(!isNumberFound);
		return isNumberFound;
	}
	public static int getMaxLimit() {
		return maxLimit;
	}
	public static void setMaxLimit(int maxLimit) {
		NumberGuessing.maxLimit = maxLimit;
	}
	public static int getMinLimit() {
		return minLimit;
	}
	public static void setMinLimit(int minLimit) {
		NumberGuessing.minLimit = minLimit;
	}
	
	public int add(int a, int b)
	{
		return a+b;
	}
}

