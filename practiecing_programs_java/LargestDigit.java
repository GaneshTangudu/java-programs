//*largest digit present in a given number*//
import java.util.*;
class LargestDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int largest=0;
		while(num!=0)
		{
			int lastdigit=num%10;
			if(largest<lastdigit)
			{
				largest=lastdigit;
			}
			num=num
				/10;
		}
		System.out.println("the largest digit in a given number is:"+largest);
	}
}
