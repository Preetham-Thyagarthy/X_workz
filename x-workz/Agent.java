class Agent{
	public static void purchase(String vegetable,int quantity){
		System.out.println("Agents have access");
		
		Shop.sell(vegetable,quantity);
		System.out.println(vegetable);
		System.out.println(quantity);
		
	}
}