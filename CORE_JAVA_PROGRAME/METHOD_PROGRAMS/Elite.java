import java.util.Scanner;
class Elite
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n==0)
		{
		System.out.println("zero");
		}
		else if(n%2!=0)
		{
			raja();
		}
		else if(n%2==0)
		{
			Elite e1=new Elite();
			e1.raja();
		}
	}
	public static void raja()
	{
		System.out.println("odd");
	}
	public void rani()
	{
		System.out.println("even");
	}
}
