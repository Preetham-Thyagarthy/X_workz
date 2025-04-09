class Currency{
	static void exchange(){
		System.out.println("Exchanging currency");
	}
	static void convert(){
		System.out.println("Converting currency");
	exchange();
	}
	static void digitalTransfer(){
		Bitcoin.trade();
	}
	static void paperMoney(){
		TrafficSignal.green();
	}
}