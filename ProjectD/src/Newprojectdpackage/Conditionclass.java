package Newprojectdpackage;

import java.util.Scanner;

import javax.imageio.ImageTypeSpecifier;

public class Conditionclass {

	public static void main(String[] args) {
		
		System.out.println("Enter the value of a");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

	
		if (a>0) {
			
			if (a%2==0) {
				
				System.out.println("Even number");
				
			}
			
			else {
				System.out.println("Odd number");
			}
			
		}
		else {
			System.out.println("Please enter +ve number");
		}
	}
}
