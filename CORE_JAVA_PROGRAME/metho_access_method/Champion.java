class Champion 
{
	public static void boxer()
	{
		System.out.println("boxer fight starts...");
		System.out.println("boxer fight ends...");
	}
	public static void cricketer()
	{
		System.out.println("cricketer starts...");
		System.out.println("cricketer ends...");
	}
	public void rider()
	{
		System.out.println("ride starts...");
        boxer();
		cricketer();
		System.out.println("ride ends...");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Champion c1=new Champion();
		c1.rider();
		System.out.println("main ends...");
	}
	
	
}
