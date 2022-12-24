class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int arr[]={1,5,9,11,123,1234};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=1;j<=arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
			
		
	

