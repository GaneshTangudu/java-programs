class Sample18
{
	public void move()
	{
		System.out.println("move north");
	}
}
interface Sample19
{
	void move();
}
class Demo11 extends Sample18 implements Sample19
{
	
	{
		System.out.println("move south");
	}

}
class MainClass9 
{
	public static void main(String[] args) 
	{
		Demo11 rv=new Demo11();
		rv.move();
	}
}
