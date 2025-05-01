package java_interview;

import java.util.Scanner;

public class PrimeNumber 
{
	public	static boolean isPrime(int num)
	{
		for(int i=2; i<=num/2;i++) 
		{
			if(num%i ==0)
			{
				return false;
			}
			return true;
		}
		return false;
	}
	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		
		int number = sc.nextInt();
	
		if(isPrime(number))
		{
        System.out.println(number+"enter a num ");			
		}
		else 
		{
			System.out.println(number+" is not primenum");
		}
	}

	
}	


