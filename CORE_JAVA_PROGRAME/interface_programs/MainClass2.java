interface Sample1
{
	void test1();
} 
interface Sample2 extends Sample1
{
	void test2();
}
interface Sample3 extends Sample2
{
	void test3();
}
class Demo1 implements Sample3
{
	public void test1()
	{
		System.out.println("test1 is completed");
	}
	public void test2()
	{
		System.out.println("test2 is completed");
	}
	public void test3()
	{
		System.out.println("test3 is completed");
	}
}
class MainClass2
{
    public static void main(String[] args) 
	{
		Demo1 rv=new Demo1();
		rv.test1();
		rv.test2();
		rv.test3();

	}
}
