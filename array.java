// Creating 1D array in java read/print !
import java.util.Scanner;
class array
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[5];       //Declare array
		int i;
		System.out.print("Reading 1D Array:\n");

		//Reading 1D array !
		for(i=0;i<5;i++)
		{
			System.out.print("Enter ar["+i+"]:");
			ar[i]=sc.nextInt();
		} 

		// Printing 1D array !	
		System.out.print("\n Given array \n");
		for(i=0;i<5;i++)
		{
			System.out.print("  "+ar[i]);
		}
	}
}