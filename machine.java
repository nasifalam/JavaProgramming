package machine;
import java.util.Scanner;


public class machine {
	

	public static boolean isPrime (int number) 

	{
		/* If the number has no factors,we return a true */
	for (int i=2;i<number;i++)
		if (number%i==0)
		 {
			return false;
		 }
		
		return true;

	}

	
	public static void findPrimesinRange(int min, int max)
	
	{
		int count=0;

		
		for (int i=min;i<=max ;i++ ) {
			
			if (i<=1) {
				
				System.out.println(i + ".Not Prime");

			}

			else if (isPrime(i))
			{
				count++;
				System.out.println(i + " Is Prime.Count:"+ (count));

			}
			
			
		}
			
	}
	/* A program to check whether an integer is a prime or not */
	public static void main(String[] args) {
	
	findPrimesinRange(1,1000);


}
}
