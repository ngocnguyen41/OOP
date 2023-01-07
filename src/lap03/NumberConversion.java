package lap03;

public class NumberConversion {
	public static String toRadix(String in, int inRadix, int outRadix) {
		int count = Integer.parseInt(in, inRadix);
		if (outRadix == 16) {
			String result = Integer.toHexString(count);
			return result;
		} else if (outRadix == 10) {
			String result = String.valueOf(count);
			return result;
		} else if (outRadix == 2) {
			String result = Integer.toBinaryString(count);
			return result;
		} else {
			String result = Integer.toOctalString(count);
			return result;
		}
	}

	public static void main(String[] args) {
		String inStr = "A1B2";
		int inRadix = 16;
		int outRadix = 2;

		if (outRadix == 8 || outRadix == 10 || outRadix == 16 || outRadix == 2) {
			System.out.println("'" + inStr + "'" + "in radix " + inRadix + " is "
					+ toRadix(inStr, inRadix, outRadix)
					+ " in radix " + outRadix);
		} else {
			System.out.println("Error");
		}
	}
}