package Newpackage;

public class Inheritanceusingsuper extends Inheritanceusingthis{
	
	public Inheritanceusingsuper() {
		this(11,22);
		System.out.println("Child default constructor");
	}
	public Inheritanceusingsuper(int a) {
		this(22,22,22);
		System.out.println("Child 1 Parametrized constructor");
	}
	public Inheritanceusingsuper(int a , int b) {
		super(10,11);
		System.out.println("Child 2 Parametrized constructor");
	}
	public Inheritanceusingsuper(int a , int b , int c) {
		this();
		System.out.println("Child 3 Parametrized constructor");
	}
	
	public static void main(String[] args) {
		
		Inheritanceusingsuper objnew = new Inheritanceusingsuper(22);
	}

}
