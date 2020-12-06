package model;

import java.util.ArrayList;

/**
 * Configura los bits para cada tipo de dato primitivo.
 * @author Andres Felipe Amezquita Gordillo
 */
public class Configuration {
	/**
	 * constructor vacio para ser instanciado en el manager.
	 */
	public Configuration() {
		
	}
	
	/**
	 * Convierte un dato de tipo String a su valor en bits.
	 * @param text Texto a convertir a su valor en bits.
	 * @return StringBuilder con el valor en bits que representa a text.
	 */
	public StringBuilder fromStringToBinary(String text) {
	     byte[] bytes = text.getBytes();
	     StringBuilder binary = new StringBuilder();
	     for (byte c : bytes)
	     {
	        int val = c;
	        for (int count = 0; count < 8; count++)
	        {
	           binary.append((val & 128) == 0 ? 0 : 1);
	           val <<= 1;
	        }
	        binary.append(' ');
	     }
//	     System.out.println("'" + text + "' to binary: " + binary);
	     return binary;
	}
	
	/**
	 * Convierte un dato de tipo entero a su representacion en binario.
	 * @param data dato entero a convertir.
	 * @return configuracion en bits de data.
	 */
	public String fromIntegerToString(int data) {
		return Integer.toBinaryString(data);
	}
	
	/**
	 * Convierte un dato de tipo char a su representacion en binario.
	 * @param data dato char a convertir.
	 * @return configuracion en bits de data.
	 */
	public String fromChar(char character) {
		String value = ""+(int)character;
		return value;
	}
	
	/**
	 * Convierte un dato de tipo short a su representacion en binario.
	 * @param data dato short a convertir.
	 * @return configuracion en bits de data.
	 */
	public String fromShort(short number) {
		String lengthOfBits = "" + Integer.toBinaryString(number);
		String test = fillZeros(number, lengthOfBits, 32);
		test = test + lengthOfBits;
		String bin = test.substring(16);
		return bin;
	}
	
	/**
	 * Convierte un dato de tipo short a su representacion en binario complemento a 1.
	 * @param data dato short a convertir.
	 * @return configuracion en bits de data.
	 */
	public String fromShortToComplementOne(short number) {
		String lengthOfBits = ToBinary(Math.abs(number));
		String test = partSignificative( lengthOfBits, 16);
		return changeToComplement1(test);
	}
	
	/**
	 * convierte un dato de tipo int a su representacion en signo magnitud.
	 * @param number dato a convertir.
	 * @return representacion binaria signo-magnitud del numero.
	 */
	public String fromShortToMagnitudeSign(short number) {
		String lengthOfBits = ToBinary(Math.abs(number));
		String test = partSignificative( lengthOfBits, 16);
		return magnitudeSign(test, number);
	}
	
	/**
	 * Convierte un dato de tipo entero a su representacion en binario.
	 * @param data dato entero a convertir.
	 * @return configuracion en bits de data.
	 */
	public String fromInt(int number) {
		String lengthOfBits = "" + Integer.toBinaryString(number);
		String test = fillZeros(number, lengthOfBits, 32);
		test = test + lengthOfBits;
		return test;
	}
	/**
	 * Convierte un dato de tipo int a su representacion en binario complemento a 1.
	 * @param data dato long a convertir.
	 * @return configuracion en bits de data.
	 */
	public String fromIntToComplementOne(int number) {
		String lengthOfBits = ToBinary(Math.abs(number));
		String test = partSignificative( lengthOfBits, 32);
		return changeToComplement1(test);
	}
	/**
	 * convierte un dato de tipo int a su representacion en signo magnitud.
	 * @param number dato a convertir.
	 * @return representacion binaria signo-magnitud del numero.
	 */
	public String fromIntToMagnitudeSign(int number) {
		String lengthOfBits = ToBinary(Math.abs(number));
		String test = partSignificative( lengthOfBits, 32);
		return magnitudeSign(test, number);
	}

	/**
	 * Convierte un dato de tipo byte a su representacion en binario.
	 * @param data dato byte a convertir.
	 * @return configuracion en bits de data.
	 */
	public String fromByte(byte number) {
		String lengthOfBits = "" + Integer.toBinaryString(number);
		String test = fillZeros(number, lengthOfBits, 32);
		test = test + lengthOfBits;
		String bin = test.substring(24);
		return bin;
	}
	/**
	 * convierte un dato de tipo byte a su representacion en signo magnitud.
	 * @param number dato a convertir.
	 * @return representacion binaria signo-magnitud del numero.
	 */
	public String fromByteToMagnitudeSign(byte number) {
		String lengthOfBits = ToBinary(Math.abs(number));
		String test = partSignificative( lengthOfBits, 8);
		return magnitudeSign(test, number);
	}
	
	public String fromByteToComplement1(byte number) {
		String lengthOfBits = ToBinary(Math.abs(number));
		String test = partSignificative( lengthOfBits, 8);
		return changeToComplement1(test);
	}
	
	/**
	 * Convierte un dato de tipo long a su representacion en binario.
	 * @param data dato long a convertir.
	 * @return configuracion en bits de data.
	 */
	public String fromLong(long number) {
		String lengthOfBits = "" + Long.toBinaryString(number);
		String test = fillZeros(number, lengthOfBits, 64);
		test = test + lengthOfBits;
		return test;
	}
	/**
	 * convierte un dato de tipo long a su representacion en signo magnitud.
	 * @param number dato a convertir.
	 * @return representacion binaria signo-magnitud del numero.
	 */
	public String fromLongToMagnitudeSign(long number) {
		String lengthOfBits = ToBinary(Math.abs(number));
		String test = partSignificative( lengthOfBits, 64);
		return magnitudeSign(test, number);
	}
	/**
	 * Convierte un dato de tipo long a su representacion en binario complemento a 1.
	 * @param data dato long a convertir.
	 * @return configuracion en bits de data.
	 */
	public String fromLongToComplementOne(long number) {
		String lengthOfBits = ToBinary(Math.abs(number));
		String test = partSignificative( lengthOfBits, 64);
		return changeToComplement1(test);
	}

	/**
	 * Convierte un dato de tipo float a su representacion en binario.
	 * @param data dato float a convertir.
	 * @return configuracion en bits de data.
	 */
	public String fromFloatWithFormatIEEE754(float number) {
		int partIntegerTwo =  getPartInt(number);
		float decimalPart = getPartDecimal(number);
		String formatIEEE754 = "";
		String binaryPartInteger = intToBinary(partIntegerTwo);
		String binaryPartDecimal = decimalToBinary(decimalPart,23- binaryPartInteger.length());
		String binaryNumber = concatBinaryIntWhitDecimal(binaryPartInteger,binaryPartDecimal);
		int exponent = getExponent(binaryNumber);
		String exponentBits = intToBinary( 127 +exponent);
		String mantise = mantise(binaryPartInteger, binaryPartDecimal);
		formatIEEE754 = formatIEEE754( number, mantise, 23, exponentBits);
		return formatIEEE754 ;
	}
	public String fromFloatToComplementOne(float number) {
		int partIntegerTwo =  getPartInt(number);
		float decimalPart = getPartDecimal(number);
		String binaryPartInteger = ToBinary(partIntegerTwo);
		String binaryPartDecimal = decimalToBinary(decimalPart,23- binaryPartInteger.length());

		binaryPartInteger = changeToComplement1(binaryPartInteger);
		binaryPartDecimal = changeToComplement1(binaryPartDecimal);
		String binaryNumber = binaryPartInteger + "  .  " + binaryPartDecimal;
		return binaryNumber;
	}
	/**
	 * convierte un dato de tipo float a su representacion en signo magnitud.
	 * @param number dato a convertir.
	 * @return representacion binaria signo-magnitud del numero.
	 */
	public String fromFloatToMagnitudeSign(float number) {
		int partIntegerTwo =  getPartInt(number);
		float decimalPart = getPartDecimal(number);
		String binaryPartInteger = ToBinary(partIntegerTwo);
		String binaryPartDecimal = decimalToBinary(decimalPart,23- binaryPartInteger.length());
		binaryPartInteger = magnitudeSign(binaryPartInteger, (int) number);
		String binaryNumber = binaryPartInteger + "  .  " + binaryPartDecimal;
		return binaryNumber;
	}
	
	public String fromFloat(float number) {
		int partIntegerTwo =  getPartInt(number);
		float decimalPart = getPartDecimal(number);
		String binaryPartInteger = intToBinary(partIntegerTwo);
		String binaryPartDecimal = decimalToBinary(decimalPart,23- binaryPartInteger.length());
		String binaryNumber = binaryPartInteger + "  .  " + binaryPartDecimal;
		return binaryNumber ;
	}

	/**
	 * Convierte un dato de tipo double a su representacion en binario.
	 * @param data dato double a convertir.
	 * @return configuracion en bits de data.
	 */
	public String fromDouble(double number) {
		int partIntegerTwo =  getPartInt(number);
		double decimalPart = getPartDecimalDouble(number);
		String binaryPartInteger = intToBinary(partIntegerTwo);
		String binaryPartDecimal = decimalToBinary(decimalPart,52- binaryPartInteger.length());
		String binaryNumber = binaryPartInteger + "  .  " + binaryPartDecimal;
		return binaryNumber;
	}
	/**
	 * convierte un dato de tipo double a su representacion en signo magnitud.
	 * @param number dato a convertir.
	 * @return representacion binaria signo-magnitud del numero.
	 */
	public String fromDoubleToMagnitudeSign(double number) {
		int partIntegerTwo =  getPartInt(number);
		double decimalPart = getPartDecimalDouble(number);
		String binaryPartInteger = ToBinary(partIntegerTwo);
		String binaryPartDecimal = decimalToBinary(decimalPart,52- binaryPartInteger.length());
		binaryPartInteger = magnitudeSign(binaryPartInteger, (int) number);
		String binaryNumber = binaryPartInteger + "  .  " + binaryPartDecimal;
		return binaryNumber;
	}
	
	/**
	 * Convierte un dato de tipo double a su representacion en binario.
	 * @param data dato double a convertir.
	 * @return configuracion en bits de data.
	 */
	public String fromDoubleToComplementOne(double number) {
		int partIntegerTwo =  getPartInt(number);
		double decimalPart = getPartDecimalDouble(number);
		String binaryPartInteger = ToBinary(partIntegerTwo);
		String binaryPartDecimal = decimalToBinary(decimalPart,52- binaryPartInteger.length());

		binaryPartInteger = changeToComplement1(binaryPartInteger);
		binaryPartDecimal = changeToComplement1(binaryPartDecimal);
		String binaryNumber = binaryPartInteger + "  .  " + binaryPartDecimal;
		return binaryNumber;
	}
	
	/**
	 * Convierte un numero de tipo double a su representacion en bits con formato IEEE754
	 * @param number
	 * @return
	 */
	public String fromDoubletWithFormatIEEE754(double number) {
		int partIntegerTwo =  getPartInt(number);
		double decimalPart = getPartDecimalDouble(number);
		
		String formatIEEE754 = "";
		String binaryPartInteger = intToBinary(partIntegerTwo);
		String binaryPartDecimal = decimalToBinary(decimalPart,52- binaryPartInteger.length());
		String binaryNumber = concatBinaryIntWhitDecimal(binaryPartInteger,binaryPartDecimal);
		int exponent = getExponent(binaryNumber);
		String exponentBits = intToBinary( 1023 +exponent);
		String mantise = mantise(binaryPartInteger, binaryPartDecimal);
		formatIEEE754 = formatIEEE754((float) number, mantise, 52, exponentBits);
		return formatIEEE754 ;
	}
	
	/**
	 * Convierte un entero en su representacion en binario.
	 * @param number dato a convertir
	 * @return cadena con la representacion en bits.
	 */
	public  String  stringToBinary(int number){
		   ArrayList<String> binarY = new ArrayList<String>();
		   int res;
		   String toBinary = "";

		   do{
		      res = number%2;
		      number = number/2;
		      binarY.add(0, Integer.toString(res));
		   }while(number > 2); 

		   binarY.add(0, Integer.toString(number)); 

		   for(int i = 0; i < binarY.size(); i++){
		       toBinary += binarY.get(i);
		   }
		   return toBinary;
	}
	
	/**
	 * complementa la cantidad de bits de acuerdo con el tipo de dato.
	 * @param number Numero del cual se quiere saber la configuracion de bits.
	 * @param lengthOfBits tamaño de la cadena de bits de una determinada configuracion
	 * @param quantityBits cantidad de bits del tipo de dato number.
	 * @return cadena de bits con el signo correspondiente al numero.
	 */
	public String fillZeros(int number, String lengthOfBits, int quantityBits) {
		String sign  = "";
		String bits = "";
		if(lengthOfBits.length() < quantityBits) {
			if(number < 0 ) {
				sign = "1";
				for (int i = 0; i < (quantityBits- lengthOfBits.length() -1) ; i++) {
					if(i == 0) {
						bits = sign;
					}
					bits = bits + "0";
				}
			}else {
				sign = "0";
				for (int i = 0; i < (quantityBits- lengthOfBits.length()-1) ; i++) {
					if(i == 0) {
						bits = sign;
					}
					bits = bits + "0";
				}
			}
		}
		return bits;
	}
	/**
	 * complementa la cantidad de bits de acuerdo con el tipo de dato.
	 * @param number Numero del cual se quiere saber la configuracion de bits.
	 * @param lengthOfBits tamaño de la cadena de bits de una determinada configuracion
	 * @param quantityBits cantidad de bits del tipo de dato number.
	 * @return cadena de bits con el signo correspondiente al numero.
	 */
	public String fillZeros(long number, String lengthOfBits, int quantityBits) {
		String sign  = "";
		String bits = "";
		if(lengthOfBits.length() < quantityBits) {
			if(number < 0 ) {
				sign = "1";
				for (int i = 0; i < (quantityBits- lengthOfBits.length() -1) ; i++) {
					if(i == 0) {
						bits = sign;
					}
					bits = bits + "0";
				}
			}else {
				sign = "0";
				for (int i = 0; i < (quantityBits- lengthOfBits.length()-1) ; i++) {
					if(i == 0) {
						bits = sign;
					}
					bits = bits + "0";
				}
			}
		}
		return bits;
	}
	
	
	//______________Float IEEE754_______________________
	/**
	 * Convierte un numero entero a su representacion en binario.
	 * @param number numero a convertir.
	 * @return representacion binaria del numero.
	 */
	public String intToBinary(int number) {
		return Integer.toBinaryString(number);
	}
	
	/**
	 * Convierte un numero decimal a binario.
	 * @param number numero a convertir.
	 * @param length longitud maxima de bits que puede contener el numero.
	 * @return representacion binaria del numero.
	 */
	public String decimalToBinary(double number, int length) {
		String binaryDecimal = "";
		while(true) {
			
			if (binaryDecimal.length() > length) {
				break;
			}
			number = number * 2;
			if (number == 0.0) {
				break;
			}
			String var = "";
			var += number;
			char[] vectorBits = var.toCharArray();
			binaryDecimal += vectorBits[0];
			
			if (vectorBits[0] == '0') {
				
			}else if (vectorBits[0] == '1') {
				number = number -1.0;
			}
			
		}
		return binaryDecimal;
	}
	
	
	/**
	 * Obtiee la representacion binaria de un numero decimal.
	 * @param intPart parte entera del numero.
	 * @param decimalPart parte decimal del numero.
	 * @return representacion binaria del numero.
	 */
	public String getDecimalBinary(int intPart, double decimalPart) {
		return intToBinary(intPart) + "." + decimalToBinary(decimalPart,1000);
	}
	
	/**
	 * obtiene la parte entera de un numero de tipo double(ej: 3.1416 => 3)
	 * @param number Numero al cual se le saca la parte entera.
	 * @return parte entera del numero.
	 */
	public int getPartInt(double number) {
		if (number < 0 ) {
			number = Math.abs(number);
		}
		String str = String.valueOf(number);
		return  Integer.parseInt(str.substring(0, str.indexOf('.')));
	}
	
	/**
	 * obtiene la parte decimal de un numero de tipo float (ej: 3.1416 => 0.1416)
	 * @param number Numero al cual se le saca la parte decimal.
	 * @return parte decimal del numero.
	 */
	public float getPartDecimal(float number) {
		if (number < 0 ) {
			number = Math.abs(number);
		}
		String str = String.valueOf(number);
		return Float.parseFloat(str.substring(str.indexOf('.')));
	}
	
	/**
	 * obtiene la parte decimal de un numero de tipo double(ej: 3.1416 => 0.1416)
	 * @param number Numero al cual se le saca la parte decimal.
	 * @return parte decimal del numero.
	 */
	public double getPartDecimalDouble(double number) {
		if (number < 0 ) {
			number = Math.abs(number);
		}
		String str = String.valueOf(number);
		return Double.parseDouble(str.substring(str.indexOf('.')));
	}
	/**
	 * Concatena la parte entera y decimal del numero en su representacion binaria.
	 * @param partInt Parte entera en binario.
	 * @param partDecimal Parte decimal en binario.
	 * @return  parte entera y decimal concatenada.
	 */
	public String concatBinaryIntWhitDecimal(String partInt, String partDecimal) {
		return partInt + "." + partDecimal;
	}
	
	public String formatIEEE754(float number, String mantise, int quantityBits, String exponentBits) {
		String sign  = "";
		String bits = "";
		
		if(mantise.length() < quantityBits) {
			for (int i = 0; i < (quantityBits- (mantise.length())  ) ; i++) {
				bits = bits + "0";
			}
		}
		if (number < 0.0 ) {
			sign = "1";
		}else {
			sign = "0";
		}
		return sign + "   " +  exponentBits +  "   " +  mantise +  bits;
	}
	
	/**
	 * Concatena y da forma a la mantiza, quedando la representacion binaria de la parte entera seguida de la parte decimal.
	 * @param partInteger Representacion binaria de la parte entera del numero.
	 * @param partDecimal Representacion binaria de la parte decimal del numero.
	 * @return Mantisa con la parte entera y decimal en binario.
	 */
	public String mantise(String partInteger, String partDecimal) {
//		String mantise = partInteger.substring(0, 1) + " . " + partInteger.substring(1,partInteger.length() ) +  partDecimal;
		String mantise =  partInteger.substring(1,partInteger.length() ) +  partDecimal;
		return mantise ;
	}
	
	/**
	 * Obtiene la cantidad de veces que se desplaza la coma hacia la izquierda para saber la potencia del numero.
	 * @param numberBinary Numero en binario del cual se quiere saber el exponente o potencia.
	 * @return Potencia del numero  binario.
	 */
	public int getExponent(String numberBinary) {
		char[] charArray = numberBinary.toCharArray();
		int count = 0;
		boolean coma = false;
		int j = charArray.length;
		for (int i = charArray.length-1 ; i > 0; i--) {
			if (charArray[i] == '.' ) {
				coma = true;
			}
			if ( coma == true) {
				count ++;
			}
		}
		return count-1;
		
	}
	
	//__________________________________
	
	//_____________________________________COMPLEMENT TO 1_______________________
	/**
	 * Transforma un numero binario original a su representacion en complemento a 1.
	 * @param number numero a convertir.
	 * @return representacion binaria en complemento a 1.
	 */
	public String changeToComplement1(String number) {
		String aux = number;
		char[] arrayAux = aux.toCharArray();
		
		for (int i = 0; i < arrayAux.length; i++) {
			if (aux.charAt(i) == '0') {
				arrayAux[i] = '1';
			}else {
				arrayAux[i] = '0';
			}
		}
		String complement1 = "";
		for (int i = 0; i < arrayAux.length; i++) {
			complement1 = complement1 + arrayAux[i];
		}
		return complement1;
	}
	/**
	 * obtiene la parte significativa de un numero.
	 * @param mantise numero en binario.
	 * @param quantityBits cantidad maxima de bits que puede contener el tipo de dato.
	 * @return parte significativa en bits del numero.
	 */
	public String partSignificative( String mantise, int quantityBits) {
		String bits = "";
		
		if(mantise.length() < quantityBits) {
			for (int i = 0; i < (quantityBits- (mantise.length())  ) ; i++) {
				bits = bits + "0";
			}
		}
		return     bits + mantise;
	}
	/**
	 * Convierte un numero de tipo entero a binario.
	 * @param number numero a convertir.
	 * @return numero binario del numero.
	 */
	public String ToBinary(int number) {

		String rel = "";
		while(number > 0) {
			int numberOne =  (number % 2);
			rel = numberOne + rel;
			number /= 2;
		}
		return rel;
	}
	/**
	 * Convierte un numero de tipo long a binario.
	 * @param number numero a convertir.
	 * @return numero binario del numero.
	 */
	public String ToBinary(long number) {

		String rel = "";
		while(number > 0) {
			long numberOne =  (number % 2);
			rel = numberOne + rel;
			number /= 2;
		}
		return rel;
	}
	
	/**
	 * convierte un binario a su representacion en signo magnitud.
	 * @param mantise
	 * @param number
	 * @return
	 */
	public String magnitudeSign(String mantise, int number){
		String significative =  mantise.substring(1, mantise.length());
		String sign = "";
		if(number < 0 ) {
			sign = "1";
		}else {
			sign = "0";

		}
		return sign + significative;
	}
	/**
	 * convierte un numero long binario a su representacion en signo magnitud .
	 * @param mantise
	 * @param number
	 * @return
	 */
	public String magnitudeSign(String mantise, long number){
		String significative =  mantise.substring(1, mantise.length());
		String sign = "";
		if(number < 0 ) {
			sign = "1";
		}else {
			sign = "0";

		}
		return sign + significative;
	}
	
	
	/**
	 * Obtiene la parte entera de un decimal, ej(3.1416 => 1416);
	 * @param number numero a obtener la parte decimal entera.
	 * @return parte entera del decimal.
	 */
	public  int getParIntDecimalDouble(double number) {
		String str = String.valueOf(number);
		int decNumberInt = Integer.parseInt(str.substring(str.indexOf('.') + 1));
		return decNumberInt;
	}
}













