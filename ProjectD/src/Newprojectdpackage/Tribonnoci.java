package Newprojectdpackage;

public class Tribonnoci {
	
	public void trib() 
	{
		int a= 0;
		int b = 1;
		int c=2;
		System.out.println("Fibnocci Series"+a);
		System.out.println("Fibnocci Series"+b);
		System.out.println("Fibnocci Series"+c);
		
		for(int i=4;i<=10;i++) {
			
			int sum = a+b+c; // 0+1+2=3
			a=b;
			b=c;
			c=sum;
			
			System.out.println("Fibnocci series "+sum);
			
			
		}
			}

	public static void main(String[] args) {
		
		Tribonnoci obj = new Tribonnoci();
		obj.trib();
	}
}
