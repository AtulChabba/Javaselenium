package NewPakcage;

import java.util.Scanner;

public class Thirdassignment {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the rows");
		int abc = s.nextInt();
		
		for(int	i=1;i<=abc;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
