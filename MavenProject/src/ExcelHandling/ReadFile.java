package ExcelHandling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadFile {
	
	public void ReadDataFromCell(int row, int column) throws BiffException, IOException
	{
		File f = new File("C:\\Users\\Awanish\\Desktop\\Input.xls");
		
		Workbook wk= Workbook.getWorkbook(f); 
	    Sheet ws= wk.getSheet(0); 
	    int r = ws.getRows();
	    int c = ws.getColumns(); 
	    
	
	 
	    for (int i=0; i<r; i++)
	    {
	    	for (int j=0; j<c; j++)
	    	{
	    		 Cell c1= ws.getCell(column	, row);
	    	
	    	if (column==j || row ==r)
	    			
	    		System.out.println(c1.getContents());
	    	}
	    }
	}

	public static void main(String[] args) throws BiffException, IOException {
		 ReadFile obj= new ReadFile();
		 obj.ReadDataFromCell(2,2);
        
	}

}
