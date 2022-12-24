//*program to print the perfect square number.*//
import java.util.*;
class PerfectSquare 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(i*i==num)
			{
				System.out.println("perfect square");
			}
			else
			{
				System.out.println("not a perfect square");
			}
		}
	}
}
	
