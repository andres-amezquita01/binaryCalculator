package test;

import model.ConfigurationFromNumerToBinary;

public class TestFromNumberToMagnitudeSign {
	public static void main(String[] args) {
		ConfigurationFromNumerToBinary testNumberToMagnitudeSign = new ConfigurationFromNumerToBinary();
		
		byte byteNumberTest = -61;
		String magnitudeSignOk =   "10111101";
		String magnitudeSignFail = "00111101";

		System.out.println("case 1: "  + ( testNumberToMagnitudeSign.fromByteToMagnitudeSign(byteNumberTest).equals(magnitudeSignOk)?"ok":"error" ));
		System.out.println("case 2: "  + ( testNumberToMagnitudeSign.fromByteToMagnitudeSign(byteNumberTest).equals(magnitudeSignFail)?"ok":"error" ));

		
		int intNumberTest = 201023122;
		String magnitudeSignIntOk =   "00001011111110110101111010010010";
		String magnitudeSignIntFail = "10001011111110110101111010010010";

		System.out.println("case 1: "  + ( testNumberToMagnitudeSign.fromIntToMagnitudeSign(intNumberTest).equals(magnitudeSignIntOk)?"ok":"error" ));
		System.out.println("case 2: "  + ( testNumberToMagnitudeSign.fromIntToMagnitudeSign(intNumberTest).equals(magnitudeSignIntFail)?"ok":"error" ));

			
	}
}
