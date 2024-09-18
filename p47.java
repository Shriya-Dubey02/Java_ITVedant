class p47
{
	public static void main(String args[])
	{
		int arr1[][]={{12,45,60},{35,70,32}};
		
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(arr1[i][j]);
			}
		}
		
		
		
		for(int n[]:arr1)
		{
			for(int i:n)
			{
				System.out.println(i);
			}
		}
		// To calculate the length of indiviual elements in arr2
		int arr2[][]={{12,45},{23,67,90},{23,90,45,89}};
		
		for(int m[]:arr2)
		{
			System.out.println(m.length);
			
		}
		
		
		
		
	
}
}