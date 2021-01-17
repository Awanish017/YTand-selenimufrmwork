package Java;

import java.util.Scanner;

//   ((((x1+x2)-x3)*x4)+x5)/x6)
public class Scn {
	
	public int sum(int x1, int x2)
	{
		int c= x1+x2;
		return c; 
	}
	public int sub(int x1, int x3)
	{
		int c= x1-x3;
		return c; 
	}
	public int mult(int x1, int x4)
	{
		int c= x1*x4;
		return c; 
	}
	public void div(int x1, int x6)
	{
		int c= x1/x6;
	    System.out.println("Final resutlt is "  +c); 
	}
	public static void main(String[] args) {
		
		System.out.println("((((x1+x2)-x3)*x4)+x5)/x6)");
		Scanner s= new Scanner(System.in);
		
		System.out.println("Please enter the value of x1  ");
		int x1= s.nextInt(); 
		System.out.println("Please enter the value of x2  ");
		int x2=s.nextInt();
		System.out.println("Please enter the value of x3  ");
		int x3=s.nextInt();
		System.out.println("Please enter the value of x4  ");
		int x4=s.nextInt();
		System.out.println("Please enter the value of x5  ");
		int x5=s.nextInt();
		System.out.println("Please enter the value of x6  ");
		int x6=s.nextInt();
	
		Scn obj= new Scn();
		int sum= obj.sum(x1, x2);        System.out.println(sum);
		int sub=obj.sub(sum, x3);        System.out.println(sub);
		int mult=obj.mult(sub, x4);      System.out.println(mult);
		int sum1=obj.sum(mult, x5);      System.out.println(sum1);
		 obj.div(sum1, x6); 
		
		
		
	}

}
