package Java;
//parent_10234-01243_child Method
    
public class ChildM extends ParentM {
	public void method()
	
	{   super.method1(1);
		super.method(); 
		super.method2(1,2);
		super.method3(1,2,3);
		super.method4(1,2,3,4);
		System.out.println(" Child Default parameterized Method ");
	}
	public void method1(int a)
	{   this.method();
		System.out.println(" Child 01 parameterized Method");
	}	
	public void method2(int a, int b)
	{   this.method1(1);
		System.out.println(" Child 02 parameterized Method");
	}
	public void method3(int a, int b, int c)
	{  this.method4(1, 2, 3, 4);
		System.out.println(" Child 03 parameterized Method");
	}
	public void method4(int a, int b, int c , int d)
	{   this.method2(1, 2);
		System.out.println(" Child 04 parameterized Method");
	}

	public static void main(String[] args)
	{
		ChildM ref=new ChildM();
		ref.method3(1,2,3);
		
        
	}

}
