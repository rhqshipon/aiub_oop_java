import java.lang.*;

public class Rectangle extends Shape implements ISetterGetter, IArea	{
	public Rectangle(){super();}
	public Rectangle(double value1, double value2){super(value1, value2);}
	
	public void setvalue1(double value1){super.setvalue1(value1);}
	public void setvalue2(double value2){super.setvalue2(value2);}
	
	public double getvalue1(){return this.value1;}
	public double getvalue2(){return this.value2;}
	
	@Override
	public void displayArea()	{
		System.out.println("Area of Rectangle is: "+(this.value1*this.value2));
	}
}