import java.util.Scanner;

public class Arrays
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.println();
		System.out.println("1D Array Approach - 1");
		System.out.println();

		int[] arr1 = new int[5];
		
		System.out.println("Enter inputs for first array-");
		for(int i=0; i<5; i++)
		{
			arr1[i] = input.nextInt();
		}
		
		System.out.print("Values are: ");
		for(int i=0; i<5; i++)
		{
			System.out.print(arr1[i] + "   ");
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("1D Array Approach - 2");
		System.out.println();

		int[] arr2 = new int[] {10, 20, 30, 40, 50};
		
		System.out.print("Values are: ");
		for(int i=0; i<5; i++)
		{
			System.out.print(arr2[i] + "   ");
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("1D Array Approach - 3");
		System.out.println();

		int[] arr3;
		System.out.print("Enter array size: ");
		int size = input.nextInt();
		arr3 = new int[size];
		
		System.out.println("Enter inputs for third array-");
		for(int i=0; i<size; i++)
		{
			arr3[i] = input.nextInt();
		}
		
		System.out.print("Values are: ");
		for(int i=0; i<size; i++)
		{
			System.out.print(arr3[i] + "   ");
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("2D Array Approach - 1");
		System.out.println();

		int[][] arr4 = new int[2][3];
		
		System.out.println("Enter inputs for fourth array-");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr4[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Values are-");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr4[i][j] + "   ");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("2D Array Approach - 2");
		System.out.println();

		int[][] arr5 = new int[][] { {111, 222, 3434343}, {333, 444, 555} };
		
		System.out.println("Values are-");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr5[i][j] + "   ");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("2D Array Approach - 3");
		System.out.println();

		int[][] arr6;
		System.out.print("Enter array row size: ");
		int rowSize = input.nextInt();
		System.out.print("Enter array column size: ");
		int columnSize = input.nextInt();
		arr6 = new int[rowSize][columnSize];
		
		System.out.println("Enter inputs for sixth array-");
		for(int i=0; i<rowSize; i++)
		{
			for(int j=0; j<columnSize; j++)
			{
				arr6[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Values are-");
		for(int i=0; i<rowSize; i++)
		{
			for(int j=0; j<columnSize; j++)
			{
				System.out.print(arr6[i][j] + "   ");
			}
			System.out.println();
		}
	}
}