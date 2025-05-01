package java_interview;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the first num ");
		int a =sc.nextInt(); //or
		//int a =5;
		System.out.println("Enter the second num ");
		int b= sc.nextInt(); //or
//		int b=10;
		
		System.out.println("Before swapping: a ="+a+", b= "+b);
		a= a+b; //5+10=15
		b= a-b; //15-10=5
		a= a-b; //15-5=10
		System.out.println("After swapping: a= "+a+", b ="+b);
				
				
	}
	
}
