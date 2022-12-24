abstract class A 
{
	abstract public void test();
}
class B extends A
{
	public void test()
	{
		System.out.println("test is completed");
	}
}
class MainClass5
{
    public static void main(String[] args) 
	{
		A a1=(A)new B();
		a1.test();
	}
}
