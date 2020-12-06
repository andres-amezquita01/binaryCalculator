package model;

public class ManagerConfiguration {
	
	private Configuration configuration;
	
	public ManagerConfiguration() {
		configuration = new Configuration();
	}
	
	/**
	 * Convierte el valor text a su valor en bits.
	 * @param text texto que quiere ser cambiado a bits.
	 * @return StringBuilder con la representacion en bits de text.
	 */
	public StringBuilder fromStringToBinary(String text) {
		return configuration.fromStringToBinary(text);
	}
	
	/**
	 * Convierte un dato de tipo entero a su representacion en bits.
	 * @param data Dato que quiere ser convertido.
	 * @return String con la representacion en bits del dato data.
	 */
	public String fromIntegerToBinary(int data) {
		return configuration.fromIntegerToString(data);
	}

	public String fromChar(char character) {
		return configuration.fromChar(character);
	}
	
	public String fromShort(short number) {
		return configuration.fromShort(number);
	}
	public String fromShortComplementOne(short number) {
		return configuration.fromShortToComplementOne(number);
	}
	public String fromShortMagnitudeSign(short number) {
		return configuration.fromShortToMagnitudeSign(number);
	}
	
	
	public String fromInt(int number) {
		return configuration.fromInt(number);
	}
	public String fromIntComplementOne(int number) {
		return configuration.fromIntToComplementOne(number);
	}
	public String fromIntMagnitudeSign(int number) {
		return configuration.fromIntToMagnitudeSign(number);
	}
	
	
	public String fromByte(byte number) {
		return configuration.fromByte(number);
	}
	public String fromByteComplementOne(byte number) {
		return configuration.fromByteToComplement1(number);
	}
	public String fromByteMagnitudeSign(byte number) {
		return configuration.fromByteToMagnitudeSign(number);
	}
	
	
	public String fromLong(Long number) {
		return configuration.fromLong(number);
	}
	public String fromLongComplementOne(long number) {
		return configuration.fromLongToComplementOne(number);
	}
	public String fromLongMagnitudeSign(long number) {
		return configuration.fromLongToMagnitudeSign(number);
	}
	
	
	
	public String fromFloat(float number) {
		return configuration.fromFloat(number);
	}
	public String fromFloatComplementOne(float number) {
		return configuration.fromFloatToComplementOne(number);
	}
	public String fromFloatMagnitudeSign(float number) {
		return configuration.fromFloatToMagnitudeSign(number);
	}
	public String fromFloatWithFormat(float number) {
		return configuration.fromFloatWithFormatIEEE754(number);
	}
	
	
	
	public String fromDouble(double number) {
		return configuration.fromDouble(number);
	}
	public String fromDoubleComplementOne(double number) {
		return configuration.fromDoubleToComplementOne(number);
	}
	public String fromDoubleMagnitudeSign(double number) {
		return configuration.fromDoubleToMagnitudeSign(number);
	}
	public String fromDoubleWithFormat(double number) {
		return configuration.fromDoubletWithFormatIEEE754(number);
	}
}
