package model;

public class ConfiguratioExcess2n {
	private Configuration configurationBits;
	public ConfiguratioExcess2n() {
		configurationBits = new Configuration();
	}
	
	public long calculateExcess(int sizeBitsPrimitiveData) {
		return  (long)(Math.pow(2, sizeBitsPrimitiveData-1));
	}
	
	public Long calculateExcessLong(int sizeBitsPrimitiveData) {
		Long exccess =   (long)(Math.pow(2, sizeBitsPrimitiveData-1));
		return  exccess;
	}
	
	public String fromByteToExccess2n(byte number) {
		String exccess = configurationBits.ToBinary(Math.abs(number +calculateExcess(8)) );
		String aux = configurationBits.partSignificative(exccess, 8);
		return aux;
	}
	
	public String fromShortToExccess2n(short number) {
		String exccess = configurationBits.ToBinary( Math.abs(number +calculateExcess(16)) );
		String aux = configurationBits.partSignificative(exccess, 16);
		return aux;
	}
	
	public String fromIntToExccess2n(int number) {
		String exccess = configurationBits.bigNumberToBinary( Math.abs(number +calculateExcessLong(32)) );
		String aux = configurationBits.partSignificative(exccess, 32);
		return aux;
	}
	
	public String fromLongToExccess2n(long number) {
		String exccess = configurationBits.bigNumberToBinary( Math.abs(number +calculateExcessLong(64)) );
		String aux = configurationBits.partSignificative(exccess, 64);
		return aux;
	}
}
