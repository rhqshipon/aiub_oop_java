public class SportsCar extends Car {
	private boolean turbo;

	public SportsCar() {
		System.out.println("SportsCar Default Constructor Called!");
	}

	public SportsCar(String brand, double speed, String fuelType, boolean turbo) {
		super(brand, speed, fuelType);
		this.turbo = turbo;
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}

	public boolean getTurbo() {
		return turbo;
	}

	public void showSportsCarDetails() {
		super.showCarDetails();
		System.out.println("Turbo Mode: " + turbo);
	}
}
