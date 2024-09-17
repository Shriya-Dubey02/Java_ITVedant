class p44{
	public static void main(String args[]){
		// Addition of numbers
		int numbers[]={2,6,3,10};
		int sum=0;
		for(int n:numbers){
			sum=sum+n;
			
		}
		System.out.println("Sum is "+sum);
		System.out.println("-------------------------");
		
		// Count of 'a' char
		char ch[]={'a','e','i','t','o','u'};
		int vow=0;
		int cons=0;
		for(char n:ch)
		{
			
			if(n=='a'|| n=='e' || n=='i' ||n=='o'||n=='u'){
			vow++;
			}
			else{
				cons++;
			}
			
			
		}
		System.out.println("Vowels is "+vow);
		System.out.println("Cons is "+cons);
	}
}