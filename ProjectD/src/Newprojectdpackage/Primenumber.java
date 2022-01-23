package Newprojectdpackage;

import java.util.Scanner;

public class Primenumber {
	
	public void prime(int number) 
	{
		int half = number/2; // 15
		int atul=0;
		for(int i=2;i<=half;i++)
			
		{
			if(number%2==0)
			{				
				atul=1;
				break;
				
			}
		
		}
		if (atul==0)
		{
			
			System.out.println("Number is prime" + number);
		}
		else {
			System.out.println("Number is not prime" + number);
		}
		
	}
	
	public static void main(String[] args) {
		Primenumber obj = new Primenumber();
		
		obj.prime(30);
		obj.prime(13);
	}
	
}
	