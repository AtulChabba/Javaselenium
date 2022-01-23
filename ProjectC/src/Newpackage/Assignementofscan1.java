package Newpackage;

import java.util.Scanner;

public class Assignementofscan1 {

	public int sum(int a,int b) {
		
		int c;
		c=a+b;
		return c;
			
		
	}
	public int sub(int a,int b)
	
	{
	int c;
	c=a-b;
	return c;
	}
	
	public int multi(int a,int b)
	
	{
	int c;
	c=a*b;
	return c;
	}
	
	public int divide(int a,int b)
	
	{
	int c;
	c=a/
			b;
	return c;
	}
	
	public static void main(String[] args) {
		
		Assignementofscan1 Obj = new Assignementofscan1();
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter data");
		System.out.println("Enter the value of X1 = ");
		int x1 = s.nextInt();
		
		System.out.println("Enter the value of X2 = ");
		int x2 = s.nextInt();
		
		int Additon = Obj.sum(x1, x2);
		System.out.println("Sum of x1 and x2 " +Additon);
		
		System.out.println("Enter the value of X3 = ");
		int x3 = s.nextInt();
		
		int Sub= Obj.sub(Additon, x3);
		System.out.println("Sub of Lastnumber and X3 "+Sub);
		
		System.out.println("Enter the value of x4 = ");
		int x4 = s.nextInt();
		
		int Sub2 = Obj.sub(Sub, x4);
		System.out.println("Sub of Lastnumber and x4 is = "+Sub2);
		
		System.out.println("Enter the value of x5 = ");
		int x5 = s.nextInt();
		int multiply = Obj.multi(Sub2, x5);
		System.out.println("Multi value of Lastnumber and x5 is ="+multiply);
		
		System.out.println("Enter the value of x6 = ");
		int x6 = s.nextInt();
		int divide = Obj.divide(multiply, x6);
		System.out.println("Value of Lastnumber and x6 is = "+divide);
		
		System.out.println("Completed assignment 1 using scanner class");
	
	}
}
