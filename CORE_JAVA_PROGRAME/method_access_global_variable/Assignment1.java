class Assignment1 
{
	public static double d=6.8;
	public static char e='$';
	public int f=454;
	public String g="hi";
	public void work()
	{
		System.out.println(d);
		System.out.println(e);
		Assignment1 a1=new Assignment1();
		System.out.println(a1.f);
		System.out.println(a1.g);
	}
	public static void main(String[] args) 
	{
		Assignment1 a1=new Assignment1();
		a1.work();
	}
}
