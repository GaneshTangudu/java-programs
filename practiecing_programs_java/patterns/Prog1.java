class Prog1 
{
	public static void main(String[] args) 
	{
		int num = 235790;
		int large = 0;
		int small = 9;

		while (num!=0)
		{
			int ld = num%10;
			int count = 0;
			for (int i=1;i<=ld ;i++ )
			{
				if (ld%i==0)
				{
					count++;
				}
				
			}
			if (count==2)
			{
				while (ld!=0)
				{
					if (large < ld)
					{
						large = ld;
					}
					if (small > ld)
					{
						small = ld;
					}
					ld /= 10;
				}
			}
			num /= 10;
		}
		System.out.println("The largest prime is : "+large);
		System.out.println("The smallest prime is :"+small);


	}
}
