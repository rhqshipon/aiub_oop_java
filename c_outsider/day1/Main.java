public class Main	{
	private int length;
	private int width;
	
	public Main(){System.out.println("Default Constructor Called");}
	
	public Main(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	public void setLength(int a, int b){
		this.length = length;
		this.width = width;
	}
	
	public void displayDetails()	{
		System.out.println(length);
		System.out.println(width);
		System.out.println("Done");
	}
	
	
	public static void main(String[] args) {
		
		// Main m1 = new Main();
		// m1.setLength(1, 2);
		// m1.displayDetails();
		
		
		Main m2 = new Main(4, 2);
		m2.displayDetails();
		m2.setLength(8, 3);
		m2.displayDetails();
		
		
		
		//System.out.println("Hello World");
		
	}
}