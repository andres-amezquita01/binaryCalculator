package test;

public class TestSizeDatas {
	public static void main(String[] args) {
		System.out.println("tamaño en Bits de Byte " + Byte.SIZE);
		
		System.out.println("tamaño en Bits de Char " + Character.SIZE);
		
		System.out.println("tamaño en Bits de Short-- " + Short.SIZE );

		System.out.println("tamaño en Bits de Int " + Integer.SIZE);

		System.out.println("tamaño en Bits de Long " + Long.SIZE );

		System.out.println("tamaño en Bits de Float " + Float.SIZE);

		System.out.println("tamaño en Bits de Double " + Double.SIZE );
		
		System.out.println("Float a binario: " + Float.floatToIntBits(2123112));
		System.out.println("Binario a Float: " + Float.intBitsToFloat(1010100101));
		System.out.println("Binario a Float: " + Float.floatToRawIntBits(2020));
		
		System.out.println("Entero a binario " + Integer.toBinaryString(-127));
		
		System.out.println("Binario a decimal " + Integer.parseUnsignedInt("00000000000000000000100001010011", 2));
		System.out.println(Long.parseUnsignedLong("0000000000000000000000000000000000000000000000000000110000111011", 2));

	}
}

