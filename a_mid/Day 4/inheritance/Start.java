import java.util.Scanner;
public class Start	{
	public static void main(String[] args)	{
		Scanner o1 = new Scanner(System.in);
		
		
		// Rectangle
		System.out.print("\n\n\n");
		System.out.print("Enter rectangle length: ");
		double rectangle_length = o1.nextDouble();
		System.out.print("Enter rectangle width: ");
		double rectangle_width = o1.nextDouble();
		Rectangle r1 = new Rectangle(rectangle_length, rectangle_width);
		System.out.println("Your entered length is: " + r1.getLength());
		System.out.println("Your entered width is: " + r1.getWidth());
		System.out.println("Area is: " + r1.getArea());
		
		
		// Circle
		System.out.print("\n\n\n");
		System.out.print("Enter circle radius: ");
		double circle_radius = o1.nextDouble();
		Circle c2 = new Circle(circle_radius);
		System.out.println("Your entered radius is: " + c2.getRadius());
		System.out.println("Area is: " + c2.getArea());
		
		
		// Triangle
		System.out.print("\n\n\n");
		System.out.print("Enter triangle height: ");
		double triangle_height = o1.nextDouble();
		System.out.print("Enter triangle base: ");
		double triangle_base = o1.nextDouble();
		Triangle t1 = new Triangle(triangle_height, triangle_base);
		System.out.println("Your entered height is: " + t1.getHeight());
		System.out.println("Your entered base is: " + t1.getBase());
		System.out.println("Area is: " + t1.getArea());
		
		// Rombus
		System.out.print("\n\n\n");
		System.out.print("Enter rohmbus's first diagonal: ");
		double rohmbus_diagonal1 = o1.nextDouble();
		System.out.print("Enter rohmbus's second diagonal: ");
		double rohmbus_diagonal2 = o1.nextDouble();
		Rohmbus roh1 = new Rohmbus(rohmbus_diagonal1, rohmbus_diagonal2);
		System.out.println("Your entered first diagonal is: " + roh1.getDiagonal1());
		System.out.println("Your entered second diagonal is: " + roh1.getDiagonal2());
		System.out.println("Area is: " + roh1.getArea());
		
		// Buffer
		System.out.print("\n\n\n");
	}
}