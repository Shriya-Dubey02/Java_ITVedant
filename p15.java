class p15{
	public static void main(String args[]){
		int n=12;
		
		if(n%3==0){
			System.out.println(n+" is multiple of 3");
			if(n%2==0){
				System.out.println(n+" is multiple of 2");
			}
			else{
				System.out.println(n+" is not multiple of 2");
			}
		}
		else{
			System.out.println(n+" is not multiple of 3");
		}
	}
}