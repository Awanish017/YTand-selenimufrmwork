package Java;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;

import java.io.IOException;
import java.util.Scanner;
                                       // Assignment 02 
public class TxtFileHandlingAssignment02 {
	
	public void ReadDataInRange(int InitialRow, int EndRow) throws IOException
	{
		
		
		File f= new File  ("../JavaClasss/Note.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br = new BufferedReader(fr); 
		
		String s; 
		int i=0; 
		 while ((s=br.readLine())!=null)
		{    i=i+1;
			 
			 if (i==InitialRow && i<=EndRow)
			 {
				
				 System.out.println(s);
				 InitialRow++;
			 }  	
				
			 }
		}
	
	public static void main(String[] args) throws IOException {
	TxtFileHandlingAssignment02 range= new TxtFileHandlingAssignment02();	
     Scanner scan = new Scanner (System.in);
    
      System.out.println("Enter the Initial row number ");
      int InitialRow = scan.nextInt();
      System.out.println("Enter the End row number");
      int EndRow = scan.nextInt();     
      range.ReadDataInRange(InitialRow, EndRow);

	}

}
