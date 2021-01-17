package Java;

public class Student {
	int rollno; 
	int age;
	
	public void method1()
	{
		System.out.println("Welcome All");
	}
    public void method2()
    {
    	System.out.println("Automation is very easy");
    }
	
    public static void main(String[] args) {
    	
    	Student deepak =new Student();
    	
    	deepak.method1();
    	deepak.method2();
    	deepak.age=40;
    	System.out.println("Deepak age is " + deepak.age);
    	deepak.rollno=123;
    	System.out.println("Deepak Rollno is " + deepak.rollno);
    	
    	
    }
}
