package Java;
     //parent_30412-04312_child Constructor 
public class ParentC {

  public ParentC()
  {   this(1,2,3);
	  System.out.println(" Parent Default Constructor ");
  }
  public ParentC(int a)
  {   this(1,2,3,4);
	  System.out.println(" Parent 01 parameterized Constructor ");
  }
  public ParentC(int a, int b)
  {  this(1);
	  System.out.println(" Parent 02 parameterized Constructor ");
  }
  public ParentC(int a, int b, int c)
  {
	  System.out.println(" Parent 03 parameterized Constructor ");
  }  
  public ParentC(int a, int b, int c, int d)
  {   this();
	  System.out.println(" Parent 04 parameterized Constructor ");
  }
}
