//*summation of even numbers between m&n*//
import java.util.*;
class Even2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++)
		if(i%2==0)
		{
			sum=sum+i;
		}
		{
		System.out.println(sum);
		}
	}
}
