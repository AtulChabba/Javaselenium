package Package1;

public class StudentAssignment{

	int rollno;
	int age;
	
	public void Method1()
	{
		System.out.println("Welcome to all of you");
		
	}
	public void Method2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		
		
		StudentAssignment atul=new StudentAssignment();   //Object creation
		atul.age=27;
		System.out.println(atul.age);
		atul.rollno=10;
		System.out.println(atul.rollno);
		atul.Method1();
		atul.Method2();
		
	}
	}





	
