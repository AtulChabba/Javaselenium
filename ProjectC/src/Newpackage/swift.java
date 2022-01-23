package Newpackage;

public class swift extends Maruti{
	
	public void Model() {
		
		System.out.println("Model is swift");
		
	}

	public static void main(String[] args) {
		
		swift atulobj = new swift();
		atulobj.Baseprice();
		atulobj.Model();
		atulobj.price=333;
		System.out.println("Price of swift is "+atulobj.price);
	}
}
