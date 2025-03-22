public class Vehicle {
	private String brand;
	private double speed;

	public Vehicle() {
		System.out.println("Base Default Constructor Called!");
	}

	public Vehicle(String brand, double speed) {
		this.brand = brand;
		this.speed = speed;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getBrand() {
		return brand;
	}

	public double getSpeed() {
		return speed;
	}

	public void showDetails() {
		System.out.println("Brand: " + brand);
		System.out.println("Speed: " + getSpeed() + " km/h");
	}

}
