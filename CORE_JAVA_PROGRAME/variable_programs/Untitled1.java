class Demo 
{
	public static void result()
	{
		int k=75;
		System.out.println(k);
	}
public void info()
	{
	double z=7.5;
	System.out.println(z);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		result();
		Demo d1=new Demo();
		d1.info();
		System.out.println("main ends...");
	}
}
