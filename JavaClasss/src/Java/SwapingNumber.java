package Java;
             
public class SwapingNumber {
	
	public static void main(String[] args) {
		
		System.out.println("SWAPING NUMBER USING THIRD VARIABLE");
		
		int a=10;  int b= 20;
		System.out.println("Before swaping a= " +a);
		System.out.println("Before swaping b= " +b);
		
		int c= a;
		a=b; 
		b=c;
		
		System.out.println("After swaping a= " +a);
		System.out.println("After swaping b= " +b); 
		
	}

}
