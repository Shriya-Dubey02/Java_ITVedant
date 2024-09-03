import java.util.Scanner;
class p12{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		boolean subscribed= false;
		
		System.out.println("Do you want to subscribe ??(y/n)");
	
		char decision= sc.next().charAt(0);// charAt is a function used for character
		
		if(decision=='y' || decision=='Y')
		{
			subscribed= true;
			
		}
		System.out.println("subscribed:"+subscribed);
		
		if(subscribed)
		{
			System.out.println("You are subscribed");
		}
		else
		{
			System.out.println("You are not subscribed");
		}
	}
}