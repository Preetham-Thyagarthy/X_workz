class RegionalPostOffice{
	public static void deliver(String customername,String address){
		
		System.out.println("customername"+customername+"address"+address);
		
		PostHeadMaster.symbol(customername,address);
		System.out.println(" "+customername+" "+ address);
	}
}