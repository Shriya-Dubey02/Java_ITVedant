import java.util.Scanner;
class p34
{
	public static void main(String args[])
	{
		// do-while loop
		Scanner sc=new Scanner(System.in);
		int n;
		do
		{
			System.out.println("Hello");
			n=sc.nextInt();
		}while(n==1);
		
		// take input from user and print the addition and then ask if he want to continue
		// yes/no if yes repaet the process
		
		char decision;
		do
		{
			System.out.println("Enter numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Addition is "+(a+b));
			
			System.out.println("Do you want to continue?(y/n)");
			decision=sc.next().charAt(0);
			
		}while(decision=='y');
		
		
	}
}