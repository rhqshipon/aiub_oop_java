public class TypeCastingAndParsing
{
	public static void main(String[] args)
	{
		short s1 = 130, s2;
		byte f1, f2 = 10;
		
		System.out.print("Implicit Type Casting:  ");
		s2 = f2;
		System.out.println(s2);
		
		System.out.print("Explicit Type Casting:  ");
		f1 = (byte)s1;
		System.out.println(f1);
		
		
		
		String numberString = "123";
		int number = Integer.parseInt(numberString);
		
		System.out.println("The integer value is: " + number);
		System.out.println("Double of that number: " + (number + number));
	}
}