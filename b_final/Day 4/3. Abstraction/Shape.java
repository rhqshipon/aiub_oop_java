import java.lang.*;

public class Shape implements ISetterGetter, IArea	{
	protected double value1;
	protected double value2;
	
	public Shape(){}
	
	public Shape(double value1, double value2)	{
		this.value1=value1;
		this.value2=value2;
	}
	
	public void setvalue1(double value1)	{this.value1 = value1;}
	public void setvalue2(double value2)	{this.value2 = value2;}
	public double getvalue1()	{return value1;}
	public double getvalue2()	{return value2;}
	public void displayArea()	{System.out.println("Area of the Circle is: 0");}
}