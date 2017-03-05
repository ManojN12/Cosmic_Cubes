package com.cosmic.cubes.test.regression;

import com.cosmic.cubes.utils.generic.SetData;

public class Data3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1=SetData.toExcel("E://Selenium Web driver/tdata.xlsx", "Sheet1", 0,1,"India");
		System.out.println(data1);


	}

}
