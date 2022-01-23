package Newprojectdpackage;

import java.util.Scanner;

public class Palidromenumber {
	
		public void palinderom(int number)
		
		{
			int oddnumber = number;
			int sum = 0;
			
			while(number>0)
			{
				int r = number%10;  // 121%10 = 1 // 2 // 1
				sum = sum*10+r;    // 1  // 12  // 121
				number=number/10;  // 12 // 1  // 0
				
			}
			if (sum==oddnumber) {
				System.out.println("Number is palindromne");
			}
			else 
			{
				
				System.out.println("Number is not palindrome");
			}
			
		}
		
		public static void main(String[] args) {
			Palidromenumber obj = new Palidromenumber();
			obj.palinderom(121);
			obj.palinderom(2223);
		}
}
		
	

	
		
 


