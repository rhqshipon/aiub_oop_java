public class Addition {
	private double a;
	private double b;
	
	// Constructors
	public Addition()	{}
	public Addition(double a)	{
		this.a = a;
	}
	public Addition(double a, double b)	{
		this.a = a;
		this.b = b;
	}
	
	// Useless for this purpose
	public void setA(double a)	{this.a = a;}
	public void setB(double b)	{this.b = b;}
	
	// Method Overloading
	public void setvals(double a)	{this.a = a;}
	public void setvals(double a, double b)	{this.a = a; this.b = b;}
	
	// Getters
	public double getA()	{return a;}
	public double getB()	{return b;}
	public double getAddition()	{return a+b;}
}
