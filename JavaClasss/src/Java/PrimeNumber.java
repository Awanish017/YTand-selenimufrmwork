package Java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
	{
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the numbeer");
        int no=s.nextInt();
      
       
  
        	 if (no==0 || no==1)
        	 {
        		 System.out.println(" npt prime number");
        	 }
        	 else
        	 {  
        		 for(int i=2; i<=no; i++) 
        		 {
             
            	 if (no%2==0)
             {
            		 System.out.println( " not prime number");
        		
        	 } 
            	 else
            	 {
            		 System.out.println( "  prime number");
            	 }
        
        		 }
        		 }
        	 }
	}
        	 


