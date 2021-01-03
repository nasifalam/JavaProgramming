/* *****************************************************************************
 * Description
 * Here we develop a simple counter using Java. The
 * whole purpose is to learn to convert a for loop into a while loop
 * Date: January 3 2021
 * Author: Nasif Alam, B.Eng
 ********************************************************************************/

public class HelloWorld {

	public static void counter(int n) 
	{
		
	int count=0;
	int i=0;
	
	 System.out.println("Here is the count from 1 to "+ n+" :");
	 System.out.println("");
	
	  while(i<n) 	  
	  {
		 count++;
		 
		 if (count%10==0) {
			 System.out.println(count+"");
		 }
		 else {
			System.out.print(count+"-");
		 }
		 i++;
	  }
	  	  }

	/***
		for (int i=0;i<n;i++)
		{
			count++;
			System.out.println(count);
		}		
	***/
	  
	
	
	public static void main(String[] args) {
	
		counter(100);
	
	}

}
