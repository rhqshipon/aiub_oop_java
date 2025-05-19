public class Vehicle {
	protected String model;
	protected double price;
	
	public Vehicle(String model)	{this.model = model;}
	public Vehicle(String model, double price)	{
		this.model = model;
		this.price = price;
	}
	
	public void setModel(String model)	{this.model = model;}
	public void setPrice(double price)	{this.price = price;}
	
	public String getModel()	{return model;}
	public double getPrice()	{return price;}
	
	public void start()	{System.out.println("Vroooommmmmm!");}
	public void start(String mode)	{
		if(mode.equals("eco"))	{System.out.println("ECO Mode: Vroooommmmmm!");}
		else if(mode.equals("sport"))	{System.out.println("Sport Mode: Vroooommmmmm!");}
		else	{System.out.println("Other mode. Not defined, but still, Vroooommmmmm!");}
	}
	
	public void showDetails()	{
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);
	}
}
