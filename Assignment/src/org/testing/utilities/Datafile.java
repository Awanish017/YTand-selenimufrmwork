package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class Datafile {

	public static String dataread(int row, int columns) throws BiffException, IOException
	{
		File f=new File("C:\\Users\\Awanish\\Downloads\\data.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet sh=wk.getSheet(0);
		Cell c1=sh.getCell(columns ,row);
		System.out.println(c1.getContents());
		return c1.getContents();
		
	}
}
