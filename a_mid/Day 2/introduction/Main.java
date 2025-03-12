import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner o1 = new Scanner(System.in);
		
		//Take the user's name as input
		System.out.print("Enter your name: ");
		String name = o1.nextLine();
		
		//Take the user's age as input
		System.out.print("Enter your age: ");
		int age = o1.nextInt();
		o1.nextLine();
		
		//Take the user's phone number as input
		System.out.print("Enter your phone number: ");
		String phone_number = o1.nextLine();
		
		//Take the user's mair khawa count as input
		System.out.print("Enter the amount of mair you have got: ");
		int mair = o1.nextInt();
		
		//Print empty lines for good formatting on print
		System.out.println("\n");
		
		//Print out everything we know so far
		System.out.println("Your name is: " + name);
		System.out.println("Your age is: " + age);
		System.out.println("Your phone number is: " + phone_number);
		System.out.println("The amount of mair you have got is: " + mair);
		
		//destroying the object after we finish our work
		o1.close();
	}
}
