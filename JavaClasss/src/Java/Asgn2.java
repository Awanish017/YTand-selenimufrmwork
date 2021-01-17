package Java;

public class Asgn2 {
	
	public void method()
	{   this.method3();
		System.out.println(" Default Method ");
	}
	public void method1()
	{   this.method();
		System.out.println(" 1 Method ");
	}
	public void method2()
	{   this.method1();
		System.out.println(" 2 Method ");
	}
	public void method3()
	{
		System.out.println(" 3 Method ");
	}
	public void method4()
	{   this.method2();
		System.out.println(" 4 Method ");
	}
   public static void main(String []args) 
   {

     Asgn2 ref=new Asgn2();
     ref.method4();

	}
}
