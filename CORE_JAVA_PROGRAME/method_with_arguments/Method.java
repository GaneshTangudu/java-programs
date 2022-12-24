class  Method
{
	public static  int a=5;
	public static  double i=5.5;
	public  int b=8;
	public double j=6.6;
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		System.out.println(a);
		System.out.println(i);
		Method m1=new Method();
		System.out.println(m1.b);
		System.out.println(m1.j);
	
	}
}
