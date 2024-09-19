class p501{
	public static void main(String args[])
	{
		// even odd count
		int a[][]={{1,3,5},{3,5,6}};
		int count=0;
		int odd=0;
		for(int n[]:a){
			for(int i:n){
			  if(i%2==0){
				  count++;
			  }
			  else{
				  odd++;
			  }
			}
		}
		System.out.println("Total even no. are "+count);
		System.out.println("Total odd no. are "+odd);
	}
}