package Newpackage;

public class staticclass {

	
	static int deepak;  //global variable
	
	public static void incre()
	
	{
		
		deepak = deepak+1;
	}
	
	public static void main(String[] args) {
		
		System.out.println("********First object*********");
		/*staticclass obj1 = new staticclass();
		obj1.incre();
		System.out.println(obj1.deepak);*/
		
		staticclass.incre();
		System.out.println(staticclass.deepak);
		
		System.out.println("********Second object********");
		staticclass obj2 = new staticclass();
		obj2.incre();
		System.out.println(obj2.deepak);
		
		System.out.println("********Third object********");
		staticclass obj3 = new staticclass();
		obj3.incre();
		System.out.println(obj3.deepak);
		
	} 
	
	

}
