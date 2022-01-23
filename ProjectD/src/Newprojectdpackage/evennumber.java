package Newprojectdpackage;

import java.util.Scanner;

public class evennumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a = s.nextInt();
		
		if(a%2==0) {
			System.out.println("Even number");
			
		}
		else {
			
			System.out.println("Odd number");
		}
	}
}
