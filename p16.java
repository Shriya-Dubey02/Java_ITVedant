class p16
{
	public static void main(String args[])
	{
		if(true){
			System.out.println("A");
			if(true&&true&&false){
				System.out.println("D");
			}
		}
		else{
			if(true||false)
			{
				System.out.println("B");
			}
			else{
				System.out.println("C");
			}
		}
	}
}