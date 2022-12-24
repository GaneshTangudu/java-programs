class  Box
{
	public int length;
	public int width;
	public double height;
	public Box(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	public Box(int length,int width,double height)
	{
		this.length=length;
		this.width=width;
		this.height=height;
	}
	public void display()
	{
		System.out.println("*******************");
		System.out.println("length:"+length+"cm");
		System.out.println("width:"+width+"cm");
		if(height>0.0)
		{
		System.out.println("height:"+height+"cm");
		}
	}
}
class Mainclass9
{

	public static void main(String[] args) 
	{
		Box box1=new Box(25,45,4.4);
		Box box2=new Box(44,55,6.6);
		Box box3=new Box(22,3,3.5);
		Box box4=new Box(5,5);
		box1.display();
		box2.display();
		box3.display();
		box4.display();
	}
}
