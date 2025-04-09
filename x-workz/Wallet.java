class Wallet{
	static void open(){
		System.out.println("Opening wallet");
	}
	static void close(){
		System.out.println("Closing wallet");
	}
	static void store(){
		Bitcoin.mine();
	}
	static void retrieve(){
		Pineapple.eat();
	}
}