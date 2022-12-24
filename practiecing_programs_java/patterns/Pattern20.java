class Pattern20 
{
	public static void main(String[] args) 
	{
		int star=0;
		for(int i=0;i<=7;i++)
		{
		if(i>4)
			
			star--;
		
	   else
		
			
			star++;
			for(int j=2;j<=star;j++)
			{
				System.out.print("*"+" ");
			}
		
		System.out.println();
		}
	
	}
}
