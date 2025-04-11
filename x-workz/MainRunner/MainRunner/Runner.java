package MainRunner.MainRunner;

import com.xworkz.external.*;

import javax.print.Doc;

public class Runner {
    public static void main(String[] args) {
        Movie movie = new Movie("Appu",4,'A');
        System.out.println("Movie Details: "+movie);
        System.out.println("Manual : "+movie.hashCode());

        System.out.println("========================");

        Car car = new Car("Audi",1479, "Shivamogga");
        System.out.println("Car Details: "+car);
        System.out.println("Manual : "+car.hashCode());

        System.out.println("======================");
        Light light = new Light("CFL",150,'A');
        System.out.println("Bulb Details: "+light);
        System.out.println("Manual : "+light.hashCode());

        System.out.println("======================");
        Mobile mobile = new Mobile("Teno", 100,"Green");
        System.out.println("Mobile Detail:"+mobile);
        System.out.println("Manual : "+mobile.hashCode());


        System.out.println("==========================");
        India india = new India("Bharath",'A',"Tiger");
        System.out.println("India Detail:" +india);
        System.out.println("Manual : "+india.hashCode());

        System.out.println("======================");
        Laptop laptop = new Laptop("HP",'A',"Silver");
        System.out.println("Laptop Details:"+laptop);
        System.out.println("Manual : "+laptop.hashCode());

        System.out.println("=========================");
        Lorry lorry = new Lorry("Red",45,'V');
        System.out.println("Lorry Details"+lorry);
        System.out.println("Manual : "+lorry.hashCode());

        System.out.println("=========================");
        Gold gold = new Gold("Golden",45,'A');
        System.out.println("Gold Details:"+gold);
        System.out.println("Manual : "+gold.hashCode());

        System.out.println("=======================");
        Dance dance = new Dance("Barathanatyam", 87,'A');
        System.out.println("Dance Details:"+dance);
        System.out.println("Manual : "+dance.hashCode());

        System.out.println("=======================");
        Tooblight tooblight = new Tooblight("Bajaj B22",187,'A');
        System.out.println("Tooblight Details:"+tooblight);
        System.out.println("Manual : "+tooblight.hashCode());

        System.out.println("=========================");
        TravelBag travelBag = new TravelBag("Skybag",160,'B');
        System.out.println("TravelBag Details:"+travelBag);
        System.out.println("Manual : "+travelBag.hashCode());

        System.out.println("==========================");
        Iron iron = new Iron("Gray",67,'C');
        System.out.println("Iron Details:"+iron);
        System.out.println("Manual : "+iron.hashCode());

        System.out.println("==============================");
        StandFan standFan = new StandFan("Orient",4,'B');
        System.out.println("StandFan Details:"+standFan);
        System.out.println("Manual : "+standFan.hashCode());

        System.out.println("==========================");
        HeadPhone headPhone = new HeadPhone("White",53,'C');
        System.out.println("HeadPhone Details:"+headPhone);
        System.out.println("Manual : "+headPhone.hashCode());

        System.out.println("==========================");
        BedSheet bedSheet = new BedSheet("White",53,"Assam");
        System.out.println("BedSheet Details:"+bedSheet);
        System.out.println("Manual : "+bedSheet.hashCode());


        System.out.println("==========================");
        Japan japan = new Japan("Japnese",'A',"Green Pheasant");
        System.out.println("Japan Details:"+japan);
        System.out.println("Manual : "+japan.hashCode());

        System.out.println("==========================");
        Teacher teacher = new Teacher("Omakar",1,'A');
        System.out.println("Teacher Details:"+teacher);
        System.out.println("Manual : "+teacher.hashCode());

        System.out.println("=========================");
        Silver silver = new Silver("Silver",71,'B');
        System.out.println("Silver Details:"+silver);
        System.out.println("Manual : "+silver.hashCode());


        System.out.println("=========================");
        Jamun jamun = new Jamun("Peda",50,'A');
        System.out.println("Jamun Details:"+jamun);
        System.out.println("Manual : "+jamun.hashCode());

        System.out.println("=========================");
        Paragon paragon = new Paragon("Paragon",100,"Black");
        System.out.println("Chappal Details:"+paragon);
        System.out.println("Manual : "+paragon.hashCode());

        System.out.println("=========================");
        Watch watch = new Watch("Fast track",160,"Black");
        System.out.println("Watch Details:"+watch);
        System.out.println("Manual : "+watch.hashCode());

        System.out.println("==========================");
        Shirt shirt = new Shirt("White",90,"Yellow");
        System.out.println("Shirt Details:"+shirt);
        System.out.println("Manual : "+shirt.hashCode());


        System.out.println("==========================");
        AutoRickshaw autoRickshaw = new AutoRickshaw("Bajaj",4,"Bengaluru");
        System.out.println("AutoRickshaw Details: "+autoRickshaw);
        System.out.println("Manual : "+autoRickshaw.hashCode());

        System.out.println("==========================");
        College college = new College("Vinay",4,'A');
        System.out.println("College Faculty Details: "+college);
        System.out.println("Manual : "+college.hashCode());


        System.out.println("==========================");
        Detergent detergent = new Detergent("Green",14,'A');
        System.out.println("College Faculty Details: "+college);
        System.out.println("Manual : "+detergent.hashCode());

        System.out.println("==========================");
        Pant pant = new Pant("Peter England",140,"Cream");
        System.out.println("Pant Details: "+pant);
        System.out.println("Manual : "+pant.hashCode());

        System.out.println("==========================");
        Instagram instagram = new Instagram("Tom Cruise",60,'A');
        System.out.println("Instagram Account Details: "+instagram);
        System.out.println("Manual : "+instagram.hashCode());

        System.out.println("==========================");
        Medimix medimix = new Medimix("Green",44,'A');
        System.out.println("Medimix Details: "+medimix);
        System.out.println("Manual : "+medimix.hashCode());

        System.out.println("==========================");
        Dove dove = new Dove("White",10,'B');
        System.out.println("Dove Details: "+dove);
        System.out.println("Manual : "+dove.hashCode());

        System.out.println("==========================");
        Lux lux = new Lux("Pink",46,'A');
        System.out.println("Lux Details: "+lux);
        System.out.println("Manual : "+lux.hashCode());


        System.out.println("==========================");
        Water water = new Water("Bisleri",20,'A');
        System.out.println("Water Bottle Details: "+water);
        System.out.println("Manual : "+water.hashCode());

        System.out.println("==========================");
        Lifeboy lifeboy = new Lifeboy("Red",15,'B');
        System.out.println("Lifeboy Details: "+lifeboy);
        System.out.println("Manual : "+lifeboy.hashCode());

        System.out.println("==========================");
        Karthika karthika = new Karthika("White",7,'B');
        System.out.println("Karthika Shampoo Details: "+karthika);
        System.out.println("Manual : "+karthika.hashCode());


        System.out.println("==========================");
        Tractor tractor = new Tractor("Sonalika",23,"Haveri");
        System.out.println("Tractor Details: "+tractor);
        System.out.println("Manual : "+tractor.hashCode());

        System.out.println("==========================");
        Calculator calculator = new Calculator("Nataraja",'A',"Black");
        System.out.println("Calculator Details: "+calculator);
        System.out.println("Manual : "+calculator.hashCode());

        System.out.println("==========================");
        Coat coat = new Coat("Levis",'A',"Black");
        System.out.println("Coat Details: "+coat);
        System.out.println("Manual : "+coat.hashCode());


        System.out.println("==========================");
        Youtube youtube = new Youtube("X-WORKZ",1,'A');
        System.out.println("Youtube Details: "+calculator);
        System.out.println("Manual : "+youtube.hashCode());


        System.out.println("==========================");
        America america = new America("USA",'A',"Eagle");
        System.out.println("America Details: "+america);
        System.out.println("Manual : "+america.hashCode());

        System.out.println("==========================");
        Subject subject = new Subject("Social Science",6,'B');
        System.out.println("Subject Details: "+subject);
        System.out.println("Manual : "+subject.hashCode());

        System.out.println("==========================");
        Computer computer = new Computer("White",63,'A');
        System.out.println("Computer Details: "+computer);
        System.out.println("Manual : "+computer.hashCode());

        System.out.println("==========================");
        Facebook facebook = new Facebook("Keanu Reevs",41,'A');
        System.out.println("Facebook Details: "+facebook);
        System.out.println("Manual : "+facebook.hashCode());

        System.out.println("==========================");
        Doll doll = new Doll("Barbie",23,"London");
        System.out.println("Doll Details: "+doll);
        System.out.println("Manual : "+doll.hashCode());

        System.out.println("======+====================");
        Van van = new Van("Barbie",23,"London");
        System.out.println("Doll Details: "+doll);
        System.out.println("Manual : "+van.hashCode());



        System.out.println("==========================");
        Meera meera = new Meera("Black",8,'B');
        System.out.println("Meera Details:"+meera);
        System.out.println("Manual : "+meera.hashCode());

        System.out.println("=============================");
        China china = new China("Chinese",'A',"Giant Panda");
        System.out.println("China Details:"+china);
        System.out.println("Manual : "+china.hashCode());

        System.out.println("=============================");
        Cindrella cindrella = new Cindrella("Disney",9,"America");
        System.out.println("Cindrella Details:"+cindrella);
        System.out.println("Manual : "+cindrella.hashCode());

        System.out.println("=============================");
        Whatsapp whatsapp = new Whatsapp("Donald",145,'A');
        System.out.println("Whatsapp Details:"+whatsapp);
        System.out.println("Manual : "+whatsapp.hashCode());

        System.out.println("=============================");
        Music music = new Music("Geleya",5,'A');
        System.out.println("Music  Details:"+music);
        System.out.println("Manual : "+music.hashCode());


        System.out.println("=============================");
        Russia russia = new Russia("Russians",'B',"Brown Bear");
        System.out.println("Russia  Details:"+russia);
        System.out.println("Manual : "+russia.hashCode());

        System.out.println("=========================");
        Dettol dettol = new Dettol("Blue",17,'A');
        System.out.println("Dettol Details:"+dettol);
        System.out.println("Manual : "+dettol.hashCode());


        System.out.println("=========================");
        Omni omni = new Omni("White",8,"Sagara");
        System.out.println("Omni Details:"+omni);
        System.out.println("Manual : "+omni.hashCode());

        System.out.println("=========================");
        Tab tab = new Tab("Samsung",'B',"Black");
        System.out.println("Tab Details:"+tab);
        System.out.println("Manual : "+tab.hashCode());

        System.out.println("=========================");
        Security security = new Security("Indian",110,"Blue");
        System.out.println("Security Details:"+security);
        System.out.println("Manual : "+security.hashCode());

        System.out.println("=========================");
        Juice juice = new Juice("7up",25,'A');
        System.out.println("Juice Details:"+juice);
        System.out.println("Manual : "+juice.hashCode());



        System.out.println("=========================");
        Rocket rocket = new Rocket("Army",70,"Chhattisgarh");
        System.out.println("Rocket Details:"+rocket);
        System.out.println("Manual : "+rocket.hashCode());


        System.out.println("=========================");
        Wine wine = new Wine("Merlot",150,'A');
        System.out.println("Wine Details:"+wine);
        System.out.println("Wine :"+wine.hashCode());
        System.out.println("Manual : "+wine.hashCode());

        System.out.println("=========================");
        Google google = new Google("Chrome",1,'A');
        System.out.println("Google Details:"+google);
        System.out.println("Manual : "+google.hashCode());

        System.out.println("=========================");
        Patanjali patanjali = new Patanjali("Orange",25,'B');
        System.out.println(" Patanjali Details:"+patanjali);
        System.out.println("Manual : "+patanjali.hashCode());

        System.out.println("=========================");
        Elephant elephant = new Elephant("Vinayka",1,"Shivamogga");
        System.out.println(" Elephant  Details:"+elephant);
        System.out.println("Manual : "+elephant.hashCode());

        System.out.println("=========================");
        Lion lion = new Lion("Parvathi",1,"Shivamogga");
        System.out.println(" Lion  Details:"+lion);
        System.out.println("Manual : "+lion.hashCode());

        System.out.println("=========================");
        Cow cow = new Cow("Gowri",1,"Hosanagara");
        System.out.println(" Cow  Details:"+cow);
        System.out.println("Manual : "+cow.hashCode());

        System.out.println("=========================");
        Bull bull = new Bull("Basava",1,"Sagara");
        System.out.println(" Bull  Details:"+bull);
        System.out.println("Manual : "+bull.hashCode());

        System.out.println("=========================");
        Sparx sparx = new Sparx("Sparx",200,"Black");
        System.out.println(" Sparx  Details:"+sparx);
        System.out.println("Manual : "+sparx.hashCode());

        System.out.println("=========================");
        Shorts shorts = new Shorts("Nike",250,"Yellow");
        System.out.println(" Shorts  Details:"+shorts);
        System.out.println("Manual : "+shorts.hashCode());

        System.out.println("=========================");
        Dog dog = new Dog("Teepu",16,"Mysore");
        System.out.println(" Dog  Details:"+dog);
        System.out.println("Manual : "+dog.hashCode());


        System.out.println("=========================");
        Cat cat = new Cat("Pinky",23,"Gulbarga");
        System.out.println(" Cat  Details:"+cat);
        System.out.println("Manual : "+cat.hashCode());


        System.out.println("=========================");
        Bike bike = new Bike("TVS",16,"Hassan");
        System.out.println(" Bike  Details:"+bike);
        System.out.println("Manual : "+bike.hashCode());



        System.out.println("=========================");
        Lead lead = new Lead("Bluish White",17,'C');
        System.out.println(" Lead  Details:"+lead);
        System.out.println("Manual : "+lead.hashCode());


        System.out.println("=========================");
        MysoreSandal mysoreSandal = new MysoreSandal("Cream",25,'A');
        System.out.println(" Mysore Sandal  Details:"+mysoreSandal);
        System.out.println("Manual : "+mysoreSandal.hashCode());


        System.out.println("=========================");
        Goat goat = new Goat("Mylari",35,"Davanagere");
        System.out.println(" Goat  Details:"+goat);
        System.out.println("Manual : "+goat.hashCode());

        System.out.println("=========================");
        Snake snake = new Snake("Kalinga",44,"Hebri");
        System.out.println(" Snake Details:"+snake);
        System.out.println("Manual : "+snake.hashCode());

        System.out.println("=========================");
        Clear clear = new Clear("White",12,'B');
        System.out.println(" Clear Shampoo Details:"+clear);
        System.out.println("Manual : "+clear.hashCode());

        System.out.println("=========================");
        Towel towel = new Towel("Heaven",50,"Blue");
        System.out.println(" Towel Details:"+towel);
        System.out.println("Manual : "+towel.hashCode());



        System.out.println("=========================");
        Wheel wheel= new Wheel("Green",15,'A');
        System.out.println(" Wheel Soap Details:"+wheel);
        System.out.println("Wheel: "+wheel.hashCode());
        System.out.println("Manual : "+wheel.hashCode());

        System.out.println("=========================");
        Vim vim = new Vim("Geeen",20,'A');
        System.out.println(" Vim Soap Details:"+vim);
        System.out.println("Manual : "+vim.hashCode());

        System.out.println("=========================");
        Blood blood = new Blood("O positive",120,'A');
        System.out.println(" Blood Details:"+blood);
        System.out.println("Manual : "+blood.hashCode());

        System.out.println("=========================");
        Doctor doctor = new Doctor("Ravi",49,"Ripponpet");
        System.out.println(" Doctor Details:"+doctor);
        System.out.println("Manual : "+doctor.hashCode());


        System.out.println("=========================");
        Nurse nurse = new Nurse("Sarojini",52,"Hosanagara");
        System.out.println(" Nurse Details:"+nurse);
        System.out.println("Manual : "+nurse.hashCode());




        System.out.println("=========================");
        Bicycle bicycle = new Bicycle("Herculus",1,"Siddhappanagudi");
        System.out.println(" Bicycle Details:"+bicycle);
        System.out.println("Manual : "+bicycle.hashCode());

        System.out.println("=========================");
        Rose rose = new Rose("Red",10,'A');
        System.out.println(" Rose Details:"+rose);
        System.out.println("Manual : "+rose.hashCode());


        System.out.println("=========================");
        Rabbit rabbit = new Rabbit("Ruby",9,"Newyork");
        System.out.println(" Rabbit Details:"+rabbit);
        System.out.println("Manual : "+rabbit.hashCode());



        System.out.println("=========================");
        Horse horse = new Horse("Badhshah",5,"Kundapura");
        System.out.println(" Horse Details:"+horse);
        System.out.println("Manual : "+horse.hashCode());

        System.out.println("=========================");
        Scooter scooter = new Scooter("Chetak",17,"Udupi");
        System.out.println(" Scooter Details:"+scooter);
        System.out.println("Manual : "+scooter.hashCode());


        System.out.println("=========================");
        Drip drip = new Drip("Fluid",2,"Bidar");
        System.out.println(" Drip Details:"+drip);
        System.out.println("Manual : "+drip.hashCode());


        System.out.println("=========================");
        Gaurd gaurd = new Gaurd("Forest",122,"khakhi");
        System.out.println(" Gaurd Details:"+gaurd);
        System.out.println("Manual : "+gaurd.hashCode());


        System.out.println("=========================");
        Taxi taxi = new Taxi("Toyota",89,"Bagalakot");
        System.out.println(" Taxi Details:"+taxi);
        System.out.println("Manual : "+taxi.hashCode());


        System.out.println("=========================");
        Trimmer trimmer = new Trimmer("Philips",50,'A');
        System.out.println(" Gadget Details:"+trimmer);
        System.out.println("Manual : "+trimmer.hashCode());

        System.out.println("=========================");
        DirtBike dirtBike = new DirtBike("Yamaha",14,"Chikkamagalur");
        System.out.println(" DirtBike Details:"+dirtBike);
        System.out.println("Manual : "+dirtBike.hashCode());

        System.out.println("=========================");
        SunFlower sunFlower = new SunFlower("Yellow",50,'A');
        System.out.println(" SunFlower Details:"+sunFlower);
        System.out.println("Manual : "+sunFlower.hashCode());


        System.out.println("=========================");
        Rat rat = new Rat("Mushika",64,"Aanegudde");
        System.out.println(" Rat Details:"+rat);
        System.out.println("Manual : "+rat.hashCode());


        System.out.println("=========================");
        Jeans jeans = new Jeans("Denim",130,"Blue");
        System.out.println(" Jeans Details:"+jeans);
        System.out.println("Manual : "+jeans.hashCode());

        System.out.println("=========================");
        Parrot parrot = new Parrot("Kaali",70,"Mumbai");
        System.out.println(" Parrot Details:"+parrot);
        System.out.println("Manual : "+parrot.hashCode());

        System.out.println("=========================");
        Shashi shashi = new Shashi("Pink",14,'B');
        System.out.println(" Shashi Soap Details:"+shashi);
        System.out.println("Manual : "+shashi.hashCode());


        System.out.println("=========================");
        DaburRed daburRed = new DaburRed("Red",10,'A');
        System.out.println(" DaburRed Paste Details:"+daburRed);
        System.out.println("Manual : "+daburRed.hashCode());

        System.out.println("=========================");
        Colgate colgate = new Colgate("Blue",12,'B');
        System.out.println(" Colgate Paste Details:"+colgate);
        System.out.println("Manual : "+colgate.hashCode());


        System.out.println("=========================");
        Sensodyne sensodyne = new Sensodyne("White",7,'C');
        System.out.println(" Sensodyne Paste Details:"+sensodyne);
        System.out.println("Manual : "+sensodyne.hashCode());

        System.out.println("=========================");
        Barbie barbie = new Barbie("Barbie",46,"London");
        System.out.println(" Barbie Toy Details:"+barbie);
        System.out.println("Manual : "+barbie.hashCode());

        System.out.println("=========================");
        Student student = new Student("Vinayaka",61,'A');
        System.out.println(" Student Details:"+student);
        System.out.println("Manual : "+student.hashCode());

        System.out.println("=========================");
        Safari safari = new Safari("Brown",112,'B');
        System.out.println(" Safari Bag Details:"+safari);
        System.out.println("Manual : "+safari.hashCode());


        System.out.println("=========================");
        Banana banana = new Banana("Good",56,4);
        System.out.println(" Banana Details:"+banana);
        System.out.println("Manual : "+banana.hashCode());


        System.out.println("=========================");
        Apple apple = new Apple("Moderate",80,2);
        System.out.println(" Apple Details:"+apple);
        System.out.println("Manual : "+apple.hashCode());



        System.out.println("=========================");
        Orange orange = new Orange("Good",60,3);
        System.out.println(" Orange Details:"+orange);
        System.out.println("Manual : "+orange.hashCode());


        System.out.println("=========================");
        Walkmate walkmate = new Walkmate("Lunars",160,"Blue");
        System.out.println(" Walkmate Details:"+walkmate);
        System.out.println("Manual: "+walkmate.hashCode());


        System.out.println("=========================");
        Ambulance ambulance = new Ambulance("Emergency Case",15,"Ballari");
        System.out.println(" Ambulance Details:"+ambulance);
        System.out.println("Manual: "+ambulance.hashCode());










































    }
}
