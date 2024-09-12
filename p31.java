import java.util.*;
class p31{
	// Prime no. comes in which tables and count of them
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("Count is:"+count);
		
		if(count==2)
		{
			System.out.print(n+" is prime");
		}
		else
		{
			System.out.print(n+" is not prime");
		}
	}
}