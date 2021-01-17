package Java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
                                               // Assignment 01 
public class TxtFileHandlingAssignment01 {
	
	public void ReadDataofLinenumber(int rownumber) throws IOException
	{
		File f= new File  ("../JavaClasss/Note.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br = new BufferedReader(fr); 
		
		String s; 
		int a= 0; 
		
		while ((s=br.readLine())!=null)
			 {
				a=a+1; 
				
				if (a==rownumber)
				{
				 System.out.println(s);		
				 break; 
			 }  
			 
				
			 }
		}
	
			
	public static void main(String[] args) throws IOException {
		
		TxtFileHandlingAssignment01 read= new TxtFileHandlingAssignment01();
		read.ReadDataofLinenumber(7);
		
        
	}

}
