interface father
{
	void house();
} 
class Son implements father
{
	public void house()
	{
		System.out.println ("house is completed");
	}
}
class MainClass7
{
    public static void main(String[] args) 
	{
		father f1=(father)new Son();
		f1.house();
	}
}
