package model;

/**
 * Administra las diferentes clases de logica que se necesitan para ejecutar la aplicacion.
 * @author Andres Felipe Amezquita Gordillo
 */
public class ManagerConfiguration {
	
	private ConfigurationFromNumerToBinary configuration;
	private ConfigurationToNumber configurationFromBitsToNumber;
	private ConfiguratioExcess2n configurationExccess2n;
	/**
	 * Constructor que instancia cada clase de logica.
	 */
	public ManagerConfiguration() {
		configuration = new ConfigurationFromNumerToBinary();
		configurationFromBitsToNumber = new ConfigurationToNumber();
		configurationExccess2n = new ConfiguratioExcess2n();
	}
	
	/**
	 * Convierte el valor text a su valor en bits.
	 * @param text texto que quiere ser cambiado a bits.
	 * @return StringBuilder con la representacion en bits de text.
	 */
	public StringBuilder fromStringToBinary(String text) {
		return  configuration.fromStringToBinary(text);
	}
	
	/**
	 * Convierte un dato de tipo entero a su representacion en bits.
	 * @param data Dato que quiere ser convertido.
	 * @return String con la representacion en bits del dato data.
	 */
	public String fromIntegerToBinary(int data) {
		return configuration.fromIntegerToString(data);
	}
	/**
	 * Convierte un dato de tipo char a su representacion en bits.
	 * @param data Dato que quiere ser convertido.
	 * @return String con la representacion en bits del dato data.
	 */
	public String fromChar(char character) {
		return configuration.fromChar(character);
	}
	/**
	 * Convierte un dato de tipo short a su representacion en bits.
	 * @param data Dato que quiere ser convertido.
	 * @return String con la representacion en bits del dato data.
	 */
	public String fromShort(short number) {
		return configuration.fromShort(number);
	}
	/**
	 * Convierte un dato de tipo short a su representacion en bits con sistema complemento a1.
	 * @param number numero que quiere ser convertido.
	 * @return String con la representacion en bits complemento a 1 del dato number.
	 */
	public String fromShortComplementOne(short number) {
		return configuration.fromShortToComplementOne(number);
	}
	public String fromShortMagnitudeSign(short number) {
		return configuration.fromShortToMagnitudeSign(number);
	}
	public String fromShortToExcces2n(short number) {
		 return configurationExccess2n.fromShortToExccess2n(number);
	}
	
	
	/**
	 * Convierte un dato de tipo entero a su representacion en bits.
	 * @param number numero que quiere ser convertido.
	 * @return String con la representacion en bits del dato number.
	 */
	public String fromInt(int number) {
		return configuration.fromInt(number);
	}
	/**
	 * Convierte un dato de tipo entero a su representacion en bits con sistema complemento a1.
	 * @param number numero que quiere ser convertido.
	 * @return String con la representacion en bits complemento a 1 del dato number.
	 */
	public String fromIntComplementOne(int number) {
		return configuration.fromIntToComplementOne(number);
	}
	public String fromIntMagnitudeSign(int number) {
		return configuration.fromIntToMagnitudeSign(number);
	}
	public String fromIntToExccess2n(int number) {
		return configurationExccess2n.fromIntToExccess2n(number);
	}
	
	/**
	 * Convierte un dato de tipo byte a su representacion en bits.
	 * @param number numero que quiere ser convertido.
	 * @return String con la representacion en bits  del dato number.
	 */
	public String fromByte(byte number) {
		return configuration.fromByte(number);
	}
	/**
	 * Convierte un dato de tipo byte a su representacion en bits con sistema complemento a1.
	 * @param number numero que quiere ser convertido.
	 * @return String con la representacion en bits complemento a 1 del dato number.
	 */
	public String fromByteComplementOne(byte number) {
		return configuration.fromByteToComplement1(number);
	}
	public String fromByteMagnitudeSign(byte number) {
		return configuration.fromByteToMagnitudeSign(number);
	}
	public String fromByteToExccess2n(byte number) {
		return configurationExccess2n.fromByteToExccess2n(number);
	}
	
	/**
	 * Convierte un dato de tipo long a su representacion en bits.
	 * @param number numero que quiere ser convertido.
	 * @return String con la representacion en bits del dato number.
	 */
	public String fromLong(Long number) {
		return configuration.fromLong(number);
	}
	/**
	 * Convierte un dato de tipo short a su representacion en bits con sistema complemento a1.
	 * @param number numero que quiere ser convertido.
	 * @return String con la representacion en bits complemento a 1 del dato number.
	 */
	public String fromLongComplementOne(long number) {
		return configuration.fromLongToComplementOne(number);
	}
	public String fromLongMagnitudeSign(long number) {
		return configuration.fromLongToMagnitudeSign(number);
	}
	public String fromLongToExccess2n(Long number) {
		return configurationExccess2n.fromLongToExccess2n(number);
	}
	
	/**
	 * Convierte un dato de tipo float a su representacion en bits.
	 * @param number numero que quiere ser convertido.
	 * @return String con la representacion en bits del dato number.
	 */
	public String fromFloat(float number) {
		return configuration.fromFloat(number);
	}
	/**
	 * Convierte un dato de tipo float a su representacion en bits con sistema complemento a1.
	 * @param number numero que quiere ser convertido.
	 * @return String con la representacion en bits del dato number.
	 */
	public String fromFloatComplementOne(float number) {
		return configuration.fromFloatToComplementOne(number);
	}
	public String fromFloatMagnitudeSign(float number) {
		return configuration.fromFloatToMagnitudeSign(number);
	}
	public String fromFloatWithFormat(float number) {
		return configuration.fromFloatWithFormatIEEE754(number);
	}
	
	
	/**
	 * Convierte un dato de tipo double a su representacion en bits .
	 * @param number numero que quiere ser convertido.
	 * @return String con la representacion en bits complemento a 1 del dato number.
	 */
	public String fromDouble(double number) {
		return configuration.fromDouble(number);
	}
	/**
	 * Convierte un dato de tipo double a su representacion en bits con sistema complemento a1.
	 * @param number numero que quiere ser convertido.
	 * @return String con la representacion en bits complemento a 1 del dato number.
	 */
	public String fromDoubleComplementOne(double number) {
		return configuration.fromDoubleToComplementOne(number);
	}
	public String fromDoubleMagnitudeSign(double number) {
		return configuration.fromDoubleToMagnitudeSign(number);
	}
	public String fromDoubleWithFormat(double number) {
		return configuration.fromDoubletWithFormatIEEE754(number);
	}
	
	/**
	 * Convierte una configuracion de bits a su representacion en numero entero.
	 * @param number cadena de bits a convertir a numero.
	 * @return numero entero que representa la configuracion de bits.
	 */
	public String fromBinaryToNumberInt(String number) {
		return Long.toString(configurationFromBitsToNumber.fromBitToNumber(number));
	}
	/**
	 * Convierte una configuracion de bits a su representacion en numero double.
	 * @param number cadena de bits a convertir a numero.
	 * @return numero double que representa la configuracion de bits.
	 */
	public String fromBinaryToNumberDouble(String number) {
		return configurationFromBitsToNumber.fromDoubleBitToNumber(number);
	}
}
