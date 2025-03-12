public class DataTypes
{
	int i;
	long l;
	short s;
	
	public static void main(String[] args)
	{
		DataTypes dt = new DataTypes();
		
		System.out.println("Default value of integer is: " + dt.i);
		System.out.println("Default value of integer is: " + dt.l);
		System.out.println("Default value of integer is: " + dt.s);
		
		System.out.println("Size of integer is: " + Integer.SIZE/8 + " bytes");
		System.out.println("Size of long is: " + Long.SIZE/8 + " bytes");
		System.out.println("Size of short is: " + Short.SIZE/8 + " bytes");
		
		System.out.println("Range of integer is: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
		System.out.println("Range of long is: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
		System.out.println("Range of short is: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
	}
}