class  Q
{
	public void houseConstruction()
	{
		System.out.println("rooms alteration");
	}
}
class R extends Q
{
	public void houseConstruction()
	{
		System.out.println("kitchen alteration");
	}
}
class S extends Q
{

}
class T extends Q
{
	public void houseConstruction()
	{
		System.out.println("hall alteration");
	}
}
class MainClass2
{
    public static void main(String[] args) 
	{
		R r1=new R();
		S s1=new S();
		T t1=new T();
		r1.houseConstruction();
		s1.houseConstruction();
		t1.houseConstruction();
	}
}
