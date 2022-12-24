abstract class Demo
{
	abstract public void display();
}
class You extends Demo
{
	public void display()
	{
		System.out.println("display completed");
	}
}
class MainClass1
{
    public static void main(String[] args) 
	{
		You y1=new You();
		y1.display();
	}
}


	
