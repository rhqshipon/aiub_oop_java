public class Main {
	public static void main(String[] args) {
		Addition a1 = new Addition(5.5);
		System.out.println("Addition Result: " + a1.getAddition());
		
		Addition a2 = new Addition(5.5, 6.5);
		System.out.println("Addition Result: " + a2.getAddition());
	}
}
