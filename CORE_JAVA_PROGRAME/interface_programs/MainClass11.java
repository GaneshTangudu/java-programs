abstract class electronicDevice 
{
	abstract public void on();
}
class light extends electronicDevice
{
	public void on()
	{
		System.out.println("lights on");
	}
}
class fan extends electronicDevice
{
	public void on()
	{
		System.out.println("fan on");
	}
}
class projector extends electronicDevice
{
	public void on()
	{
		System.out.println("screen on");
	}
}
class MainClass11
{
	public static void main(String[] args) 
	{
	     light l1=new light();
		 fan f1=new fan();
		 projector p1=new projector();
		 l1.on();
		 f1.on();
		 p1.on();
	}
}
