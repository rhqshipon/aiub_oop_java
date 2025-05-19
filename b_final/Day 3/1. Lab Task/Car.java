public class Car extends Vehicle {
	private int numberOfDoors;

	//public Car()	{}
	public Car(String model, double price, int numberOfDoors) {
		super(model, price);
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public void start() {
		System.out.println("Car is starting with a roar!");
	}

	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Number of Doors: " + numberOfDoors);
	}
}
