package Package1;

public class Arithmetic {

	public int sum(int a,int b)
	{
		
		int c;
		c=a+b;
		System.out.println("Sum result of "+c);
		return c;
			
	}
	public int sub(int x,int y)
	
	{
		int z;	
		z=x+y;
		System.out.println("Sub result of "+z);
		return z;	
	}
	public void multi(int a1,int a2)
	{
		
		int a3;
		a3 = a1*a2;
		System.out.println("Final result is "+a3);
	}
	public static void main(String[] args) {
		
		Arithmetic atul=new Arithmetic();
		int Sumresult = atul.sum(12, 2);
		int Subresult = atul.sub(12, 2);
		atul.multi(Sumresult, Subresult);
	}
}
