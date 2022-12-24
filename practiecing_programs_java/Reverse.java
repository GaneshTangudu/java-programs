//*print the reversing number*//
import java.util.*;
class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int n=0;
		while(num!=0)
		{
			n=num%10;
			System.out.println(n);
			num=num/10;
		}
	}
}
