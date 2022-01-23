package Newprojectdpackage;

public class Fibnocciseries {

	public void fibnocci()
	
	{
		int a = 0;
		int b = 1;
		System.out.println("Fibnocci Series"+a);
		System.out.println("Fibnocci Series"+b);

		int sum;
		
		for(int i = 1;i<=10;i++)
		{
		sum = a+b;  // 0+1=1 // 2  // 3  // 
		a=b;    // 1  // 1  // 2
		b=sum;  // 1  // 2  //3
		System.out.println("Fibnocci series " + sum);

			
		}
		
	}
	public static void main(String[] args) {
		Fibnocciseries obj = new Fibnocciseries();
		obj.fibnocci();
	}
}
