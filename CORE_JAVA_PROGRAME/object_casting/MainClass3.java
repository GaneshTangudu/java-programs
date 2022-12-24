class Movie 
{
	public void rating()
	{
		System.out.println("rating of the movie is outstanding");
	}
}
class Title extends Movie
{

}
class MainClass3
{
    public static void main(String[] args) 
	{
		Movie m1=(Movie)new Title();
		m1.rating();
	}
}
