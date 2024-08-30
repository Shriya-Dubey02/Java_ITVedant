class p4{
	
	public static void main(String args[]){
		// Comparison Operators
		/*int a= 50;
		int b= 60;
		System.out.println(a<=b);
		System.out.println(10<=20);
		System.out.println(-10>=20);
		System.out.println(20==20);
		System.out.println(25!=20);
		*/
		
		// Logical Operators
		int c= 40;
		System.out.println (!( c!=0 && c!=40));
		
		int d= 6;
		System.out.println(d!=6 || d<10);
		
		// Bitwise operators
		/* 
		Bitwise and  &
		Bitwise or   |
		Bitwise XOR  ^ : If bits are different then 1 , if same then 0
		Bitwise NOT  ~  
		
		*/
		
		System.out.println(10&15);
		System.out.println(10|15);
		System.out.println(10^15);
		System.out.println(~6);
		// Compiler will return 2's complement of a no. 
		// -6 0000 0000 0000 0110
		// ~6 1111 1111 1111 1001
		
		
		// Ternary Operators
		int a= 67;
		int b= 300;
		System.out.println(a>b?"a is greater":"b is greater");
		
		
		
		
		
		
		
	}
}