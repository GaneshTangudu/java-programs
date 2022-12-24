class Prog1 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		exercise();
		 System.out.println("maim ends");
	}
	public static void exercise()
	{

        System.out.println("exercise starts!");
		System.out.println("exercise ends!");
		Prog1 p1 = new Prog1();
		p1.walk();
	}
	public void walk()
	{
		System.out.println("walk starts");
	System.out.println("walk ends!");
	}
}
