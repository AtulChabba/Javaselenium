package Newpackage;

public class Inheritanceusingthis {

	public Inheritanceusingthis() {
		this(10,22,22);
		System.out.println("Parent Default constructor");
	}
	public Inheritanceusingthis(int a) {
		this();
		System.out.println("Parent 1 Parametrized constructor");
	}
	
	public Inheritanceusingthis(int a, int b) {
		this(11);
		System.out.println("Parent 2 Parametrized constructor");
	}
	public Inheritanceusingthis(int a ,int b , int c) {
	System.out.println("Parent 3 Parametrized constructor");
	}

}
