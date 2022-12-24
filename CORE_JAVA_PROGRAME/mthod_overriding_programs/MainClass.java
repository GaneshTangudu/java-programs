class Father 
{
	public void car()
	{
		System.out.println("car colour is blue");
	}
}
class you extends Father
{
	public void car()
	{
		System.out.println("car colour is red");
	}
}
class MainClass
{

	public static void main(String[] args) 
	{
		you rv=new you();
		rv.car();
	}
}
