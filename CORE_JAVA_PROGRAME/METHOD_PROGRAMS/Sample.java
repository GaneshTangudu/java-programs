class Sample 
{
	public  void run() 
	{
		System.out.println("run on road");
	}
	public static void main(String[] args)
	{
		System.out.println("main starts...");
		Sample s1=new Sample();
		s1.run();
		System.out.println("main ends...");
	}
}
