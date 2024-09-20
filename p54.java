class Calculator
{
     int a;
     int b;
	 
	 int addition()
	 {
		 return a+b;
	 }
	 int substr()
	 {
		 return a-b;
	 }
	 void setValues(int n1,int n2)
	 {
		 a=n1;
		 b=n2;
	 }
	 
}
class P54
{
	public static void main(String args[])
	{
		Calculator c1=new Calculator();
		Calculator c2=new Calculator();
		c1.a=12;
		c1.b=10;
		int sum=c1.addition();
		
		System.out.println("Addition is "+sum);
		
		
		c2.a=20;
		c2.b=10;
		
		int diff=c2.substr();
		System.out.println("Substraction is "+diff);
		
		Calculator c3=new Calculator();
		c3.setValues(11,5);
		System.out.println(c3.a+" "+c3.b);
		
		
		
		
	}
}