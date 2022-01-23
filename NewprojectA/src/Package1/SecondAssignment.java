package Package1;

public class SecondAssignment {

	
		public int multiply(int a,int b)
		
		{
			int c;
			c=a*b;
			return c;
			
		}
		public int sum(int d,int e)
		
		{
			int f;
			f=d+e;
			return f;
		}
		public int sub(int m,int n)
		
		{
			int o;
			o=m-n;
			return o;
		}
		public int divide(int x,int y)
		{
			int z;
			z=x/y;
			return z;
		}
		public static void main(String[] args) {
			
			SecondAssignment Atulobj= new SecondAssignment();
			
			int Multiresult =Atulobj.multiply(10, 2);
			System.out.println(Multiresult);
			int Sumresult = Atulobj.sum(Multiresult, 2);
			System.out.println(Sumresult);
			int Sumresult1 = Atulobj.sum(Sumresult, 2);
			System.out.println(Sumresult1);
			int Subresult = Atulobj.sub(Sumresult1, 2);
			System.out.println(Subresult);
			int Divresult = Atulobj.divide(Subresult, 2);		
			System.out.println(Divresult);
			
		}
		
		
}
