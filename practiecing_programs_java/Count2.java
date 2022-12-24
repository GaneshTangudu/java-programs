//*count divisible 3&7 and check even or odd*//
import java.util.*;
class Count2 
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
				System.out.println(count);
			}
			if(count%2==0)
				System.out.println("the count is even:"+count);
			if(count%2!=0)
				System.out.println("the count is odd:"+count);
		}
	}
}
	
