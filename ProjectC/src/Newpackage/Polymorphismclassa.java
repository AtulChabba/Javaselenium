package Newpackage;

public class Polymorphismclassa {
	
	public void sum(int a, int b )
	
	{
		
		int c = a+b;
		System.out.println("value of c"+c);
	}
	
	public void sum(int a , int b , int c)
	{
		int d= a+b+c;                    //////////////////Overloading
		System.out.println(d);
		
	}
	
	public static void main(String[] args) {
		
		Polymorphismclassa obj = new Polymorphismclassa();
		obj.sum(10, 20, 19);         /////////////////////////////Compile time
	}
}
