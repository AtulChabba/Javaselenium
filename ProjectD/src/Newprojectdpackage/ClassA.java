package Newprojectdpackage;

public class ClassA {

	// practice of Overloading or Static Polymorphism
	
	public void method1(int a , int b)
	{	
		int c = a+b;
	
		System.out.println("Value of c" +c);
	}

	public static void main(String[] args) {
		
		ClassA obj1 = new ClassA();
		obj1.method1(20, 10);
	}
	
}
