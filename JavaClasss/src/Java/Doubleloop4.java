package Java;

public class Doubleloop4 {

	public static void main(String[] args) {
		 

		
		 for ( int i=0; i<=5; i++)
		 {
			 for (int j=5; j>=i; j--)
			 {
				 System.out.print(" ");
			 }
			 for (int k=1; k<=i; k++)
			 {
				 System.out.print("*");
			 }
			for (int s=2; s<=i; s++)
			{
				System.out.print("*");
			}
		 System.out.println();
	}

	}}
