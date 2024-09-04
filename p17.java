class p17{
	public static void main(String args[]){
		int a=100;
		int b= 2000;
		int c=3000;
		
		if(a>b)
		{
			if(a>c){
				System.out.println("a is greatest");
			}
			else
			{
				System.out.println("c is greatest");
			}
		}
		else{
			if(b>c)
			{
				System.out.println("b is greatest");
			}
			else{
				System.out.println("c is greatest");
			}
		}
	}
}