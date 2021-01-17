package Java;

public class Day3 {
	
	
	public Day3()
	{   
		this(1,2,3,4);
		
		System.out.println("Default Constructor" );
	}
	

	public Day3(int a)
	{    this();
		System.out.println(" 1 Parametrized Constructor" );
	}

	public Day3(int a, int b)
	{  this(1);
		System.out.println(" 2 Parametrized Constructor" );
	}

	public Day3(int a, int b, int c)
	{   this(1,2);
		System.out.println(" 3 Parametrized Constructor" );
	}

	public Day3(int a, int b, int c, int d)
	{   
		System.out.println(" 4 Parametrized Constructor" );
	}
	public static void main(String[] args) {
		
		Day3 ref=new Day3(7,6,8);
		
	}
}
