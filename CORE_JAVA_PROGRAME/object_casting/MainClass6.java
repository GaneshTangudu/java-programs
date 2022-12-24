class Flower 
{
	public void grow()
	{
		System.out.println("grow in garden");
	}
}
class Rose extends Flower
{
	public void grow()
	{
		System.out.println("grow in my home");
	}
}
class MainClass6
{
    public static void main(String[] args) 
	{
		Flower f1=(Flower)new Rose();
		f1.grow();
	}
}
