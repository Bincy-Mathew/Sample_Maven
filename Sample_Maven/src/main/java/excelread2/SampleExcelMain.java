package excelread2;

import java.io.IOException;

public class SampleExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s= SampleExcelCode.ReadStringValue(0, 0);
		double d= SampleExcelCode.ReadIntegerValue(0, 1);
		System.out.println(s);
		System.out.println(d);

	}

}
