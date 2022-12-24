class Prog2 
{
	public static void main(String[] args) 
	{
		int a = 0;
		int b = 1;
		int c = 0;
		int sum = 0;


		while (c<999)
		{
			
			c = a+b;
			a = b;
			b = c;
			if (c>=100 && c<=999)
			{
				System.out.println(c);
				sum = sum+c;

			}


		}
		System.out.println("sum of fibonacci series is:"+sum);
	}
}
