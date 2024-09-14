import java.util.*;
class p37
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		// if user gives negative inputs continue the loop
		int sum=0;
		for(int i=1;i<=5;i++)
		{
			int n=sc.nextInt();
			if(n<0)
				continue;
			sum=sum+n;
		}
		System.out.println("Sum is "+sum);
	}
}