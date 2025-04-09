class Farmer{
	public static void farm(String vegetable,int quantity){
		System.out.println("Farmers are the producers");
		
		Broker.brokerage(vegetable,quantity);
		System.out.println(vegetable);
		System.out.println(quantity);
	}
}