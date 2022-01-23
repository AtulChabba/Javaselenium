package Newprojectdpackage;

import java.util.Scanner;

public class Elseifclass {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the marks");
		Scanner s = new Scanner(System.in);
		int marks = s.nextInt();
		
		if ((marks>=0)&&(marks<35))
		{
			System.out.println("Fail");
		}
		else if ((marks>=35)&&(marks<50)) {
			
			System.out.println("2nd division");
			
		}
		else if ((marks>=50)&&(marks<80)) {
			
			System.out.println("1st divison");
		}
		else if ((marks>=80)&&(marks<=100)) {
			
			System.out.println("Merit");
		}
		else {
			System.out.println("please enter correct marks");
		}
	}

}

