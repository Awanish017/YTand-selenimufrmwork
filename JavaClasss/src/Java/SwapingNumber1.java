package Java;

public class SwapingNumber1 {

	public static void main(String[] args) {
System.out.println("SWAPING NUMBER Without USING THIRD VARIABLE");
		
		int a=10;  int b= 20;
		System.out.println("Before swaping a= " +a);
		System.out.println("Before swaping b= " +b);
		
		a= a+b; System.out.println("After a+b value of a= "+a);
		b= a-b; 
		a=a-b;   
		
		System.out.println("After swaping a= " +a);
		System.out.println("After swaping b= " +b); 

	}

}
