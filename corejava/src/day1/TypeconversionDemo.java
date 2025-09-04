package day1;

public class TypeconversionDemo {

	public static void main(String[] args) {
		//implicit
		byte num1 = 127;
		int num2 = num1;
		
		//explicit
		int num3 = 200;
		byte num4 = (byte)num3;
		System.out.println(num4);

	}

}
