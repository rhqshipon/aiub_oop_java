import java.util.Scanner;

public class Arrays
{
	public static void main(String[] args)    {
		System.out.println("1D Array Approach 1\n");
		
		int[][] arr1 = new int[3][3];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter inputs for first array: ");
		
		for(int i=0; i<3; i++)    {
			for(int j=0; j<3; j++)    {
				arr1[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Values are: \n");
		
		for(int i=0; i<3; i++)    {
			for(int j=0; j<3; j++)    {
				System.out.print(arr1[i][j] + "   ");
			}
			System.out.println("\n");
		}
		
		
		System.out.println("\n\n1D Array Approach 2\n");
		
		int[][] arr2 = new int[][] {
			                        {1, 2, 3},
									{4, 5, 6},
									{7, 8, 9}
									};
		
		System.out.println("Values are: \n");
		
		for(int i=0; i<3; i++)    {
			for(int j=0; j<3; j++)    {
				System.out.print(arr2[i][j] + "   ");
			}
			System.out.println("\n");
		}
		
		
		
		System.out.println("\n\n1D Array Approach 3\n");
		
		int[][] arr3;
		System.out.print("Enter row size for third array: ");
		int size_row = input.nextInt();
		
		System.out.print("Enter column size for third array: ");
		int size_col = input.nextInt();
		
		arr3 = new int[size_row][size_col];
		
		System.out.println("Enter inputs for third array: ");
		
		
		for(int i=0; i<size_row; i++)    {
			for(int j=0; j<size_col; j++)    {
				arr3[i][j] = input.nextInt();
			}
		}
		
		
		System.out.println("Values are: \n");
		
		for(int i=0; i<size_row; i++)    {
			for(int j=0; j<size_col; j++)    {
				System.out.print(arr3[i][j] + "   ");
			}
			System.out.println("\n");
		}
	}
}