class  Duty
{
	public void carpenter()
	{
		System.out.println("carpentry starts...");
		System.out.println("carpentry ends...");
	}
	public void tailor()
	{
		System.out.println("tailoring starts...");
		System.out.println("tailoring ends...");
	}
	public static void fishing()
	{
		System.out.println("fishing starts...");
		Duty d1=new Duty();
		d1.carpenter();
		d1.tailor();
		System.out.println("fishing ends...");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		fishing();
		System.out.println("main ends...");
	}
}
