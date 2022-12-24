 class  Multiplication1
{
	public void table(int a)
	{
		for(int i=1;i<10;i++)
		{
			System.out.println(a+ "x" +i+" = "+i*a);
		}
	}
	public static void main(String[] args) 
	{
		Multiplication1 m1=new Multiplication1();
		m1.table(5);
	}
}
