package Pkg2;

	public class Assignment3 {
	
	public Assignment3() 
	{
		this(12	, 22, 33);
	System.out.println("Default Constructor");
	}
	
	public Assignment3(int a) {
		
		this(1, 2, 3, 5);
	System.out.println("One parametrized Constructor");
	}
	
	public Assignment3(int a, int b) {
		this(a);
	System.out.println("Two parametrized Constructor");
	}
	
	public Assignment3(int a, int b, int c) {
				
	System.out.println("Three parametrized Constructor");
	}
	
	public Assignment3(int a , int b ,int c ,int d) {
		this();	
	System.out.println("Four parametrized Constructor");
	}
	
	public static void main(String[] args) {
		Assignment3 Atul = new Assignment3(22 , 33);
	}
	
}
