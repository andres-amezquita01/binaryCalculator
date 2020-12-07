package model;
/**
 * Crea la logica necesaria para calcular el exceso 2n-1 de un numero.
 * @author Andres Felipe Amezquita Gordillo.
 *
 */
public class ConfiguratioExcess2n {
	private ConfigurationFromNumerToBinary configurationBits;
	/**
	 * Constructor que instancia un objeto tipo ConfigurationFromNumerToBinary que ayudara con la logica
	 * necesaria para convertir bits a numeros en esta clase.
	 */
	public ConfiguratioExcess2n() {
		configurationBits = new ConfigurationFromNumerToBinary();
	}
	/**
	 * Formula para calcular el exceso de un numero.
	 * @param sizeBitsPrimitiveData  tamaño en bits del tipo de numero que se desea saber el exceso 2n-1.
	 * @return exceso 2n-1 de un determinado dato.
	 */
	public long calculateExcess(int sizeBitsPrimitiveData) {
		return  (long)(Math.pow(2, sizeBitsPrimitiveData-1));
	}
	/**
	 * Formula para calcular el exceso de un numero demasiado grande.
	 * @param sizeBitsPrimitiveData  tamaño en bits del tipo de numero que se desea saber el exceso 2n-1.
	 * @return exceso 2n-1 de un determinado dato.
	 */
	public Long calculateExcessLong(int sizeBitsPrimitiveData) {
		Long exccess =   (long)(Math.pow(2, sizeBitsPrimitiveData-1));
		return  exccess;
	}
	/**
	 * Calcula el exceso 2n-1 para un numero tipo byte.
	 * @param number numero del cual se quiere calcular el exceso 2n-1.
	 * @return cadena de bits con el exceso 2n-1  para un dato tipo byte.
	 */
	public String fromByteToExccess2n(byte number) {
		String exccess = configurationBits.ToBinary(Math.abs(number +calculateExcess(8)) );
		String aux = configurationBits.partSignificative(exccess, 8);
		return aux;
	}
	/**
	 * Calcula el exceso 2n-1 para un numero tipo short.
	 * @param number numero del cual se quiere calcular el exceso 2n-1.
	 * @return cadena de bits con el exceso 2n-1  para un dato tipo short.
	 */
	public String fromShortToExccess2n(short number) {
		String exccess = configurationBits.ToBinary( Math.abs(number +calculateExcess(16)) );
		String aux = configurationBits.partSignificative(exccess, 16);
		return aux;
	}
	/**
	 * Calcula el exceso 2n-1 para un numero tipo int.
	 * @param number numero del cual se quiere calcular el exceso 2n-1.
	 * @return cadena de bits con el exceso 2n-1  para un dato tipo int.
	 */
	public String fromIntToExccess2n(int number) {
		String exccess = configurationBits.bigNumberToBinary( Math.abs(number +calculateExcessLong(32)) );
		String aux = configurationBits.partSignificative(exccess, 32);
		return aux;
	}
	/**
	 * Calcula el exceso 2n-1 para un numero tipo long.
	 * @param number numero del cual se quiere calcular el exceso 2n-1.
	 * @return cadena de bits con el exceso 2n-1  para un dato tipo long.
	 */
	public String fromLongToExccess2n(long number) {
		String exccess = configurationBits.bigNumberToBinary( Math.abs(number +calculateExcessLong(64)) );
		String aux = configurationBits.partSignificative(exccess, 64);
		return aux;
	}
}
