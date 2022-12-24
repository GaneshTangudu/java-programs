//*program to check whether gien number is prime number or not*//
class PrimeNumber
{
	public static void main(String[] args)
	{
		int n=44;
		boolean prime=true;
		for(int i=2;i<n;i++)
		{
		if(n%i==0)
		{
	    prime=false;
	    break;
		}
		}
		if( prime)
		{
			System.out.println("the given number is prime number");
		}
		else
		{
			System.out.println("the given number is not a prime");
		}
	}
}
