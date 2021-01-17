package Java;

public class Doubleloop6 {

	public static void main(String[] args) {
	  int a =0;
	  int i, j; 
	  
       for (i=1; i<=4; i++)
       {
    	 for (j=1; j<=i; j++)
    	 {
    		 a=a+1; 
    		 System.out.print(a +" ");
    	 }
    	 System.out.println();
       }
       
	}

}
