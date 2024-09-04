import java.util.*;
// else if ladder
class p18{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("1: Marathi   2: Hindi   3: English");
		int n=sc.nextInt();
		if(n==1){
			System.out.println("Marathi selected");
		}
		else if(n==2){
			System.out.println("Hindi selected");
		}
		else if(n==3){
			System.out.println("English selected");
		}
		else{
			System.out.println("Invalid input");
		}
	}
}