package Newpackage;

public class ClassBusingthis extends ClassAUsingsuper {

	public void Cdefault1()
	{
		System.out.println("Child Default Method");
	}
	public void CPara1() 
	{
		super.Para3();
		super.default1();
		super.Para1();
		super.Para2();
		super.Para4();
		this.CPara3();
		this.CPara2();
		this.Cdefault1();
		this.CPara4();
		System.out.println("Child 1 Parametrized method");
	}
	public void CPara2() 
	{
		System.out.println("Child 2 Parametrized method");
	}
	public void CPara3()
	{
		System.out.println("Child 3 Parametrized method");
	}
	public void CPara4()
	{
		System.out.println("Child 4 Parametrized method");
	}
	
	public static void main(String[] args) {
		
		ClassBusingthis obj = new ClassBusingthis();
		obj.CPara1();
		
	}
}

