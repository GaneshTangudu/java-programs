class Circle1
{
    public static void main(String[] args) 
	{
		findArea();
	}
	public static void findArea()
	{
		int r=findRadius(10);
		double area = 3.14*r*r;
		System.out.println("Area of Circle : "+area);
	}
	public static int findRadius (int d)
	{
		int r=d/2;
		return r;
	}
}
