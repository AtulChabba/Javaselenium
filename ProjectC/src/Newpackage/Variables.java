package Newpackage;

public class Variables {

		 int atul; //global variable
		 
		 public void m1(int atul) //deep is local variable
		 {
			 
			this.atul=atul;
			 
		 }
		 public static void main(String[] args) {
			
			 Variables atulobj = new Variables();
			 atulobj.m1(123);
			 System.out.println("Value of Atul " + atulobj.atul);
		}
		 
		 
}



