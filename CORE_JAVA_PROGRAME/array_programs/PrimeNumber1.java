import java.util.Scanner;
class PrimeNumber1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for (int i=0;i<a.length;i++)
		{
			System.out.println("enter thr value for index:"+i);
			a[i]=sc.nextInt();
		}
		System.out.println("prime numbers in an array:");
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int count=0;
			for(int j=1;j<=n;j++)
			{
				if(n%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(n+" ");
			}
		}
		System.out.println();
	}
}

