interface Sample5
{
	void test5();
}
interface Sample6 extends Sample5
{
	void test6();
}
interface Sample7 extends Sample5
{
	void test7();
}
class Demo2 implements Sample7
{
	public void test5()
	{
		System.out.println("test5 is completed");
	}
	
	public void test7()
	{
		System.out.println("test7 is completed");
	}
}
class Demo1 implements Sample6
{
	public void test5()
	{
		System.out.println("test5 is completed");
	}
	
	public void test6()
	{
		System.out.println("test6 is completed");
	}
}
class MainClass3
{
    public static void main(String[] args) 
	{
	    Demo2 rv=new Demo2();
		rv.test5();
		rv.test7();
		Demo1 d1=new Demo1();
		d1.test5();
		d1.test6();
	}
}
