package java_interview;

import java.util.Scanner;

public class ArmStrongNumber {
public static void main(String[]args)
{
	int arm=0, a, b, c, d, no;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the num ");
	no = sc.nextInt();
	d=no;
	while(no>0)
	{
		a=no%10;
		no=no/10;
		arm=arm+a*a*a;
		
	}
	if(arm==d)
	{
		System.out.println("Armstrongnum:");
	}
	else {
		System.out.println("Not Armstrongnum");
	}
	
}
}
