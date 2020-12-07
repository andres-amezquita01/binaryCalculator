package test;

import model.ConfiguratioExcess2n;

public class TestConfiguratioExcess2n {
	public static void main(String[] args) {
		ConfiguratioExcess2n testExcess =  new ConfiguratioExcess2n();
		System.out.println("case 1 data byte: " + (testExcess.calculateExcess(8) == 128 ?"ok": "error"));
		System.out.println("case 2 data short: " + (testExcess.calculateExcess(16) == 32768 ?"ok": "error"));
		System.out.println("case 3 data int: " + (testExcess.calculateExcess(32) == 2147483647 ?"ok": "error"));
		System.out.println("case 4 data long: " + (testExcess.calculateExcess(64) == 32768 ?"ok": "error"));
		
		System.out.println("case 5 byte " + (testExcess.fromByteToExccess2n((byte) 3)));
		System.out.println("case 6 short: " + (testExcess.fromShortToExccess2n((short) -432)));
		System.out.println("case 7" + testExcess.calculateExcessLong(64));
		System.out.println("case 8" + testExcess.fromIntToExccess2n(20));
		
	}
}
