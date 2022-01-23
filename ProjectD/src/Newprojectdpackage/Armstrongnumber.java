package Newprojectdpackage;

public class Armstrongnumber {
	
	public void arm(int number)
	
	{
		int evennumber = number;
		int r;
		int sum = 0;
		
		while(number>0)
			
		{
			r = number%10;      // 153%10 = 3  //5  // 1
			sum = sum+r*r*r;    // 27  // 152   // 153
			number = number/10; // 15  // 1  // 0
			
		}
		if (evennumber==sum) {
			System.out.println("Number is armstrong " +evennumber);
			
		}
		else
		{
			System.out.println("number is not armstrong");
		}
	}
	public static void main(String[] args) {
		Armstrongnumber obj = new Armstrongnumber();
		obj.arm(153);
	}

}
