package Java;
         // (((((10+2)+2)-2)*2)/2)
public class Assignment1 {
	
  public int sum(int x, int y)
  {
     int z =x+y;  System.out.println("Sum Result is :" + z);
     return z;   
  }  
  public int sub(int x, int y)
  {
	  int z= x-y;  System.out.println("Sub Result is :" + z);
	  return z; 
  }
  public int multi(int x, int y)
  {
	  int z= x*y;  System.out.println("Multi Result is :" + z);
	  return z;
	 
  }
   public void div(int x, int y)
   {
	   int z = x/y;  System.out.println("Final Result is =" +z);
   }       
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		Assignment1 obj= new Assignment1();
 		System.out.println("--Assignment First--((((10+2)+2)-2)*2)/2)");
 		int sum =obj.sum(10, 2);
 		int sum1=obj.sum(sum, 2);
 		int sub=obj.sub(sum1, 2);
 		int mult= obj.multi(sub, 2);
 		obj.div(mult, 2);

	}

}
