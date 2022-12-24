//*program to print whether given number is armstrong number*//
class Armstrong 
{
	public static void main(String[] args) 
	{
		int n=123;
		int sum=0;
		int count=0;
		int temp1=n;
		int temp2=n;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		while(temp1!=0)
		{
			int lastdigit=temp1%10;
			int product=1;
			for(int i=1;i<=count;i++)
			{
				product=product*lastdigit;
			}
			sum=sum+product;
			temp1=temp1/10;
		}
		if(sum==temp2)
		{
			System.out.println("armstrog number");
		}
		else
		{
			System.out.println("not armstrong number");
		}

		
	}
}
