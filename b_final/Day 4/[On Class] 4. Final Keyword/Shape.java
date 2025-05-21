public abstract class Shape
{
    public final void printArea()
	{
        System.out.println("Area = " + area());
    }
	
    protected abstract double area();
}
