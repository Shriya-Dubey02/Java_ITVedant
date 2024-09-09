class p24{
	// To count the no.of digits in a number
	public static void main(String args[])
	{
		int n=9634;
		int digitCount=0;
		
		while(n!=0)
		{
			n=n/10;
			digitCount++;
			
		}
		System.out.println(digitCount);
		
		if(digitCount>4){
			System.out.println("No. is large");
			else{
				System.out.println("No. is small");
			}
		}
	}


}