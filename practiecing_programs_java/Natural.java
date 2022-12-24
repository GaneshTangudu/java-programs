//*print natural numbers between m&n*//
import java.util.*;
class Natural 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first value");
		int w=sc.nextInt();
		System.out.println("enter the second value");
		int x=sc.nextInt();
		for(int i=w;i<=x;i++)
		{
			System.out.println(i);
		}
	}
}
