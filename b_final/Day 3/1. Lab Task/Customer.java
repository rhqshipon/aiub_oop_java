public class Customer {
	private String name;
	private String phoneNumber;
	private Vehicle[] vehicles = new Vehicle[10]; // (Customer owns many Vehicles)

	public Customer() {}

	public Customer(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	private void oneLiner() {
		System.out.println("------------------------------------------------");
	}

	private void gapDivider() {
		System.out.println("\n");
	}

	public void addVehicle(Vehicle v) {
		boolean flag = false;
		int i;
		for (i = 0; i < vehicles.length; i++) {
			if (vehicles[i] == null) {
				vehicles[i] = v;
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Success: Model " + vehicles[i].getModel() + " insertion successful!");
		} else {
			System.out.println("Error: Model " + v.getModel() + " insertion failed!");
		}
	}

	public void showAllVehicles() {
		boolean flag = false;
		int i;
		for (i = 0; i < vehicles.length; i++) {
			if (vehicles[i] != null) {
				gapDivider();
				oneLiner();
				System.out.println("Showing info for vehicle: " + i);
				oneLiner();
				vehicles[i].showDetails();
				vehicles[i].start();
				oneLiner();
			}
		}
	}

	public void searchVehicle(String model) {
		boolean flag = false;
		int i;
		for (i = 0; i < vehicles.length; i++) {
			if (vehicles[i] != null) {
				if (vehicles[i].getModel().equals(model)) {
					flag = true;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("Success: Model " + vehicles[i].getModel() + " exists");
		} else {
			System.out.println("Error: Model " + model + " does not exist");
		}
	}
	
	public void customerInfo()	{
		System.out.println("Customer Name: " + name);
		System.out.println("Phone Number: " + phoneNumber);
	}

}
