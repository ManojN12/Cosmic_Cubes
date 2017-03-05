package com.cosmic.cubes.test.functional;

public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Data1=GetData.fromExcel("E://Selenium Web driver//tdata.xlsx","Sheet1",0,1);
		System.out.println(Data1);
	}

}
