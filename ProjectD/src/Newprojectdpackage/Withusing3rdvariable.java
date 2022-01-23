package Newprojectdpackage;

import java.util.Scanner;

public class Withusing3rdvariable {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a , b");
		int a = s.nextInt();
		int b = s.nextInt();
		int c;
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("After swapping value of a "+a);
		System.out.println("After swapping value of a "+b);


		
}
}
