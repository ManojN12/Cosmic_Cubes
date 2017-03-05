package com.cosmic.cubes.utils.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData1 

{
	public static String fromExcel(String filepath,String sName,int rindex,int cindex)
	{
		String data=null;
		try
		{
			File f=new File(filepath);
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sName);
			Row r=s.getRow(rindex);
			Cell c=r.getCell(cindex);
			data=c.toString();
		}
		catch(Exception e)
		{
			
		}
		return data;
		
	}
	public static String fromExcel1(String filepath,String sName,int rindex)
	{
		String data=null;
		try
		{
			File f=new File(filepath);
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sName);
			Row r=s.getRow(rindex);
			int cellno=r.getLastCellNum();
			for(int i=0;i<cellno;i++)
			{
				Cell c=r.getCell(i);
				data=c.toString();
				
				
			}
		
			
		}
			catch(Exception e)
			{
				
			}
		return data;
		
		
		}
	

}
