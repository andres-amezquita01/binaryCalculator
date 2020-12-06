package model;

/**
 * Crea la logica necesaria para poder convertir una configuracion de bits a su alor en numero.
 * @author Andres Felipe Amezquita Gordillo
 *
 */
public class ConfigurationToNumber {
	
	private Configuration configurationBits;
	
	public ConfigurationToNumber() {
	configurationBits = new Configuration();	
	}
	
	public long fromBitToNumber(String number) {
		return Long.parseUnsignedLong(number, 2);
	}
	
	
	public String fromDoubleBitToNumber(String number) {
		double aux = Double.parseDouble(number);
		long partInt = configurationBits.getPartInt(aux);
		long decimalPart =  configurationBits.getParIntDecimalDouble(aux);
		
		long partIntToNumber = fromBitToNumber(Long.toString(partInt));
		long partDecimalToNumber = fromBitToNumber(Long.toString(decimalPart));
		
		return partIntToNumber + "." + partDecimalToNumber;
	}
	
}
