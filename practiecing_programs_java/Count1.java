//*print and count the numbers which has 7 in it between m&n*//
import java.util.*;
class Count1 
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
			int a=i;
			while(a!=0)
			{
				int lastdigit=a%10;
				if(lastdigit==7)
				{
					System.out.println(a);
					count++;
					break;
				}
				a=a/10;
			}
		}
	}
}
	