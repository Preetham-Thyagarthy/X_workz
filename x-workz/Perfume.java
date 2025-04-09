class Perfume{
	static void spray(){
		System.out.println("Spraying perfume");
	}
	static void smell(){
		System.out.println("Smelling perfume");
		spray();
	}
	static void brand(){
		Brand.showBrand();
	}
	static void quality(){
		Gold.checkPurity();
	}
}