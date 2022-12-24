//*program to find the summation of the natural numbers between m&n is perfect number or not a perfect number.*//
import java.util.*;
class NaturalPerfect 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		int sum=0;
	    for(int i=1;i<sum;i++)
		{
			if (sum%i==0)
			{
			sum=sum+i;
			}
		}
		if(sum==sum)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("not a perfect number");
		}
	}
}
		
			
	
