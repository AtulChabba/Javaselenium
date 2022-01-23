package Newpackage;

import java.util.Scanner;

public class Assignmentofscan2 {
	
	public int multiply(int a , int b)
	{
		int c;
		c=a*b;
		return c;
		
	}
	public int Add(int a , int b)
	{
		int c;
		c=a+b;
		return c;
		
	}
	public int Sub(int a , int b)
	{
		int c;
		c=a-b;
		return c;
		
	}
	public int divide(int a , int b)
	{
		int c;
		c=a/b;
		return c;
		
	}
	
	public static void main(String[] args) {
		
		Assignmentofscan2 Atulobj = new Assignmentofscan2();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x1 = ");
		int x1 = s.nextInt();
		
		System.out.println("Entere the value of x2 = ");
		int x2 = s.nextInt();
		
		int multiresult = Atulobj.multiply(x1, x2);
		System.out.println("Multiply value of X1 and x2 is " + multiresult);
		
		System.out.println("Enter the value of x3 = ");
		int x3 = s.nextInt();
		int addition = Atulobj.Add(multiresult, x3);
		System.out.println("Sum of lastvalue + x3 is =" + addition);
		
		System.out.println("Enter the value of x4 = ");
		int x4 = s.nextInt();
		int againaddition = Atulobj.Add(addition, x4);
		System.out.println("Sum of last value + x4 is =" +againaddition);
		
		System.out.println("Enter the value of x5");
		int x5 = s.nextInt();
		int subtract = Atulobj.Sub(againaddition, x5);
		System.out.println("Sub result of lastvalue - x5 is ="+subtract);
		
		System.out.println("Enter the value of x6");
		int x6 = s.nextInt();
		int divide = Atulobj.divide(subtract, x6);
		System.out.println("division of last value + x6 is = "+divide);
		
		System.out.println("Completed assignment 2 using scanner class");
		
		
		
	}
}
