public class Start {
	public static void main(String[] args) {
		
		// Constructor Overloading in Vehicle
		Vehicle v1 = new Vehicle("Generic Model");
		Vehicle v2 = new Vehicle("Premium Model", 50000);

		// Method Overloading: start() vs start(String mode)
		v1.start();
		v2.start("eco");
		v2.start("sport");
		v2.start("unknown");
		System.out.println("------------------------------------------------");

		System.out.println("\n\n------------------------------------------------");
		// Method Overriding: Car and Motorcycle override start() and showDetails()
		Car car = new Car("Toyota", 20000.55, 4);
		Motorcycle moto = new Motorcycle("Honda", 15000.56, true);

		car.showDetails();
		car.start();
		System.out.println("------------------------------------------------");

		moto.showDetails();
		moto.start();
		System.out.println("------------------------------------------------");


		// Polymorphic Behavior: Vehicle reference holds Car and Motorcycle
		System.out.println("\n\n------------------------------------------------");
		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = car;
		vehicles[1] = moto;

		// Calls overridden method showDetails(), start()
		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i].showDetails();
			vehicles[i].start();
			System.out.println("------------------------------------------------");
		}
		
		
		// One-to-Many Association: Customer owns multiple Vehicles
		Car car2 = new Car("Stoneridge", 50000.55, 6);
		Motorcycle moto2 = new Motorcycle("Apache", 16000.56, true);
		Car car3 = new Car("car 3", 50700.55, 8);
		Motorcycle moto3 = new Motorcycle("moto 3", 19000.56, true);
		System.out.println("\n\n------------------------------------------------");
		Customer customer = new Customer("David Smith", "+123456789");
		customer.customerInfo();
		customer.addVehicle(car);
		customer.addVehicle(moto);
		customer.addVehicle(car2);
		customer.addVehicle(moto2);
		customer.addVehicle(car3);
		customer.addVehicle(moto3);
		System.out.println("------------------------------------------------");
		customer.showAllVehicles();
		
		System.out.println("\n\n------------------------------------------------");
		customer.searchVehicle("Toyota");
		System.out.println("------------------------------------------------");
		customer.searchVehicle("Honda");
		System.out.println("------------------------------------------------");
		customer.searchVehicle("Toyotaa");
		System.out.println("------------------------------------------------");
	}
}