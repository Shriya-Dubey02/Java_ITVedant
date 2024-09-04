import java.util.*;

class p19{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Enter the input: 1-Addition, 2-Subst ,3-Multip ,4-Division");
		int n= sc.nextInt();
		
		if(n==1){
			System.out.println("Ans is "+(num1+num2));
		}
		else if(n==2){
			System.out.println("Ans is "+(num1-num2));
		}
		else if(n==3){
			System.out.println("Ans is "+(num1*num2));
		}
		else if(n==4){
			System.out.println("Ans is "+(num1/num2));
		}
		else{
			System.out.println("Invalid Input");
		}
	}
}