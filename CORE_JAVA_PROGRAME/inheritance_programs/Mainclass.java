class A 
{
	public int i=10;
}
class B extends A
{
	public int j=80;
	public void display()
	{
		System.out.println("super class variable i:"+i);
		System.out.println("sub class variable j:"+j);
	}

}
class MainClass
{
    public static void main(String[] args) 
	{
		B b1=new B();
		b1.display();
		
	}
}
