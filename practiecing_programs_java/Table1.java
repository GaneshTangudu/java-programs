//*program to print multiplication table of n by using runtime method*//
import java.util.*;
class Table1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		for(int i=1;i<=40;i++)
		{
		System.out.println(num+"*"+i+"="+num*i);
		}
	}
}
