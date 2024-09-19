class Orders
{
	int order_id;
	String order_name;
	int cost;
	
	// Methods
	void orderDetails()
	{
		System.out.println("Order Details");
		System.out.println(order_id+" "+order_name+" "+cost);
	}
	
	void orderReview()
	{
		System.out.println("*****");
	}
}


class P52{
	public static void main(String args[]){
		// Objects
		Orders o1=new Orders();
		Orders o2=new Orders();
		Orders o3=new Orders();
		
		o1.order_id=01;
		o1.order_name="Headphones";
		o1.cost=1500;
		o1.orderDetails();
		
		o1.orderReview();
		
		o2.orderReview();
		o2.orderDetails();
		o2.order_id=02;
		o2.order_name="Speakers";
		o2.cost=2000;
		
		/*System.out.println(o1.order_id);
		System.out.println(o1.order_name);
		System.out.println(o1.cost);
		
		System.out.println(o2.order_id);
		System.out.println(o2.order_name);
		System.out.println(o2.cost);*/
	}
}