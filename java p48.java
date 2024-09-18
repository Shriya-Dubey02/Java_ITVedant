class p48
{
	public static void main(String args[])
	{
		String courses[][]=
		{{"HTML","CSS","JavaScript"},
		{"Mysql","MongoDB"},
		{"Core java","Spring Boot"}};
		
		for(String n[]:courses)
		{
			for(int i:n){
				System.out.println(i);
			}
		}
		
	}
}