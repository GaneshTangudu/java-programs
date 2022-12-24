class Assignment 
{
	public static int a=555;
	public static boolean status=false;
	public double b=5.55;
	public int j=444;
	public static void work()
	{
		System.out.println(a);
		System.out.println(status);
		Assignment a1=new Assignment();
		System.out.println(a1.b);
		System.out.println(a1.j);
	}
	public static void main(String[] args) 
	{
		Assignment a1=new Assignment();
		a1.work();
	}
}
