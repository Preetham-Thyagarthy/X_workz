class Broker{
	public static void brokerage(String vegetable,int quantity){
		System.out.println("Brokers are ready to help");
		
		Agent.purchase(vegetable,quantity);
		System.out.println(vegetable);
		System.out.println(quantity);
	}
}