public class Main {
	public static void main(String[] args) {
		Addition a1 = new Addition(5.5, 6.5);
		System.out.println("Addition Result: " + a1.getAddition());
		
		Addition a2 = new Addition();
		a2.setvals(5.5);
		System.out.println("Addition Result: " + a2.getAddition());
		
		Addition a3 = new Addition();
		a3.setvals(5.5, 7.5);
		System.out.println("Addition Result: " + a3.getAddition());
	}
}
