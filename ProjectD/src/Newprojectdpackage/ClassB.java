package Newprojectdpackage;

public class ClassB extends ClassA{
	
	public void method1(int a , int b)
	{	
		int c = a*b;
	
		System.out.println("Value of c" +c);
	}
	public static void main(String[] args) {
		
		ClassB obj = new ClassB();
		obj.method1(10, 30);
	}
}
