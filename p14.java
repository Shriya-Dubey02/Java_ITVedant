import java.util.*;
class p14{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%2==0){
			System.out.println(n+" is even");
		}
		else{
			System.out.println(n+" is odd");
		}
		
		
	
		if(n%7==0){
			System.out.println(n+" is divisible by 7");
		}
		else{
			System.out.println(n+" is not divisible by 7");
		}
	}
}