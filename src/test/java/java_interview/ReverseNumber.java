package java_interview;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[]args) {
		
	int no,rev=0,r,a;
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the number ");
	
	no =sc.nextInt();
	a=no;
	while(no>0)
	{
		r = no%10;
		rev = rev*10+r;
		no=no/10;
		
	}
	System.out.println("rever"+rev);
		
	
		    String original = "Hello World";
	        String reversed = new StringBuilder(original).reverse().toString();
	        System.out.println("Reversed: " + reversed);
	        
	        String str="hi";
	        String rever = " ";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            rever += str.charAt(i);
	        }
	        System.out.println(rever);
	        
	}
	
}
