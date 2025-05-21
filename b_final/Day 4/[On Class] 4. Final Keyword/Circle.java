public final class Circle extends Shape
{
    private final double radius;

    public Circle(double radius)
	{
        this.radius = radius;
    }
	
    @Override
    protected double area()
	{
		//Constants.PI = 100.0;
        return Constants.PI * radius * radius;
    }
	
	/*
	@Override
	public final void printArea()
	{
        System.out.println("Hello");
    }
	*/
}
