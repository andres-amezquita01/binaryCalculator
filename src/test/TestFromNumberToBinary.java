package test;

import model.ConfigurationToNumber;

public class TestFromNumberToBinary {
	public static void main(String[] args) {
		ConfigurationToNumber configurationTest = new ConfigurationToNumber();
		
		String number = "00001100000010001110100001111111";
		System.out.println("case 1: " + (configurationTest.fromBitToNumber(number) == 201910399 ? "ok" : "error"));
		
		String numberTwo = "00001100000010001110100001111111";
		System.out.println("case 1: " + (configurationTest.fromBitToNumber(number) == 100 ? "ok" : "error"));
	}
}
