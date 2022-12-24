//*program to print sunny number*//
import java.util.*;
class Sunny 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		boolean status=false;
		int m=n+1;
		for(int i=1;i<=m;i++)
		{
			if(i*i==m)
			{
				status=true;
				break;
			}
		}
		if(status)
		{
			System.out.println("sunny number");
		}
		else
		{
			System.out.println("not a sunny number");
		}
	}
}



	
