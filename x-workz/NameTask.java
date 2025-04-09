class Nametask{
	public static String getName(long MobileNo ){
		
		if(MobileNo==8642678519L){
			return "Karna";
		}
		else if(MobileNo==6842682349L){
			return "Manoj";
		}
		else if(MobileNo==7682469863L){
			return "Charan";
		}
		else if(MobileNo==7598426412L){
			return "Gagan";
		}
		else if(MobileNo==8672549683L){
			return "Vishwas";
		}
		else if(MobileNo==8756126425L){
			return "James";
		}
		else if(MobileNo==9756758426L){
			return "Sameer";
		}
		else if(MobileNo==6493568752L){
			return "Mahesh";
		}
		else if(MobileNo==8745968759L){
			return "Barath";
		}
		else if(MobileNo==6348756812L){
			return "Nikhil";
		}
		else if(MobileNo==6489756345L){
			return "Ajay";
		}
		else if(MobileNo==9758648597L){
			return "Harshith";
		}
		else if(MobileNo==6748328941L){ //13
			return "Jayanth";
		}
		else if(MobileNo==8495375183L){ 
			return "Karthik";
		}
		else if(MobileNo==8576249935L){
			return "Dheeraj";
		}
		else if(MobileNo==8847637590L){
			return "Nithin";
		}
		else if(MobileNo==74829765341L){
			return "Faran";
		}
		else if(MobileNo==6785334985L){
			return "Mithun";
		}
		else if(MobileNo==9765866349L){
			return "Varun";
		}
		else if(MobileNo==6627389426L){  
			return "Sagar";
		}
		else if(MobileNo==8867189425L){
			return "Lohith";
		}
		else if(MobileNo==7485964152L){
			return "Tejas";
		}
		else if(MobileNo==64852675321L){ //23
			return "Abhijith";
		}
		else {
			return "Type Of Mobile Numubmer cannot be found";
		}                   
	}
	
	public static String ownerName(String Company){
		if(Company=="Tesla"){
			return "Elon Musk";
		}
		else if(Company=="Infosys"){
			return "Narayana Murthy";
		}
		else if(Company=="Apple"){
			return "Tim Cook";
		}
		else if(Company=="Microsoft"){
			return "Satya Nadella";
		}
		else if(Company=="Alphabet(Google)"){
			return "Sundar Pichai";
		}
		else if(Company=="Facebook"){
			return "Mark Zukerberg";
		}
		else if(Company=="Walmert"){
			return "Doug McMilon";
		}
		else if(Company=="Netflix"){
			return "Reed Hastings";
		}
		else if(Company=="IBM"){
			return "Arvind Krishna";
		}
		else if(Company=="Amazon"){
			return "Andy Jassy";
		}
		else if(Company=="TCS"){
			return"J.R.D.Tata";
		}
		else if(Company=="Wipro"){
			return"Mohammed Hasham Premji";
		}
		else {
			return "The Type of Company Cannot Be Found";
		}
	}
	
	public static int Price(String foodItem){
		if(foodItem=="Idli"){
			return 40;
		}
		else if(foodItem=="Dosa"){
			return 60;
		}
		else if(foodItem=="Vada Pav"){
			return 30;
		}
		else if(foodItem=="Pani Puri"){
			return 50;
		}
		else if(foodItem=="Masala Dosa"){
			return 80;
		}
		else if(foodItem=="Chicken Biriyani"){
			return 180;
		}
		else if(foodItem=="Veg Biriyani"){
			return 150;
		}
		else if(foodItem=="Paneer Butter Masala"){
			return 200;
		}
		else if(foodItem=="Butter Naan"){
			return 40;
		}
		else if(foodItem=="Chicken Tandoori"){
			return 250;
		}
		else if(foodItem=="Pav Bhaji"){
			return 100;
		}
		else if(foodItem=="Samosa"){
			return 100;
		}
		else if(foodItem=="Chole Bhature"){
			return 120;
		}
		else if(foodItem=="Dal Tadka"){
			return 160;
		}
		else if(foodItem=="Gulab Jamun"){
			return 50;
		}
		else if(foodItem=="Rasgulla"){
			return 60;
		}
		else if(foodItem=="Veg Thali"){
			return 180;
		}
		else if(foodItem=="Egg Curry"){ //18
			return 140;
		}
		else if(foodItem=="Palav"){
			return 40;
		}
		else {
			return 0;

		}
	}
	
	public static double balance(long accountNumber){
		if(accountNumber==59124378236L){
			return 12.000;
	}
	else if(accountNumber==42189625731L){
		return 35.000;
	}
	else if(accountNumber==72689426574L){
		return 78.000;
	}
	else if(accountNumber==83475612689L){
		return 45.000;
	}
	else if(accountNumber==715723645226L){
		return 75.000;
	}
	else if(accountNumber==84324682432L){
		return 1.50000;
	}
	else if(accountNumber==375464298645L){
		return 85.000;
	}
	else if(accountNumber==68726426891L){
		return 35.000;
	}
	else if(accountNumber==74236458912L){
		return 5.00000;
	}
	else if(accountNumber==76358942351L){
		return 55.000;
	}
	else if(accountNumber==85647632149L){
		return 64.000;                     //11
	}
	else if(accountNumber==74561234894L){
		return 23.000;
	}
	else if(accountNumber==94268123486L){
		return 66.000;
	}
	else if(accountNumber==459723642348L){
		return 1.3500;
	}
	else if(accountNumber==23448975315L){
		return 44.000;
	}
	else if(accountNumber==64259875315L){
		return 66.000;
	}
	else if(accountNumber==46897235647L){
		return 33.000;
	}
	else{
		return 0;
	}
	}
	
	public static int amount(String source){
		if(source=="Book"){
			return 100;
		}
		else if(source=="Pen"){
			return 50;
		}
		else if(source=="Bag"){
			return 550;
		}
		else if(source=="Laptop"){
			return 450;
		}
		else if(source=="Board"){
			return 300;
		}
		else if(source=="Bike"){
			return 250;
		}
		else if(source=="Coat"){
			return 100;
		}
		else if(source=="Box"){
			return 450;
		}
		else if(source=="Shoes"){
			return 299;
		}
		else if(source=="Car"){
			return 800;
		}
		else if(source=="Table"){
			return 750;
		}
		else if(source=="Charger"){
			return 350;
		}
		else if(source=="Pencil"){ 
			return 60;
		}
		else if(source=="Exam Pad"){
			return 140;
		}
		else if(source=="Mouse"){  //15
			return 440;
		}
		else if(source=="Chappal"){
			return 150;
		}
		else if(source=="Powder"){
			return 60;
		}
		else if(source=="Soap"){
			return 10;
		}
		else if(source=="Eraser"){
			return 5;
		}
		else if(source=="Bed Sheet"){
			return 220;
		}
		else{
			return 0;
		}
	}
	
	public static String alive(String name){
		
		if(name=="Mahesh"){
			return "Human";
		}
		else if(name=="Suzuki"){
			return "Bike";
		}
		else if(name=="HP"){
			return "Laptop";
		}
		else if(name=="Techno"){
			return "Mobile";
		}
		else if(name=="Lenskart"){
			return "Spect";
		}
		else if(name=="Innova"){
			return "Car";
		}
		else if(name=="Gawri"){
			return "Cow";
		}
		else if(name=="Skybag"){
			return "Bag";
		}
		else{
			return "Type That Not Be Found";
		}
	}
}