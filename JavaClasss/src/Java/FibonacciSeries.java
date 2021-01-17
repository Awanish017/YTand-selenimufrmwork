package Java;

public class FibonacciSeries {
        
	public static void main(String[] args) 
	{  System.out.println("Fibonaci Series ");
      int a= 0, b=1; 
      
        for (int i=1; i<=20; i++)
        {
        	 int c= a+b; System.out.println(c);
        	 a=b;
        	 b=c;
        }


	}

}
