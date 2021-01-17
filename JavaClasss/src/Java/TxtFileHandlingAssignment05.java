package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
                                 // Assignment 05 
public class TxtFileHandlingAssignment05 {

	public static void main(String[] args) throws IOException {
		
	
		File file= new File("../JavaClasss/Note.txt");
		FileReader fr= new FileReader(file); 
		BufferedReader br= new BufferedReader(fr); 
		File file2= new File ("../JavaClasss/Note2.txt");
		FileWriter write= new FileWriter(file2); 
		BufferedWriter wr= new BufferedWriter(write); 
		
		String s; 
		 while ((s=br.readLine())!=null)
		 {
			
			 wr.write(s);
			 wr.newLine();
		 }
		
		wr.close();
		
	}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*   Scanner scan= new Scanner(file);
		//FileReader read= new FileReader(file); 
		FileWriter writer= new FileWriter ("C:\\Users\\Awanish\\Desktop\\Pratice2.txt");
		
		String fileContent =""; 
		
		while (scan.hasNextLine())
		 {
			fileContent = fileContent.concat(scan.nextLine() + "\n"); 
		 }
      
	     writer.write(fileContent);
         writer.close();	
	
	}
	
}*/  


