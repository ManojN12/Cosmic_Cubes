package com.cosmic.cubes.test.regression;

import com.cosmic.cubes.utils.generic.GetData1;

public class Data1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1=GetData1.fromExcel("E://Selenium Web driver/tdata.xlsx", "Sheet1", 0, 0);
		System.out.println(data1);

	}

}
