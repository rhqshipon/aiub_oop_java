public class MethodsAndConstructors
{
	private int value;
	
	public MethodsAndConstructors()
	{
		System.out.println("Default constructor called");
	}
	
	public MethodsAndConstructors(int i)
	{
		value = i;
		System.out.println("Parameterized constructor called:  " + value);
	}
	
	public void myMethod()
	{
		System.out.println("This is my method");
	}
	
	public static void main(String[] Parameters)
	{
		MethodsAndConstructors c1 = new MethodsAndConstructors();
		MethodsAndConstructors c2 = new MethodsAndConstructors(100);
		
		c1.myMethod();
		c2.myMethod();
	}
}