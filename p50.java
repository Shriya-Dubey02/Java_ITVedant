class p50{
	public static void main(String args[])
	{
		int a[][]={{1,3,5},{3,5,6}};
		int sum=0;
		for(int n[]:a){
			for(int i:n){
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}