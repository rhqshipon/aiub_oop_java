import java.lang.*;
import java.util.Scanner;

public class JavaBasic
{
	public static void main (String[] args)
	{
		//System.out.println("Hello World");
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int v1 = s1.nextInt();
		System.out.println("Your entered number is: " + v1);
		
		//Scanner s2 = new Scanner(System.in);
		System.out.print("Enter a double number: ");
		double v2 = s1.nextDouble();
		System.out.println("Your entered double number is: " + v2);
		
		s1.nextLine();
		
		//Scanner s3 = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String v3 = s1.nextLine();
		System.out.println("Your entered string is: " + v3);
		
		s1.close();
		//s2.close();
		//s3.close();
	}
}