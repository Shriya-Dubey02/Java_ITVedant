class p38{
	public static void main(String args[]){
		// Widening Typecasting
		// small to big
		int a=20;
		long b=a;
		
		System.out.println(b);
		
		// Narrowing Typecasting
		// big to small
		int c=100;
		byte d=(byte)c;
		// int to byte conversion
		System.out.println(d);
		
		System.out.println("====================");
		
		// int to char 
		int n=65;
		char ch=(char)n;
		System.out.println(ch);
		System.out.println((char)n);
		
		
	}
}