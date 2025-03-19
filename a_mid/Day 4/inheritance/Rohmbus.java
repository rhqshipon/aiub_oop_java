public class Rohmbus extends Shape	{
	
	private double diagonal2;
	
	public Rohmbus(){System.out.println("Rhombus default constructor");}
	public Rohmbus(double diagonal1, double diagonal2)	{
		super(diagonal1);
		this.diagonal2 = diagonal2;
	}
	
	public void setDiagonal1(double diagonal1){super.setValue(diagonal1);}
	public void setDiagonal2(double diagonal1){this.diagonal2 = diagonal2;}

	public double getDiagonal1(){return super.getValue();}
	public double getDiagonal2(){return diagonal2;}
	
	@Override
	public double getArea(){return .5*super.getValue()*diagonal2;}
}