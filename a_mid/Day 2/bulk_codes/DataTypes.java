public class DataTypes
{
	int i;
	short s;
	long l;
	
	public static void main(String[] Parameters)
	{
		DataTypes dt = new DataTypes();
		
		System.out.println("Default value of integer is: " + dt.i);
		System.out.println("Default value of short is: " + dt.s);
		System.out.println("Default value of long is: " + dt.l);
		
		System.out.println("Size of  integer: " + (Integer.SIZE / 8) + " bytes");
		System.out.println("Size of  short: " + (Short.SIZE / 8) + " bytes");
		System.out.println("Size of  long: " + (Long.SIZE / 8) + " bytes");
		
		System.out.println("Integer range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
		System.out.println("Short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
		System.out.println("Long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
	}
}