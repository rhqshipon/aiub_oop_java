public class Car extends Vehicle {
	private String fuelType;

	public Car() {
		System.out.println("Car Default Constructor Called!");
	}

	public Car(String brand, double speed, String fuelType) {
		super(brand, speed);
		this.fuelType = fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void showCarDetails() {
		super.showDetails();
		System.out.println("Fuel Type: " + fuelType);
	}
}
