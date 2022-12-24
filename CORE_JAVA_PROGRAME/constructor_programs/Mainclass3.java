class  Flower
{
	public String flowerName;
	public Flower(String name)
	{
		flowerName=name;
	}
	public void display()
	{
		System.out.println("flower name is:"+flowerName);
	}
}
class Mainclass3
{
    public static void main(String[] args) 
	{
		Flower f1=new Flower("rose");
		Flower f2=new Flower("jasmine");
		Flower f3=new Flower("lilly");
		f1.display();
		f2.display();
		f3.display();
	}
}
