package com.cosmic.cubes.test.functional;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData {

	public static String fromExcel(String filePath,String SName,int RowIndex,int CellIndex)
	{
		String data=null;
		try
		{
			File f= new File(filePath);
			FileInputStream fis= new FileInputStream(f);
			Workbook wb= WorkbookFactory.create(fis);
			Sheet st=wb.getSheet(SName);
			Row r=st.getRow(RowIndex);
		    Cell c=r.getCell(CellIndex);
		    data=c.toString();
		   				
		}
		catch(Exception e)
		{
			
		}
		return data;
		

	}

}
