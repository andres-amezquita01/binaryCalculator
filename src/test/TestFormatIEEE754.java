package test;

import model.ConfigurationFromNumerToBinary;

public class TestFormatIEEE754 {
	public static void main(String[] args) {
		ConfigurationFromNumerToBinary testFormatIEEE754 = new ConfigurationFromNumerToBinary();
		
		String floatFormatOk =   "0   10000010   10101101110000101000111";
		String floatFormatFail = "1   10000010   10101101110000101000111";

		float floatNumberTest = (float) 13.43;
		
		System.out.println("case 1 float: " + (testFormatIEEE754.fromFloatWithFormatIEEE754(floatNumberTest).equals(floatFormatOk) ?"ok":"error"));
		System.out.println("case 2 float: " + (testFormatIEEE754.fromFloatWithFormatIEEE754(floatNumberTest).equals(floatFormatFail) ?"ok":"error"));
		

		String doubleFormatOk =   "0   10000000110   0010001010101001111110111110011101101100100010110100";
		String doubleFormatFail = "0   11111111110   0010001010101001111110111110011101101100100010110100";

		double doubleNumberTest =  145.332;
		
		System.out.println("case 3 doble : " + (testFormatIEEE754.fromDoubletWithFormatIEEE754(doubleNumberTest).equals(doubleFormatOk) ?"ok":"error"));
		System.out.println("case 4 double: " + (testFormatIEEE754.fromDoubletWithFormatIEEE754(doubleNumberTest).equals(doubleFormatFail) ?"ok":"error"));
		
	}
}
