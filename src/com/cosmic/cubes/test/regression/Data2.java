package com.cosmic.cubes.test.regression;

import com.cosmic.cubes.utils.generic.GetData1;

public class Data2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String data1=GetData1.fromExcel1("E://Selenium Web driver/tdata.xlsx", "Sheet1", 0);
		System.out.println(data1);

	}

}
