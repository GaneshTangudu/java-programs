class Even
{
	public static void main(String[] args) 
	{
		int a[]={32,34,36,38,40,44,46,48};
		System.out.println("total length of an array:"+a.length);
		for(int j=0;j<a.length;j++)
		{
			if(j%2==0)
			{
				System.out.println(a[j]);
			}
		}
	}
}
