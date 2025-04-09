public class NametaskRunner{
	public static void main(String[] args){
		System.out.println("MobileNo");
		long MobileNo=9756758426L;
		String result =Nametask.getName(MobileNo);
		System.out.println(result);
		System.out.println("Company Owner Name");
		String Company = "TCS";
		String com=Nametask.ownerName(Company);
		System.out.println(com);
		System.out.println("List of FoodItems Price");
		String foodItem="Masala Dosa";
		int item = Nametask.Price(foodItem);
		System.out.println(item);
		System.out.println("Balance");
		long accountNumber=83475612689L;
		double check=Nametask.balance(accountNumber);
		System.out.println(check+"rs");
		System.out.println("Least of Chepest Product");
		String source = "Coat";
		int amount = Nametask.amount(source);
		System.out.println(amount+"rs");
		System.out.println("Lists");
		String name="Innova";
		String people=Nametask.alive(name);
		System.out.println(people);
		System.out.println("DONE");
	}
	
}