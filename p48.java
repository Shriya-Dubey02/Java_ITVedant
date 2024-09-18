class p48
{
	public static void main(String args[])
	{
		String courses[][]=
		{{"HTML","CSS","JavaScript"},
		{"Mysql","MongoDB"},
		{"Core java","Spring Boot"}};
		
		int total_courses=0;
		for(String course[]:courses)
		{
			total_courses +=course.length;
			for(String c_name:course){
				System.out.println(c_name);
				
			}
		}
		System.out.println("Total courses is "+total_courses);
		
		
	}
}