public class Motorcycle extends Vehicle {
	private boolean hasCarrier;
	
	//public Motorcycle()	{}
	public Motorcycle(String model, double price, boolean hasCarrier) {
		super(model, price);
		this.hasCarrier = hasCarrier;
	}
	
	@Override
	public void start() {
		System.out.println("Motorcycle is starting smoothly.");
	}

	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Has Carrier: " + hasCarrier);
	}
}
