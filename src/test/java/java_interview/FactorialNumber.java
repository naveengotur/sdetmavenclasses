package java_interview;

import java.util.Scanner;

public class FactorialNumber {
public static void main(String[]args) {
	
	int fac=1;
	Scanner sc= new Scanner(System.in);
	int num =sc.nextInt();
	
	for(int i=1; i<=num; i++)
	{
		fac = fac *i;
	}
	System.out.println(fac);
}
}
