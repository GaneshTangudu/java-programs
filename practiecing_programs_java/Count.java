//*count and print the numbers which are divisible by 3&7 between m&n.*//
import java.util.*;
class Count
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int m=sc.nextInt();
		System.out.println("enter the second number");
		int n=sc.nextInt();
		int count=0;
		for(int i=m;i<=n;i++)
		{
			if((i%3==0)&&(i%7==0))
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println(count);
	}
}
