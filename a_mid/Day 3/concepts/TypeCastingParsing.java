public class TypeCastingParsing
{
	public static void main(String[] args)
	{
		short s1, s2 = 130;
		byte b1 = 100, b2;
		
		s1 = b1;
		System.out.println("Implicit type casting: " + s1);
		
		b2 = (byte)s2;
		System.out.println("Explicit type casting: " + b2);
		
		String value = "123";
		int number = Integer.parseInt(value);
		
		System.out.println(number + number);
	}
}