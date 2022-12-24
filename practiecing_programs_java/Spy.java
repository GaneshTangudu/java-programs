//*check the given number is spy number or not*//
import java.util.*;
class Spy 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int n=0;
		int sum=0;
		int product=1;
		while(num!=0)
		{
			n=num%10;
			sum=sum+n;
			product=product*n;
			num=num/10;
		}
		System.out.println(sum);
		System.out.println(product);
		if(sum==product)
		{
			System.out.print("the number is spy number");
		}
		else
		{
			System.out.println("the num is not spy number");
		}
	}
}
