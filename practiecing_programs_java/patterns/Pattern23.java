1 a b c d
2 3 a b c
4 5 6 a b
7 8 9 0 a
1 2 3 4 5

class Pattern23 
{
	public static void main(String[] args) 
	{
		int n = 1;
		

		for (int i=1;i<=5 ;i++ )
		{
			char ch = 'a';
			for (int j=1;j<=5 ;j++)
			{
				if (i<j)
				{
					System.out.print(ch++ +" ");
				}
				else
				{
					
					System.out.print(n++ +" ");
				}
				if (n>9)
				{
					n = 0;
				}
				
			}
			System.out.println();
		}
	}
}
