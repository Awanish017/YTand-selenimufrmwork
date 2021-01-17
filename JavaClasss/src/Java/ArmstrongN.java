package Java;

import java.util.Scanner;

public class ArmstrongN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 System.out.println( " Enter the number");
		 int number=s.nextInt();
		 //number=153;  

    int b =0;
    int a;
    int t;
     t=number;
     while (number>0)
     {
    	 a=number%10;
    	 number=number/10;
    	 b=b+(a*a*a);
     }
    if (t==b)
    	 System.out.println( " Armstrong number");
    else 
    	 System.out.println( " Not Armstrong number");
	}

}
