class Largest_Smallest 
{
	public static void main(String[] args) 
	{
		int a[]={11,13,45,67,789,543,898,98};
		int largest=0;
		int smallest=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				if(a[i]>largest)
				{
					largest=a[i];
				}
			}
		}
		     smallest=largest;
			 for(int j=0;j<a.length;j++)
		{
				 if(a[j]%2==0)
			{
					 if(smallest>a[j])
				{
						 smallest=a[j];
				}
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
	}
}
