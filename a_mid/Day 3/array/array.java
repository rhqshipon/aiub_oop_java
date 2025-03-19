import java.util.Scanner;

public class array {
	public static void main(String[] args)    {
		System.out.println();
		System.out.println("1D Array Approch - 1");
		System.out.println();
		System.out.println();
		
		int [] arr1 = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter inputs for 1st array: ");
		
		for(int i = 0; i < 5; i++)    {
			arr1[i] = input.nextInt();
		}
		
		for(int i = 0; i < 5; i++)    {
			System.out.print(arr1[i] + "    ");
		}
		
		
	}
}
