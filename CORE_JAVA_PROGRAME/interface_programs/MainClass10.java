class Light 
{
	public void switchOn()
	{
		System.out.println("lights on");
	}
}
class Fan
{
	public void turnOn()
	{
		System.out.println("Air is blown");
	}
}
class Projector
{
	public void screenVisible() 
	{
		System.out.println("screen visible");
	}
}
class MainClass10
{
	public static void main(String[] args) 
	{
		Light l1=new Light();
		Fan f1=new Fan();
		Projector p1=new Projector();
		l1.switchOn();
		f1.turnOn();
		p1.screenVisible();
	}
}
