package Pkg2;

public class Methodclass {
	
	public void m1()
	{
		System.out.println("Default Parametrized");
		
	}
	public void m2() {
		
		this.m4();
		this.m5();
		this.m1();
	System.out.println("one parameterized");
		this.m3();
	}

	public void m3() {
		
		System.out.println("two parametrized");
	}
	public void m4() {
		
		System.out.println("three parametrized");
	
	}
	public void m5() {
		
		System.out.println("four parametrized");
	}
	
	public static void main(String[] args) {
		
		Methodclass obj = new Methodclass();
		obj.m2();
		
	}
	
}
