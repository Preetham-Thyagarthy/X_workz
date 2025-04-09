class PostHeadMaster{
	public static void symbol(String customername,String address){
		System.out.println("customername"+customername+"address"+address);
		
		PostMaster.office(customername,address);
		System.out.println(" "+customername+" "+ address);
	}
}