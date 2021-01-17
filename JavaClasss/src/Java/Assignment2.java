package Java;
//(((((10-2)+2)-2)*2)/2)
public class Assignment2 {


	
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
	   int z = x/y;  System.out.println("Final Result is =" + z);
  }       
	public static void main(String[] args) {
		System.out.println("--Assignment Second--((((10-2)+2)-2)*2)/2)");
		Assignment2 obj= new Assignment2();
		int sub=obj.sub(10, 2);
		int sum=obj.sum(sub, 2);
		int sub1=obj.sub(sum, 2);
		int multi=obj.multi(sub1, 2);
		obj.div(multi, 2);
}
}