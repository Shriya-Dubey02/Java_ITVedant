import java.util.Scanner;
class p7{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n1=sc.nextInt();
		System.out.println(n1*n1);
		
		System.out.println("Enter the length and breath of rect");
		int l= sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Area of rectangle is"+(l*b));
		
		
	}

}