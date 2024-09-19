class Student
{
	 int rollNo;
	 String name;
}


class P51{
	public static void main(String args[])
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.rollNo=101;
		s1.name="Shriya";
		s2.rollNo=102;
		s2.name="Isha";
		
		System.out.println(s1.rollNo);
		System.out.println(s1.name);
		System.out.println(s2.rollNo);
		System.out.println(s2.name);
		
	}
}