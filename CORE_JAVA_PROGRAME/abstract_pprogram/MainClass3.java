abstract class A
{
abstract public void display();
abstract public void info();
}
abstract class B extends A
{
	public void display()
	{
		System.out.println("display ganesh");
	}
}
class C extends B
{
	public void info()
	{
		System.out.println("ganesh info");
	}
}
class MainClass3
{	
	public static void main(String[] args) 
	{
		C c1=new C();
		c1.display();
		c1.info();
	}
}
