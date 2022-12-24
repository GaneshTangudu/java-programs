class Division 
{
	public static void divide(int a,double b)
	{	
	    System.out.println("this method with int,double arg");
	    double c=a/b;
		System.out.println(c);
	}
	public void divide(int a,int b)
	{
		System.out.println("this method with int,int arg");
		int c=a%b;
		System.out.println(c);
	}
    public static void main(String[] args) 
	{
		Division d1=new Division();
        divide(7,2.5);
		d1.divide(6,24);
	}
}
