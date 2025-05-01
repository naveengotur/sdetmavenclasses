package java_interview;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a num");
		int number = sc.nextInt(); //or
//		int number = 6;
		
		int first =0, second=1, next;
		System.out.println("fibonacci series is ");
		
		for(int i=0; i<=number; i++)
		{
			System.out.println(first+"");
			next = second+first;
			first =second;
			second=next;
		}
		
	}
}
