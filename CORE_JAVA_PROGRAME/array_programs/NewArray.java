import java.util.Scanner;
class NewArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int size=sc.nextInt();
		double []d=new double[size];
		for (int i=0;i<d.length;i++)
		{
			System.out.println("enter the value for index:"+i);
			d[i]=sc.nextDouble();
		}
		for (int i=0;i<d.length;i++)
		{
			System.out.println(d[i]+" ");
		}
	}
}
