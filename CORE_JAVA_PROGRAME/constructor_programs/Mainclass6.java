class Test 
{
	public Test(int a)
	{
		System.out.println("execute test constructor with int arg");
		System.out.println("a:"+a);
	}
	public Test(String z)
	{
		System.out.println("execute test constructor with String arg");
		System.out.println("z:"+z);
	}
    public Test(char i,double j)
	{
		System.out.println("execute test constructor with char,double");
		System.out.println("i:"+i);
		System.out.println("j:"+j);
	}
	public Test(double p,double q)
	{
		System.out.println("execute test constructor with double,double");
		System.out.println("p:"+p);
		System.out.println("q:"+q);
	}
}
class Mainclass6
{
    public static void main(String[] args) 
	{
		Test test1=new Test('@',6.8);
		Test test2=new Test('*',8.5);
		Test test3=new Test(68.91,6.8);
		Test test4=new Test(9.2,8.3);
		Test test5=new Test(10);
	    Test test6=new Test(100);
        Test test7=new Test(1000);
		Test test8=new Test("hello");
		Test test9=new Test("hi");
	}
}
