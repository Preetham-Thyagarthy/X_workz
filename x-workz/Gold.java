class Gold{
	static void buy(){
		System.out.println("Buying Gold");
	}
	static void sell(){
		System.out.println("Selling gold"); buy();
	}
	static void checkPurity() {
		Wallet.store();
	}
	static void price(){
		Bitcoin.trade();
	}
}