package Java;
                              //parent_30412-04312_child Constructor
public class ChildC extends ParentC {
	   public ChildC()
	   
	   { super(1,2);
		 System.out.println(" Child  Default  Constructor ");;
	  }
	  public ChildC(int a)
	  {   this(1,2,3);
		  System.out.println(" Child 01 parameterized Constructor ");
	  }
	  public ChildC(int a, int b)
	  {   this(1);
		  System.out.println(" Child 02 parameterized Constructor ");;
	  }
	  public ChildC(int a, int b, int c)
	  {  this(1,2,3,4);
		  System.out.println(" Child 03 parameterized Constructor ");
	  }
	  public ChildC(int a, int b, int c, int d)
	  {   this();
		  System.out.println(" Child 04 parameterized Constructor ");
	  }
    public static void main (String[]args)
    {
    	ChildC ref= new ChildC(1,2);
    }
}
