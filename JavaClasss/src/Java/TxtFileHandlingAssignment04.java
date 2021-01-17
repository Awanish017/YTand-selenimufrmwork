package Java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
                                          // Assignment 04 
public class TxtFileHandlingAssignment04{
	
	public void WriteDatainRange(int startrow , int endrow,  String line) throws IOException
	{
	    File f = new File("../JavaClasss/Note3.txt"); 
	    FileWriter wr= new FileWriter(f); 
	    BufferedWriter br= new BufferedWriter(wr); 
	    
	    for (int i=1; i<=endrow; i++)
        { 
	    	  if (i>=startrow && i<=endrow) 
	    	  {
	    br.write(line);
	    br.newLine();
	    }
	    else 
	    {
	    	br.newLine();
	    
	    }
	}   br.close();
	}
	public static void main(String[] args) throws IOException {
		TxtFileHandlingAssignment04 obj = new TxtFileHandlingAssignment04();
		Scanner scan= new Scanner(System.in); 
		System.out.println("Enter string which you want to print ");
		String line= scan.nextLine();
		System.out.println("Enter the Starting Row number " );
		int startrow=scan.nextInt(); 
		System.out.println("Enter the End Row number");
		int endrow= scan.nextInt(); 
		obj.WriteDatainRange(startrow, endrow, line);
		scan.close();
		
		

	}

}
