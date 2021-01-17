package Java;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
                                           // Assignment 03 
public class TxtFileHandlingAssignment03 {
	
	public void  WriteData(int endrow,  String line ) throws IOException
	{
		File f = new File ("../JavaClasss/Note1.txt");

		FileWriter wr= new FileWriter (f);
		BufferedWriter bw = new BufferedWriter(wr); 
		int i=1; 
		while (i<=endrow)
		{
		 bw.write(line);
		 bw.newLine();
		 i++; 
		}
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		
		TxtFileHandlingAssignment03 obj= new TxtFileHandlingAssignment03();
		Scanner scan= new Scanner (System.in); 
		System.out.println("Enter the String line");
		String line= scan.nextLine();
		System.out.println("Enter the column number till you want to print");
		int endrow= scan.nextInt();
		obj.WriteData(endrow, line);
	    
	}

}
