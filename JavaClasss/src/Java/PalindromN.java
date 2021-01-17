package Java;

import java.util.Scanner;

public class PalindromN {

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		 System.out.println( " Enter the number ");
		int n= s.nextInt();
		int x; 
		int mult =0;
		int t;
		//int n= 111;
		 t=n;
		 while(n>0) {
			 x=n%10;
			 mult=(mult*10)+x;
			 n=n/10;
		 }
		 if (t==mult)
		 {
			 System.out.println("palidrome number");
		 }
		 else 
		 {
			 System.out.println( " not palidrome number");
		 }
	}

}
