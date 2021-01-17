package Java;
   
import java.util.Scanner;
       // factorial number 5! =1*2*3*4*5 == 120 
public class Factorial {

	public static void main(String[] args) {
	   Scanner s= new Scanner(System.in);
	   System.out.println("Enter the number");
	   int a=s.nextInt();
	   int f= 1; 
	   for (int i=1; i<=a; i++)
	   {
		   f=f*i;
		  
	   }
	   System.out.println("Factorial is " +f);
	}

}
