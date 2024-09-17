class p43
{
	public static void main(String args[])
	{
		// to find out the length of array
		String weekdays[]={"Mon","Tue","Wed","thur","Fri","Sat","Sun"};
		int primeno[]={11,10,20,5};
		System.out.println("Weekdays: "+weekdays.length);
		System.out.println("primeno. "+primeno.length);
		
		// Enchanced for loop
		int sum=0;
		for(int numbers:primeno){
			sum=sum+numbers;
			
		}
		System.out.println("Sum is "+sum);
		
		for(String day:weekdays){
			System.out.println(day);
		}
	}
}