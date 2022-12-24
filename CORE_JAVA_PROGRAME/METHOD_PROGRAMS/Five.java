class Five 
{
	public  void sleep()
	{
		System.out.println("sleep well");
	}
	public static void main(String[] args)
	{
		System.out.println("main start...");
		for(int i=1;i<=5;i++)
		{
			Five f1=new Five();
			f1.sleep();
		}
		System.out.println("main ends...");
	}
}
