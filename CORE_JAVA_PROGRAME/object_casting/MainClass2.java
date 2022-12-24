class Animals 
{
	public void roam()
	{
		System.out.println("Animals are roaming around the forest");
	}
}
class Wildanimals extends Animals
{
	public void hunt()
	{
		System.out.println("wildanimals are hunting another animals");
	}
}
class Lion extends Wildanimals
{
	public void rule()
	{
		System.out.println("lion is ruling the forest");
	}
}
class MainClass2
{
    public static void main(String[] args)
	{
		Animals a1=(Animals)new Lion();
		a1.roam();
		Wildanimals w1=(Wildanimals)a1;
		w1.hunt();
		w1.roam();
		Lion l1=(Lion)w1;
		l1.rule();
		l1.hunt();
		l1.roam();

	
		
	}
}
