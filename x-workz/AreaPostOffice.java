class AreaPostOffice{
	public static void deliver(String Customername,String address){
		System.out.println("Customername"+Customername+"address"+address);
		
		SubRegionalPostOffice.deliver(Customername,address);
		System.out.println(" "+Customername+" "+ address);
		
	}
}