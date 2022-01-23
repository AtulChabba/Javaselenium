package Pkg2;

public class Constructorclass {
	
	public Constructorclass() {
		
		System.out.println("Default contructor");
	}

	

	public Constructorclass(int a) {
		
		System.out.println("One parametrized contructor");
	}
	

	public Constructorclass(int a,int b) {
		
		this();
		System.out.println("Two parametrized contructor");
	}
	
	public static void main(String[] args) {
		
		Constructorclass Atulobj = new Constructorclass();
		Constructorclass Atul1obj = new Constructorclass(22);
		Constructorclass Atul2obj = new Constructorclass(22 , 222);

		
	}
	
}
