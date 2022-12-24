interface Sample13
{
	void test13();
}
class Demo7 implements Sample13
{
	public void test13()
	{
		System.out.println("take bank test");
	}
}
class Demo8 implements Sample13
{
	public void test13()
	{
		System.out.println("take government test");
	}
}
class MainClass6
{
	public static void main(String[] args)
	{
		Demo7 rv1=new Demo7();
		Demo8 rv2=new Demo8();
		rv1.test13();
		rv2.test13();
	}
}
