class Bracelet{
	static void wear(){
		System.out.println("Wearing bracelet");
	}
	static void remove(){
		System.out.println("Removing bracelet");
		wear();
	}
	static void polish(){
		Lipsticks.apply();
	}
	static void repair(){
		Pineapple.peel();
	}
}