package Newprojectdpackage;

import java.util.Scanner;

public class Withoutusing3rdvariable {
	
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value of a , b");
	int a = s.nextInt();
	int b = s.nextInt();
	
	a=a+b;    // 10+20 =30
	b=a-b;    // 30-20 = 10
	a=a-b;	  // 30-10 = 20
	
	System.out.println("After swapping value of a" +a);
	System.out.println("After swapping value of a" +b);

	
	
}
}
