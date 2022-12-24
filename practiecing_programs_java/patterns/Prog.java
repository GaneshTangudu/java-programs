class Prog
{
	public static void main(String[] args) 
	{
		int div = 15;
		int divs = 4 ;
		int temp = div;
		int count = 0;

		while (div>=divs)
		{
			count++;
			div = div-divs;
		}
		System.out.println(div);
		System.out.println(count);
	}
}
