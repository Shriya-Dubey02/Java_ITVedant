import java.util.*;

class p22{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			
		System.out.println("It is a vowel");
		break;
		
		default:
		System.out.println("It is a consonant");
			
			
		}
	}
}