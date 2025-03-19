public class Main {
	
	private int value = 10;
	
	public Main()    {
		System.out.println("Default constructor called!");
	}
	
	public Main(int v)    {
		value = v;
		System.out.println("Parameterized constructor called!");
		System.out.println(value);
	}
	
	public void myMethod()    {
		
	}
	
	public static void main(String[] args) {
		Main o1 = new Main();
		Main o2 = new Main(1000);
	}
}
