package view;

import java.awt.Color;
import java.awt.Font;

public class ConstantsUI {
	public  static  final String T_BOX_TYPE_DATA = "Tipo de dato";
	public  static  final String MENU_ITEM_SEND = "Enviar";
	public  static  final String T_MAIN_WINDOW = "Tipos de datos";
	public  static  final String T_TEXT_DATA = "Dato";
	
	public  static  final String ASCII = "Valor ASCII:   ";
	public  static  final String VALUE_BITS = "Valor en bits:   ";
	public  static  final String UNICODE = "Valor  UNICODE:   ";

	public  static  final String T_TEXT_PLACE_HOLDER = "Por favor,Ingrese aqui el dato.";
	public  static  final String T_TEXT_CONFIGURATION_BITS = "Configuracion en bits Complemento a 2";
	public  static  final String T_TEXT_CONFIGURATION_BITS_COMPLEMENT_TO_ONE = "Configuracion en bits Complemento a 1";
	public  static  final String T_TEXT_CONFIGURATION_BITS_EXCESS = "Configuracion en bits Exceso 2n-1";
	public  static  final String T_TEXT_CONFIGURATION_BITS_MAGNITUDE_SIGN = "Configuracion en bits signo-magnitud";
	public  static  final String T_TEXT_CONFIGURATION_BITS_WHIT_FORMAT = "Configuracion en bits con formato IEEE754";
	public  static  final String T_TEXT_BITS_CONFIGURATION = "Configuracion de bits.";
	public  static  final String T_TEXT_CHARACTER_OR_STRING_BORDER = "Caracter o cadena de texto.";
	public  static  final String T_TEXT_CHARACTER_OR_STRING = "Por favor, ingrese 1 caracter (si es char) o cadena de texto (si es String).";
	public  static  final String T_TEXT_NUMBER_REPRESENTING_THE_CONFIGURATION = "Numero que representa la configuracion de bits.";
	public  static  final String T_TEXT_AREA_REPRESENTING_THE_TEXT_OR_CHARACTER = "Configuracion de bits que representa el caracter o texto.";

	public  static  final String AUTOR_NAME = "Andrés Felipe Amezquita Gordillo";
	
	public  static  final String SIZE_BYTE = "\nbyte: " + Byte.MAX_VALUE;
	public  static  final String SIZE_SHORT = "\nshort: " + Short.MAX_VALUE;
	public  static  final String SIZE_INT = "\nint: " + Integer.MAX_VALUE;
	public  static  final String SIZE_LONG = "\nlong: " + Long.MAX_VALUE;
	public  static  final String SIZE_FLOAT = "\nfloat: " + Float.MAX_VALUE;
	public  static  final String SIZE_DOUBLE = "\ndouble: " + Double.MAX_VALUE;
	
	public  static  final String T_BUTTON_SEND = "Convertir";
	public  static  final String T_BUTTON_TO_BINARY = "Convertir a binario";
	public  static  final String T_BUTTON_TO_NUMBER = "Convertir a numero";
	public  static  final String T_BUTTON_TO_BINARY_WITH_FORMAT = "Convertir a binario con formato";
	public  static  final String T_BUTTON_FROM_CHARACTER_TO_BINART = "Convertir caracter a binario";

	public  static  final String MESSAGE_ERROR_CHAR = "Por favor, dato tipo char unicamente puede contener 1 caracter.";
	public  static  final String MESSAGE_ERROR_NUMBER = "El numero no corresponde con el tipo de dato ";
	public  static  final String MESSAGE_ERROR_FORMAT_NUMBER = "Por favor, ingrese unicamente numeros, si es entero sin punto y si es doble con punto";
	public  static  final String MESSAGE_UNAVAILABLE = "No disponible para este tipo de dato.";
	public  static  final String MESSAGE_ERROR_TOP_SIZE_DATA = "Recuerde que el maximo valor que puede representar cada tipo de dato es:" 
																+SIZE_BYTE + SIZE_SHORT + SIZE_INT + SIZE_LONG + SIZE_FLOAT + SIZE_DOUBLE;

	public static final Color COLOR_DARCK_BLUE = new Color(60, 128, 215);
	public static final Color COLOR_LIGTH_BLUE = new Color(101, 153, 255);

	public static final Font RUBIK_BOLD_16 =  new Font("Rubik", Font.BOLD, 16);
	public static final Font FONT_MAIN_WINDOW_LABELS = new Font("Gadugi", Font.PLAIN, 18);
	public  static  final String PATH_ICON_APP = "../img/binarios.png";

}
