package Newpackage;

public class ClassAoveriding extends ClassDoverriding{
	
	public void arithmetic(int a , int b)
	
	{
		int c = a*b;
		System.out.println("Value of c" +c);
		
	}

	public static void main(String[] args) {
	ClassAoveriding obj = new ClassAoveriding();
	obj.arithmetic(10, 20);
}
}
