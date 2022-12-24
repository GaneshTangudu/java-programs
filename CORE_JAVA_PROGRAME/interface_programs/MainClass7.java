abstract class Sample14
{
	abstract public void test14();
}
interface Sample15
{
	void test15();
}
class Demo9 extends Sample14 implements Sample15
{
	public void test14()
	{
		System.out.println("test14 completed");
	}
	public void test15()
	{
		System.out.println("test15 completed");
	}
}
class MainClass7
{
	public static void main(String[] args) 
	{
        Demo9 rv=new Demo9();
		rv.test14();
		rv.test15();
	}
}
