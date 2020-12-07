package test;

import model.ConfigurationFromNumerToBinary;

public class TestToBinarya1 {
	public static void main(String[] args) {
		ConfigurationFromNumerToBinary testNumberToBinary = new ConfigurationFromNumerToBinary();
		byte numberTest = 88;
		System.out.println("case 1: Byte a a1 " + (testNumberToBinary.fromByteToComplement1(numberTest).equals("10100111") ?"ok":"error")  );
		System.out.println("case 2: Byte a a1 " + (testNumberToBinary.fromByteToComplement1(numberTest).equals("01011000") ?"ok":"error")  );
		
		long numberTestLong = 321321;
		String complement1testOk = "1111111111111111111111111111111111111111111110110001100011010110";
		String complement1testfail = "1111111111100000000000000000000000010101111110110001100011010110";

		System.out.println("case 3: long a a1 " + (testNumberToBinary.fromLongToComplementOne(numberTestLong).equals(complement1testOk) ?"ok":"error")  );
		System.out.println("case 4: long a a1 " + (testNumberToBinary.fromLongToComplementOne(numberTestLong).equals(complement1testfail) ?"ok":"error")  );
		
	}
}
