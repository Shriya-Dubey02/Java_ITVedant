class p45
{
	public static void main(String args[])
	{
		// To find the largest and smallest number in an array
		int numbers[]={11,5,70,19,56,12};
		
		int smallest=numbers[0];
		int biggest=numbers[0];
		
		for(int n:numbers)
		{
			if(smallest>n)
				smallest=n;
			if(biggest<n)
				biggest=n;
			
		}
		System.out.println(smallest);
		System.out.println(biggest);
	}
}