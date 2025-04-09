class Shop{
	public static void sell(String vegetable,int quantity){
		System.out.println("Welcome to our shop");
		
		Customer.buy(vegetable,quantity);
		System.out.println(vegetable);
		System.out.println(quantity);
		
	}
}