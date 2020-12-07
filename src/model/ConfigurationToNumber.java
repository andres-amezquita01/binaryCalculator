package model;

/**
 * Crea la logica necesaria para poder convertir una configuracion de bits a su valor en numero.
 * @author Andres Felipe Amezquita Gordillo
 *
 */
public class ConfigurationToNumber {
	
	private ConfigurationFromNumerToBinary configurationBits;
	/**
	 * Constructor que instancia un objeto tipo ConfigurationFromNumerToBinary que ayudara con la logica
	 * necesaria para convertir bits a numeros en esta clase.
	 */
	public ConfigurationToNumber() {
	configurationBits = new ConfigurationFromNumerToBinary();	
	}
	/**
	 * Convierte una cadena de bits a un numero tipo long.
	 * @param number cadena de bits a convertir.
	 * @return representacion de la cadena de bits en un numero tipo long.
	 */
	public long fromBitToNumber(String number) {
		return Long.parseUnsignedLong(number, 2);
	}
	
	/**
	 * Convierte una cadena de bits a un numero tipo double.
	 * @param number cadena de bits a convertir.
	 * @return representacion de la cadena de bits en un numero tipo double.
	 */
	public String fromDoubleBitToNumber(String number) {
		double aux = Double.parseDouble(number);
		long partInt = configurationBits.getPartInt(aux);
		long decimalPart =  configurationBits.getParIntDecimalDouble(aux);
		
		long partIntToNumber = fromBitToNumber(Long.toString(partInt));
		long partDecimalToNumber = fromBitToNumber(Long.toString(decimalPart));
		
		return partIntToNumber + "." + partDecimalToNumber;
	}
	
}
