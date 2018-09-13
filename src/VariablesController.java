
public class VariablesController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		long a = 16;
		int b = 16;
		b += (int)a;
		System.out.println("b = " + b);
		
		byte z = 127;
		byte c = 10;
	 // z = z + 10; doesn't work because 10 is an int by base, 32 > 8.
	 // z++; // Will exceed the 8 bits, causing z to wrap around to -128.
		z = (byte)(z + c);
		System.out.println("z = " + z);
		
		String d = "10";
		int e = 0;
		e = Integer.parseInt(d);
		System.out.println("e = " + e);
		
		int x = 4;
		short y = 0;
	 // y = x ; doesn't work because you're trying to put 32 bits in 16 bits.
		x = y; // Works because you're putting 16 bits into 32 bits.
	}

}
