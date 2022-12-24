interface sample1
{
	void test1();
} 
class Demo implements sample1
{
	public void test1()
	{
		System.out.println("test1 completed");
	}
}
class MainClass
{
    public static void main(String[] args) 
	{
		Demo d1=new Demo();
		d1.test1();
	}
}
