class Circle 
{
   public int radius;
   public double pi;
   public Circle(int a,double b)
   {
	 radius=a;
	 pi=b;
   }
	 public void area()
   {
	 double area=pi*radius*radius;
	 System.out.println("area of the circle:"+area);
   }
}
class Mainclass5
{
   public static void main(String[] args) 
   {
	Circle c1=new Circle(7,3.14);
	Circle c2=new Circle(10,3.14);
	c1.area();
	c2.area();
	
	}
}
