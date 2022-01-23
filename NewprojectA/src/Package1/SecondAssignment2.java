package Package1;

public class SecondAssignment2 {
	
	public int divide(int a,int b)
	{
		int c;
		c=a/b;
		return c;
	}

	public int sub(int d,int e)
	{
	
		int f;
		f=d-e;
		return f;
	}
	
	public int sum(int m,int n)
	{	
		int o;
		o=m+n;
		return o;
	}
	
	public void multiply(int x,int y)
	{
		int z;
		z=x*y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		
		SecondAssignment2 Atulobj = new SecondAssignment2();
		int Divideresult = Atulobj.divide(10, 2);
		System.out.println(Divideresult);
		int subresult = Atulobj.sub(Divideresult, 2);
		System.out.println(subresult);
		int sumresult = Atulobj.sum(subresult, 2);
		System.out.println(sumresult);
		int subresult2 = Atulobj.sub(sumresult, 2);
		System.out.println(subresult2);
		Atulobj.multiply(subresult2, 2);
	}
}

