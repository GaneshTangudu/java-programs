class Sample16
{
	public void test16()
	{
		System.out.println("test16 already completed");
	}
}
interface Sample17
{
	void test17();
}
class Demo18 extends Sample16 implements Sample17
{
	public void test17()
	{
		System.out.println("test17 completed");
	}
}
class MainClass8 
{
	public static void main(String[] args) 
	{
		Demo18 rv=new Demo18();
		rv.test16();
		rv.test17();
	}
}
