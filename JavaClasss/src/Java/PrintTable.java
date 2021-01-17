package Java;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the number which you want to print table");
        int number=s.nextInt();
           
        for(int i=1; i<=10; i++)
        {
        	System.out.println(number + "*" +i+"="+number*i);
        }
	}

}
