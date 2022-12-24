class Addition 
{
	public static void add(int a,double b)
	{
		System.out.println("this method with int,int arg");
		double d=a+b;
		System.out.println(d);
	}
	public static void add(double a,double b)
	{
		System.out.println("this method with double,double arg");
		double d=a+b;
        System.out.println(d);
	}
	public static void add(int a,int b,double c)
	{
		System.out.println("this method with int,int,double arg");
	    double d=a+b+c;
	    System.out.println(d);
    }
	public static void main(String[] args) 
	{
		add(5,4.5);
		add(5.5,6.6);
		add(5,4,2.4);
	}
}
