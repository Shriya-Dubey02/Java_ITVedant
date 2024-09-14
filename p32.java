import java.util.*;
class p32{
	// NESTED LOOPS
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int countprime=0;
		for(int k=1;k<=5;k++)
	{
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				
				count++;
			}
		}
	
		if(count==2)
		{
			countprime++;
		}
		
	}
	  System.out.println("Total prime no. are "+countprime);
		
	}
}