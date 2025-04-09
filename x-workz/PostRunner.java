class PostRunner{
	public static void main(String[] args){
		System.out.println("customername" + "address");
		
		String customername = "Rama";
		String address = "Ayodhya";
		
		AreaPostOffice.deliver(customername , address);
		System.out.println(" "+customername +" "+ address);
		
	}
}