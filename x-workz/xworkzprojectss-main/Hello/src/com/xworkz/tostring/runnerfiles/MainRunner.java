package com.xworkz.tostring.runnerfiles;
import com.xworkz.tostring.innerfiles.*;

public class MainRunner {
    public static void main(String[] args) {

        Adapter adapter=new Adapter();
        adapter.getrange(20);
        adapter.getcolor("Black");
        adapter.getsize(3.5);
        System.out.println(adapter);

        Adapter adapter2=new Adapter();
        adapter2.getrange(20);
        adapter2.getcolor("Black");
        adapter2.getsize(3.5);
        System.out.println(adapter2);

        System.out.println(adapter.hashCode());
        System.out.println("Original: "+System.identityHashCode(adapter));

        System.out.println("Checking same locations...");
        boolean same=adapter.equals(adapter2);
        System.out.println("Comparision of the locations are :"+same);
        System.out.println("Adaptor is same as Adaptor2");
        System.out.println("*****************************************************************");

        Antenna antenna=new Antenna();
        antenna.getsize(2);
        antenna.getflexibility("Good");
        antenna.getshape(4.5);
        System.out.println(antenna);

        Antenna antenna1=new Antenna();
        antenna1.getsize(2);
        antenna1.getflexibility("Good");
        antenna1.getshape(4.5);
        System.out.println(antenna1);

        System.out.println(antenna.hashCode());
        System.out.println("Original: "+System.identityHashCode(antenna));

        System.out.println("Checking same locations...");
        boolean same1=antenna.equals(antenna1);
        System.out.println("Comparision of the locations are :"+same1);
        System.out.println("Antenna is same as Antenna1");
        System.out.println("*****************************************************************");

        Apron apron = new Apron();
        apron.getshape(84);
        apron.gettexture("Apron");
        apron.getvolume(84.1);
        System.out.println(apron);

        Apron apron1 = new Apron();
        apron1.getshape(84);
        apron1.gettexture("Apron");
        apron1.getvolume(84.1);
        System.out.println(apron1);

        System.out.println(apron.hashCode());
        System.out.println("Original: " + System.identityHashCode(apron));

        System.out.println("Checking same locations...");
        boolean sameApron = apron.equals(apron1);
        System.out.println("Comparision of the locations are :"+sameApron);
        System.out.println("Apron is same as Apron1");
        System.out.println("*****************************************************************");

        Bandage bandage = new Bandage();
        bandage.getflexibility(16);
        bandage.getshape("Bandage");
        bandage.getweight(16.1);
        System.out.println(bandage);

        Bandage bandage1 = new Bandage();
        bandage1.getflexibility(16);
        bandage1.getshape("Bandage");
        bandage1.getweight(16.1);
        System.out.println(bandage1);

        System.out.println(bandage.hashCode());
        System.out.println("Original: " + System.identityHashCode(bandage));

        System.out.println("Checking same locations...");
        boolean sameBandage = bandage.equals(bandage1);
        System.out.println("Comparision of the locations are :"+sameBandage);
        System.out.println("Bandage is same as Bandage1");
        System.out.println("*****************************************************************");

        Battery battery = new Battery();
        battery.getflexibility(92);
        battery.getpower("Battery");
        battery.gettexture(92);
        System.out.println(battery);

        Battery battery1 = new Battery();
        battery1.getflexibility(92);
        battery1.getpower("Battery");
        battery1.getflexibility(92);
        System.out.println(battery1);

        System.out.println(battery.hashCode());
        System.out.println("Original: " + System.identityHashCode(battery));

        System.out.println("Checking same locations...");
        boolean sameBattery = battery.equals(battery1);
        System.out.println("Comparision of the locations are :"+sameBattery);
        System.out.println("Battery is same as Battery1");
        System.out.println("*****************************************************************");

        ChargerCable chargerCable = new ChargerCable(98,"Fast charge",50.01);
        System.out.println(chargerCable);

        ChargerCable chargerCable1 = new ChargerCable(98,"Fast charge",50.01);
        System.out.println(chargerCable1);

        System.out.println(chargerCable.hashCode());
        System.out.println("Original: " + System.identityHashCode(chargerCable));

        System.out.println("Checking same locations...");
        boolean sameCharger = chargerCable.equals(chargerCable1);
        System.out.println("Comparision of the locations are :"+sameCharger);
        System.out.println("ChargerCable is same as ChargerCable1");
        System.out.println("*****************************************************************");

        Crutch crutch = new Crutch(17,"Shaping",17.1);
        System.out.println(crutch);

        Crutch crutch1 = new Crutch(17,"Shaping",17.1);
        System.out.println(crutch1);

        System.out.println(crutch.hashCode());
        System.out.println("Original: " + System.identityHashCode(crutch));

        System.out.println("Checking same locations...");
        boolean sameCrutch = crutch.equals(crutch1);
        System.out.println("Comparision of the locations are :"+sameCrutch);
        System.out.println("Crutch is same as Crutch1");
        System.out.println("*****************************************************************");

        Cello cello = new Cello(10,"It is a tape",10.1);
        System.out.println(cello);
        Cello cello1 = new Cello(10,"It is a tape",10.1);
        System.out.println(cello1);

        System.out.println(cello.hashCode());
        System.out.println("Original: " + System.identityHashCode(cello));

        System.out.println("Checking same locations...");
        boolean sameCello = cello.equals(cello1);
        System.out.println("Comparision of the locations are :"+sameCello);
        System.out.println("Cello is same as Cello1");
        System.out.println("*****************************************************************");
        Clipboard clipboard = new Clipboard(35,"Have buttons",40.01);
        System.out.println(clipboard);

        Clipboard clipboard1 = new Clipboard(35,"Have buttons",40.01);
        System.out.println(clipboard1);

        System.out.println(clipboard.hashCode());
        System.out.println("Original: " + System.identityHashCode(clipboard));

        System.out.println("Checking same locations...");
        boolean sameClipboard = clipboard.equals(clipboard1);
        System.out.println("Comparision of the locations are :"+sameClipboard);
        System.out.println("Clipboard is same as Clipboard1");
        System.out.println("*****************************************************************");

        Circuit circuit = new Circuit(98,"wireing",70.02);
        System.out.println(circuit);

        Circuit circuit1 = new Circuit(98,"wireing",70.02);
        System.out.println(circuit1);

        System.out.println(circuit.hashCode());
        System.out.println("Original: " + System.identityHashCode(circuit));

        System.out.println("Checking same locations...");
        boolean sameCircuit = circuit.equals(circuit1);
        System.out.println("Comparision of the locations are :"+sameCircuit);
        System.out.println("Circuit is same as Circuit1");
        System.out.println("*****************************************************************");

        Document document = new Document(23,"Adharcard",78.9);
        System.out.println(document);
        Document document1 = new Document(23,"Adharcard",78.9);
        System.out.println(document1);

        System.out.println(document.hashCode());
        System.out.println("Original: " + System.identityHashCode(document));

        System.out.println("Checking same locations...");
        boolean sameDocument = document.equals(document1);
        System.out.println("Comparision of the locations are :"+sameDocument);
        System.out.println("Document is same as Document1");
        System.out.println("*****************************************************************");

        Database database = new Database(30,"Storage",89.33);
        System.out.println(database);
        Database database1 = new Database(30,"Storage",89.33);
        System.out.println(database1);

        System.out.println(database.hashCode());
        System.out.println("Original: " + System.identityHashCode(database));

        System.out.println("Checking same locations...");
        boolean sameDatabase = database.equals(database1);
        System.out.println("Comparision of the locations are :"+sameDatabase);
        System.out.println("Database is same as Database1");
        System.out.println("*****************************************************************");
        Drone drone = new Drone(21,"Drone",21.1);
        Drone drone1 = new Drone(21,"Drone",21.1);
        System.out.println(drone);
        System.out.println(drone1);

        System.out.println(drone.hashCode());
        System.out.println("Original: " + System.identityHashCode(drone));

        System.out.println("Checking same locations...");
        boolean sameDrone = drone.equals(drone1);
        System.out.println("Comparision of the locations are :"+sameDrone);
        System.out.println("Drone is same as Drone1");
        System.out.println("*****************************************************************");

        Drum drum = new Drum(20,"Will have good capacity",2.56);
        System.out.println(drum);
        Drum drum1 = new Drum(20,"Will have good capacity",2.56);
        System.out.println(drum1);

        System.out.println(drum.hashCode());
        System.out.println("Original: " + System.identityHashCode(drum));

        System.out.println("Checking same locations...");
        boolean sameDrum = drum.equals(drum1);
        System.out.println("Comparision of the locations are :"+sameDrum);
        System.out.println("Drum is same as Drum1");
        System.out.println("*****************************************************************");
        Envelope envelope = new Envelope(38, "Envelope", 38.1);
        System.out.println(envelope);
        Envelope envelope1 = new Envelope(38, "Envelope", 38.1);
        System.out.println(envelope1);

        System.out.println(envelope.hashCode());
        System.out.println("Original: " + System.identityHashCode(envelope));

        System.out.println("Checking same locations...");
        boolean sameEnvelope = envelope.equals(envelope1);
        System.out.println("Comparision of the locations are :"+sameEnvelope);
        System.out.println("Envelope is same as Envelope1");
        System.out.println("*****************************************************************");

        ExtensionCord extensionCord = new ExtensionCord(95, "ExtensionCord", 95.1);
        System.out.println(extensionCord);
        ExtensionCord extensionCord1 = new ExtensionCord(95, "ExtensionCord", 95.1);
        System.out.println(extensionCord1);

        System.out.println(extensionCord.hashCode());
        System.out.println("Original: " + System.identityHashCode(extensionCord));

        System.out.println("Checking same locations...");
        boolean sameExtension = extensionCord.equals(extensionCord1);
        System.out.println("Comparision of the locations are :"+sameExtension);
        System.out.println("ExtensionCord is same as ExtensionCord1");
        System.out.println("*****************************************************************");

        Folder folder = new Folder(37, "Folder", 37.1);
        System.out.println(folder);
        Folder folder1 = new Folder(37, "Folder", 37.1);
        System.out.println(folder1);

        System.out.println(folder.hashCode());
        System.out.println("Original: " + System.identityHashCode(folder));

        System.out.println("Checking same locations...");
        boolean sameFolder = folder.equals(folder1);
        System.out.println("Comparision of the locations are :"+sameFolder);
        System.out.println("Folder is same as Folder1");
        System.out.println("*****************************************************************");

        Fuse fuse = new Fuse(96, "Fuse", 96.1);
        System.out.println(fuse);
        Fuse fuse1 = new Fuse(96, "Fuse", 96.1);
        System.out.println(fuse1);

        System.out.println(fuse.hashCode());
        System.out.println("Original: " + System.identityHashCode(fuse));

        System.out.println("Checking same locations...");
        boolean sameFuse = fuse.equals(fuse1);
        System.out.println("Comparision of the locations are :"+sameFuse);
        System.out.println("Fuse is same as Fuse1");
        System.out.println("*****************************************************************");

        Flashlight flashlight = new Flashlight(91, "Flashlight", 91.1);
        System.out.println(flashlight);
        Flashlight flashlight1 = new Flashlight(91, "Flashlight", 91.1);
        System.out.println(flashlight1);

        System.out.println(flashlight.hashCode());
        System.out.println("Original: " + System.identityHashCode(flashlight));

        System.out.println("Checking same locations...");
        boolean sameFlashlight = flashlight.equals(flashlight1);
        System.out.println("Comparision of the locations are :"+sameFlashlight);
        System.out.println("Flashlight is same as Flashlight1");
        System.out.println("*****************************************************************");

        Flute flute = new Flute(3, "Good sound", 6.1);
        System.out.println(flute);
        Flute flute1 = new Flute(3, "Good sound", 6.1);
        System.out.println(flute1);

        System.out.println(flute.hashCode());
        System.out.println("Original: " + System.identityHashCode(flute));

        System.out.println("Checking same locations...");
        boolean sameFlute = flute.equals(flute1);
        System.out.println("Comparision of the locations are :"+sameFlute);
        System.out.println("Flute is same as Flute1");
        System.out.println("*****************************************************************");

        Guitar guitar = new Guitar(8, "with gravity", 3.1);
        System.out.println(guitar);
        Guitar guitar1 = new Guitar(8, "with gravity", 3.1);
        System.out.println(guitar1);

        System.out.println(guitar.hashCode());
        System.out.println("Original: " + System.identityHashCode(guitar));

        System.out.println("Checking same locations...");
        boolean sameGuitar = guitar.equals(guitar1);
        System.out.println("Comparision of the locations are :"+sameGuitar);
        System.out.println("Guitar is same as Guitar1");
        System.out.println("*****************************************************************");

        Harmonica harmonica = new Harmonica(4, "High level", 7.1);
        System.out.println(harmonica);
        Harmonica harmonica1 = new Harmonica(4, "High level", 7.1);
        System.out.println(harmonica1);

        System.out.println(harmonica.hashCode());
        System.out.println("Original: " + System.identityHashCode(harmonica));

        System.out.println("Checking same locations...");
        boolean sameHarmonica = harmonica.equals(harmonica1);
        System.out.println("Comparision of the locations are :"+sameHarmonica);
        System.out.println("Harmonica is same as Harmonica1");
        System.out.println("*****************************************************************");

        Label label = new Label(40, "Label", 40.1);
        System.out.println(label);
        Label label1 = new Label(40, "Label", 40.1);
        System.out.println(label1);
        System.out.println(label.hashCode());
        System.out.println("Original: " + System.identityHashCode(label));
        System.out.println("Checking same locations...");
        System.out.println("Label is same as Label1: " + label.equals(label1));
        System.out.println("*****************************************************************");

        Ladder ladder = new Ladder(41, "Ladder", 41.1);
        System.out.println(ladder);
        Ladder ladder1 = new Ladder(41, "Ladder", 41.1);
        System.out.println(ladder1);
        System.out.println(ladder.hashCode());
        System.out.println("Original: " + System.identityHashCode(ladder));
        System.out.println("Checking same locations...");
        System.out.println("Ladder is same as Ladder1: " + ladder.equals(ladder1));
        System.out.println("*****************************************************************");

        Modem modem = new Modem(27, "Modem", 27.1);
        System.out.println(modem);
        Modem modem1 = new Modem(27, "Modem", 27.1);
        System.out.println(modem1);
        System.out.println(modem.hashCode());
        System.out.println("Original: " + System.identityHashCode(modem));
        System.out.println("Checking same locations...");
        System.out.println("Modem is same as Modem1: " + modem.equals(modem1));
        System.out.println("*****************************************************************");

        Microscope microscope = new Microscope(11, "Microscope", 11.1);
        System.out.println(microscope);
        Microscope microscope1 = new Microscope(11, "Microscope", 11.1);
        System.out.println(microscope1);
        System.out.println(microscope.hashCode());
        System.out.println("Original: " + System.identityHashCode(microscope));
        System.out.println("Checking same locations...");
        System.out.println("Microscope is same as Microscope1: " + microscope.equals(microscope1));
        System.out.println("*****************************************************************");

        Outlet outlet = new Outlet(99, "Outlet", 99.1);
        System.out.println(outlet);
        Outlet outlet1 = new Outlet(99, "Outlet", 99.1);
        System.out.println(outlet1);
        System.out.println(outlet.hashCode());
        System.out.println("Original: " + System.identityHashCode(outlet));
        System.out.println("Checking same locations...");
        System.out.println("Outlet is same as Outlet1: " + outlet.equals(outlet1));
        System.out.println("*****************************************************************");

        Plug plug = new Plug(100, "Plug", 100.1);
        System.out.println(plug);
        Plug plug1 = new Plug(100, "Plug", 100.1);
        System.out.println(plug1);
        System.out.println(plug.hashCode());
        System.out.println("Original: " + System.identityHashCode(plug));
        System.out.println("Checking same locations...");
        System.out.println("Plug is same as Plug1: " + plug.equals(plug1));
        System.out.println("*****************************************************************");

        Printer printer = new Printer(31, "Printer", 31.1);
        System.out.println(printer);
        Printer printer1 = new Printer(31, "Printer", 31.1);
        System.out.println(printer1);
        System.out.println(printer.hashCode());
        System.out.println("Original: " + System.identityHashCode(printer));
        System.out.println("Checking same locations...");
        System.out.println("Printer is same as Printer1: " + printer.equals(printer1));
        System.out.println("*****************************************************************");

        Paper paper = new Paper(39, "Paper", 39.1);
        System.out.println(paper);
        Paper paper1 = new Paper(39, "Paper", 39.1);
        System.out.println(paper1);
        System.out.println(paper.hashCode());
        System.out.println("Original: " + System.identityHashCode(paper));
        System.out.println("Checking same locations...");
        System.out.println("Paper is same as Paper1: " + paper.equals(paper1));
        System.out.println("*****************************************************************");

        Piano piano = new Piano(4, "Oval", 4.1);
        System.out.println(piano);
        Piano piano1 = new Piano(4, "Oval", 4.1);
        System.out.println(piano1);
        System.out.println(piano.hashCode());
        System.out.println("Original: " + System.identityHashCode(piano));
        System.out.println("Checking same locations...");
        System.out.println("Piano is same as Piano1: " + piano.equals(piano1));
        System.out.println("*****************************************************************");

        Projector projector = new Projector(33, "Projector", 33.1);
        System.out.println(projector);
        Projector projector1 = new Projector(33, "Projector", 33.1);
        System.out.println(projector1);
        System.out.println(projector.hashCode());
        System.out.println("Original: " + System.identityHashCode(projector));
        System.out.println("Checking same locations...");
        System.out.println("Projector is same as Projector1: " + projector.equals(projector1));
        System.out.println("*****************************************************************");

        Saxophone saxophone = new Saxophone(221, "Saxophone", 8.1);
        System.out.println(saxophone);
        Saxophone saxophone1 = new Saxophone(221, "Saxophone", 8.1);
        System.out.println(saxophone1);
        System.out.println(saxophone.hashCode());
        System.out.println("Original: " + System.identityHashCode(saxophone));
        System.out.println("Checking same locations...");
        System.out.println("Saxophone is same as Saxophone1: " + saxophone.equals(saxophone1));
        System.out.println("*****************************************************************");

        Scalpel scalpel = new Scalpel(19, "Scalpel", 19.1);
        System.out.println(scalpel);
        Scalpel scalpel1 = new Scalpel(19, "Scalpel", 19.1);
        System.out.println(scalpel1);
        System.out.println(scalpel.hashCode());
        System.out.println("Original: " + System.identityHashCode(scalpel));
        System.out.println("Checking same locations...");
        System.out.println("Scalpel is same as Scalpel1: " + scalpel.equals(scalpel1));
        System.out.println("*****************************************************************");

        Robot robot = new Robot(22, "Robot", 22.1);
        System.out.println(robot);
        Robot robot1 = new Robot(22, "Robot", 22.1);
        System.out.println(robot1);
        System.out.println(robot.hashCode());
        System.out.println("Original: " + System.identityHashCode(robot));
        System.out.println("Checking same locations...");
        System.out.println("Robot is same as Robot1: " + robot.equals(robot1));
        System.out.println("*****************************************************************");

        Receiver receiver = new Receiver(25, "Receiver", 25.1);
        System.out.println(receiver);
        Receiver receiver1 = new Receiver(25, "Receiver", 25.1);
        System.out.println(receiver1);
        System.out.println(receiver.hashCode());
        System.out.println("Original: " + System.identityHashCode(receiver));
        System.out.println("Checking same locations...");
        System.out.println("Receiver is same as Receiver1: " + receiver.equals(receiver1));
        System.out.println("*****************************************************************");

        Router router = new Router(26, "Router", 26.1);
        System.out.println(router);
        Router router1 = new Router(26, "Router", 26.1);
        System.out.println(router1);
        System.out.println(router.hashCode());
        System.out.println("Original: " + System.identityHashCode(router));
        System.out.println("Checking same locations...");
        System.out.println("Router is same as Router1: " + router.equals(router1));
        System.out.println("*****************************************************************");

        Sensor sensor = new Sensor(23, "Sensor", 23.1);
        System.out.println(sensor);
        Sensor sensor1 = new Sensor(23, "Sensor", 23.1);
        System.out.println(sensor1);
        System.out.println(sensor.hashCode());
        System.out.println("Original: " + System.identityHashCode(sensor));
        System.out.println("Checking same locations...");
        System.out.println("Sensor is same as Sensor1: " + sensor.equals(sensor1));
        System.out.println("*****************************************************************");

        Stethoscope stethoscope = new Stethoscope(13, "Stethoscope", 13.1);
        System.out.println(stethoscope);
        Stethoscope stethoscope1 = new Stethoscope(13, "Stethoscope", 13.1);
        System.out.println(stethoscope1);
        System.out.println(stethoscope.hashCode());
        System.out.println("Original: " + System.identityHashCode(stethoscope));
        System.out.println("Checking same locations...");
        System.out.println("Stethoscope is same as Stethoscope1: " + stethoscope.equals(stethoscope1));
        System.out.println("*****************************************************************");

        Scanner scanner = new Scanner(32, "Scanner", 32.1);
        System.out.println(scanner);
        Scanner scanner1 = new Scanner(32, "Scanner", 32.1);
        System.out.println(scanner1);
        System.out.println(scanner.hashCode());
        System.out.println("Original: " + System.identityHashCode(scanner));
        System.out.println("Checking same locations...");
        System.out.println("Scanner is same as Scanner1: " + scanner.equals(scanner1));
        System.out.println("*****************************************************************");

        Server server = new Server(29, "Server", 29.1);
        System.out.println(server);
        Server server1 = new Server(29, "Server", 29.1);
        System.out.println(server1);
        System.out.println(server.hashCode());
        System.out.println("Original: " + System.identityHashCode(server));
        System.out.println("Checking same locations...");
        System.out.println("Server is same as Server1: " + server.equals(server1));
        System.out.println("*****************************************************************");

        Syringe syringe = new Syringe(15, "Syringe", 15.1);
        System.out.println(syringe);
        Syringe syringe1 = new Syringe(15, "Syringe", 15.1);
        System.out.println(syringe1);
        System.out.println(syringe.hashCode());
        System.out.println("Original: " + System.identityHashCode(syringe));
        System.out.println("Checking same locations...");
        System.out.println("Syringe is same as Syringe1: " + syringe.equals(syringe1));
        System.out.println("*****************************************************************");

        Switches aSwitches = new Switches(97, "Switch", 97.1);
        System.out.println(aSwitches);

        Switches aSwitches1 = new Switches(97, "Switch", 97.1);
        System.out.println(aSwitches1);

        System.out.println(aSwitches.hashCode());
        System.out.println("Original: " + System.identityHashCode(aSwitches));

        System.out.println("Checking same locations...");
        boolean sameSwitch = aSwitches.equals(aSwitches1);
        System.out.println("Switch is same as Switch1: " + sameSwitch);
        System.out.println("*****************************************************************");

        Drill drill = new Drill(42,"Making holes",55.0);
        System.out.println(drill);

        Drill drill1 = new Drill(42,"Making holes",55.0);
        System.out.println(drill1);

        System.out.println(drill.hashCode());
        System.out.println("Original: " + System.identityHashCode(drill));
        System.out.println("Checking same locations...");
        System.out.println("Drill is same as Drill1: " + drill.equals(drill1));
        System.out.println("*****************************************************************");

        Switches switches=new Switches(97, "Switch", 97.1);
        System.out.println(aSwitches);

        Switches switches1 = new Switches(97, "Switch", 97.1);
        System.out.println(aSwitches1);

        System.out.println(switches.hashCode());
        System.out.println("Original: " + System.identityHashCode(aSwitches));

        System.out.println("Checking same locations...");
        boolean sameSwitches = aSwitches.equals(aSwitches1);
        System.out.println("Switch is same as Switch1: " + sameSwitches);
        System.out.println("*****************************************************************");

        Drum drum2 = new Drum(20, "Will have good capacity", 2.56);
        System.out.println(drum);

        Drum drum3 = new Drum(20, "Will have good capacity", 2.56);
        System.out.println(drum1);

        System.out.println(drum2.hashCode());
        System.out.println("Original: " + System.identityHashCode(drum2));

        System.out.println("Checking same locations...");
        boolean sameDrum1 = drum.equals(drum1);
        System.out.println("Drum2 is same as Drum3: " + sameDrum1);
        System.out.println("*****************************************************************");

        Hammer hammer = new Hammer(43, "Hammer", 43.1);
        System.out.println(hammer);

        Hammer hammer1 = new Hammer(43, "Hammer", 43.1);
        System.out.println(hammer1);

        System.out.println(hammer.hashCode());
        System.out.println("Original: " + System.identityHashCode(hammer));

        System.out.println("Checking same locations...");
        boolean sameHammer = hammer.equals(hammer1);
        System.out.println("Hammer is same as Hammer1: " + sameHammer);
        System.out.println("*****************************************************************");

        Saw saw = new Saw(44, "Saw", 44.1);
        System.out.println(saw);

        Saw saw1 = new Saw(44, "Saw", 44.1);
        System.out.println(saw1);

        System.out.println(saw.hashCode());
        System.out.println("Original: " + System.identityHashCode(saw));

        System.out.println("Checking same locations...");
        boolean sameSaw = saw.equals(saw1);
        System.out.println("Saw is same as Saw1: " + sameSaw);
        System.out.println("*****************************************************************");

        Wrench wrench = new Wrench(45, "Wrench", 45.1);
        System.out.println(wrench);

        Wrench wrench1 = new Wrench(45, "Wrench", 45.1);
        System.out.println(wrench1);

        System.out.println(wrench.hashCode());
        System.out.println("Original: " + System.identityHashCode(wrench));

        System.out.println("Checking same locations...");
        boolean sameWrench = wrench.equals(wrench1);
        System.out.println("Wrench is same as Wrench1: " + sameWrench);
        System.out.println("*****************************************************************");

        Screwdriver screwdriver = new Screwdriver(46, "Screwdriver", 46.1);
        System.out.println(screwdriver);

        Screwdriver screwdriver1 = new Screwdriver(46, "Screwdriver", 46.1);
        System.out.println(screwdriver1);

        System.out.println(screwdriver.hashCode());
        System.out.println("Original: " + System.identityHashCode(screwdriver));

        System.out.println("Checking same locations...");
        boolean sameScrewdriver = screwdriver.equals(screwdriver1);
        System.out.println("Screwdriver is same as Screwdriver1: " + sameScrewdriver);
        System.out.println("*****************************************************************");

        Pliers pliers = new Pliers(47, "Pliers", 47.1);
        System.out.println(pliers);

        Pliers pliers1 = new Pliers(47, "Pliers", 47.1);
        System.out.println(pliers1);

        System.out.println(pliers.hashCode());
        System.out.println("Original: " + System.identityHashCode(pliers));

        System.out.println("Checking same locations...");
        boolean samePliers = pliers.equals(pliers1);
        System.out.println("Pliers is same as Pliers1: " + samePliers);
        System.out.println("*****************************************************************");

        Nail nail = new Nail(48, "Nail", 48.1);
        System.out.println(nail);

        Nail nail1 = new Nail(48, "Nail", 48.1);
        System.out.println(nail1);

        System.out.println(nail.hashCode());
        System.out.println("Original: " + System.identityHashCode(nail));

        System.out.println("Checking same locations...");
        boolean sameNail = nail.equals(nail1);
        System.out.println("Nail is same as Nail1: " + sameNail);
        System.out.println("*****************************************************************");

        Bolt bolt = new Bolt(49,"Bolt",49.45);
        System.out.println(bolt);
        Bolt bolt1 = new Bolt(49,"Bolt",49.45);
        System.out.println(bolt1);

        System.out.println(bolt.hashCode());
        System.out.println("Original: " + System.identityHashCode(bolt));
        System.out.println("Checking same locations...");
        System.out.println("Bolt is same as Bolt1: " + bolt.equals(bolt1));
        System.out.println("*****************************************************************");

        Tape tape = new Tape(50, "Tape", 50.1);
        System.out.println(tape);

        Tape tape1 = new Tape(50, "Tape", 50.1);
        System.out.println(tape1);

        System.out.println(tape.hashCode());
        System.out.println("Original: " + System.identityHashCode(tape));

        System.out.println("Checking same locations...");
        boolean sameTape = tape.equals(tape1);
        System.out.println("Tape is same as Tape1: " + sameTape);
        System.out.println("*****************************************************************");

        BrushPen brushPen = new BrushPen(51,"BrushPen",51.1);
        System.out.println(brushPen);
        BrushPen brushPen1 = new BrushPen(51,"BrushPen",51.1);
        System.out.println(brushPen1);

        System.out.println(brushPen.hashCode());
        System.out.println("Original: " + System.identityHashCode(brushPen));
        System.out.println("Checking same locations...");
        System.out.println("BrushPen is same as BrushPen1: " + brushPen.equals(brushPen1));
        System.out.println("*****************************************************************");

        Sketchpad sketchpad = new Sketchpad(52, "Sketchpad", 52.1);
        System.out.println(sketchpad);

        Sketchpad sketchpad1 = new Sketchpad(52, "Sketchpad", 52.1);
        System.out.println(sketchpad1);

        System.out.println(sketchpad.hashCode());
        System.out.println("Original: " + System.identityHashCode(sketchpad));

        System.out.println("Checking same locations...");
        boolean sameSketchpad = sketchpad.equals(sketchpad1);
        System.out.println("Sketchpad is same as Sketchpad1: " + sameSketchpad);
        System.out.println("*****************************************************************");

        Canvas canvas = new Canvas(53,"Lens",54.9);
        System.out.println(canvas);
        Canvas canvas1 = new Canvas(53,"Lens",54.9);
        System.out.println(canvas1);

        System.out.println(canvas.hashCode());
        System.out.println("Original: " + System.identityHashCode(canvas));
        System.out.println("Checking same locations...");
        System.out.println("Canvas is same as Canvas1: " + canvas.equals(canvas1));
        System.out.println("*****************************************************************");

        Easel easel = new Easel(54,"Its like easier",45.6);
        System.out.println(easel);
        Easel easel1 = new Easel(54,"Its like easier",45.6);
        System.out.println(easel1);

        System.out.println(easel.hashCode());
        System.out.println("Original: " + System.identityHashCode(easel));
        System.out.println("Checking same locations...");
        System.out.println("Easel is same as Easel1: " + easel.equals(easel1));
        System.out.println("*****************************************************************");

        Palette palette = new Palette(55, "Palette", 55.1);
        System.out.println(palette);

        Palette palette1 = new Palette(55, "Palette", 55.1);
        System.out.println(palette1);

        System.out.println(palette.hashCode());
        System.out.println("Original: " + System.identityHashCode(palette));

        System.out.println("Checking same locations...");
        boolean samePalette = palette.equals(palette1);
        System.out.println("Palette is same as Palette1: " + samePalette);
        System.out.println("*****************************************************************");

        Crayon crayon = new Crayon(56,"Rainbow colors",12.3);
        System.out.println(crayon);

        Crayon crayon1 = new Crayon(56,"Rainbow colors",12.3);
        System.out.println(crayon1);

        System.out.println(crayon.hashCode());
        System.out.println("Original: " + System.identityHashCode(crayon));
        System.out.println("Checking same locations...");
        System.out.println("Crayon is same as Crayon1: " + crayon.equals(crayon1));
        System.out.println("*****************************************************************");

        Chalk chalk = new Chalk(57,"color",78.0);
        System.out.println(chalk);

        Chalk chalk1 = new Chalk(57,"color",78.0);
        System.out.println(chalk1);

        System.out.println(chalk.hashCode());
        System.out.println("Original: " + System.identityHashCode(chalk));
        System.out.println("Checking same locations...");
        boolean sameChalk = chalk.equals(chalk1);
        System.out.println("Chalk is same as Chalk1: " + sameChalk);
        System.out.println("*****************************************************************");

        Charcoal charcoal = new Charcoal(58,"Black color",78.90);
        System.out.println(charcoal);

        Charcoal charcoal1 = new Charcoal(58,"Black color",78.90);
        System.out.println(charcoal1);

        System.out.println(charcoal.hashCode());
        System.out.println("Original: " + System.identityHashCode(charcoal));
        System.out.println("Checking same locations...");
        boolean sameCharcoal = charcoal.equals(charcoal1);
        System.out.println("Charcoal is same as Charcoal1: " + sameCharcoal);
        System.out.println("*****************************************************************");

        MarkerPen markerPen = new MarkerPen(59, "MarkerPen", 59.1);
        System.out.println(markerPen);

        MarkerPen markerPen1 = new MarkerPen(59, "MarkerPen", 59.1);
        System.out.println(markerPen1);

        System.out.println(markerPen.hashCode());
        System.out.println("Original: " + System.identityHashCode(markerPen));

        System.out.println("Checking same locations...");
        boolean sameMarkerPen = markerPen.equals(markerPen1);
        System.out.println("MarkerPen is same as MarkerPen1: " + sameMarkerPen);
        System.out.println("*****************************************************************");

        Highlighter highlighter = new Highlighter(60, "Highlighter", 60.1);
        System.out.println(highlighter);

        Highlighter highlighter1 = new Highlighter(60, "Highlighter", 60.1);
        System.out.println(highlighter1);

        System.out.println(highlighter.hashCode());
        System.out.println("Original: " + System.identityHashCode(highlighter));

        System.out.println("Checking same locations...");
        boolean sameHighlighter = highlighter.equals(highlighter1);
        System.out.println("Highlighter is same as Highlighter1: " + sameHighlighter);
        System.out.println("*****************************************************************");

        Pump pump = new Pump(61, "Pump", 61.1);
        System.out.println(pump);

        Pump pump1 = new Pump(61, "Pump", 61.1);
        System.out.println(pump1);

        System.out.println(pump.hashCode());
        System.out.println("Original: " + System.identityHashCode(pump));

        System.out.println("Checking same locations...");
        boolean samePump = pump.equals(pump1);
        System.out.println("Pump is same as Pump1: " + samePump);
        System.out.println("*****************************************************************");

        Valve valve = new Valve(62, "Valve", 62.1);
        System.out.println(valve);

        Valve valve1 = new Valve(62, "Valve", 62.1);
        System.out.println(valve1);

        System.out.println(valve.hashCode());
        System.out.println("Original: " + System.identityHashCode(valve));

        System.out.println("Checking same locations...");
        boolean sameValve = valve.equals(valve1);
        System.out.println("Valve is same as Valve1: " + sameValve);
        System.out.println("*****************************************************************");

        Faucet faucet = new Faucet(63, "Faucet", 63.1);
        System.out.println(faucet);

        Faucet faucet1 = new Faucet(63, "Faucet", 63.1);
        System.out.println(faucet1);

        System.out.println(faucet.hashCode());
        System.out.println("Original: " + System.identityHashCode(faucet));

        System.out.println("Checking same locations...");
        boolean sameFaucet = faucet.equals(faucet1);
        System.out.println("Faucet is same as Faucet1: " + sameFaucet);
        System.out.println("*****************************************************************");

        Pipe pipe = new Pipe(64, "Pipe", 64.1);
        System.out.println(pipe);

        Pipe pipe1 = new Pipe(64, "Pipe", 64.1);
        System.out.println(pipe1);

        System.out.println(pipe.hashCode());
        System.out.println("Original: " + System.identityHashCode(pipe));

        System.out.println("Checking same locations...");
        boolean samePipe = pipe.equals(pipe1);
        System.out.println("Pipe is same as Pipe1: " + samePipe);
        System.out.println("*****************************************************************");

        Hose hose = new Hose(65, "Hose", 65.1);
        System.out.println(hose);

        Hose hose1 = new Hose(65, "Hose", 65.1);
        System.out.println(hose1);

        System.out.println(hose.hashCode());
        System.out.println("Original: " + System.identityHashCode(hose));

        System.out.println("Checking same locations...");
        boolean sameHose = hose.equals(hose1);
        System.out.println("Hose is same as Hose1: " + sameHose);
        System.out.println("*****************************************************************");

        Sprinkler sprinkler = new Sprinkler(66, "Sprinkler", 66.1);
        System.out.println(sprinkler);

        Sprinkler sprinkler1 = new Sprinkler(66, "Sprinkler", 66.1);
        System.out.println(sprinkler1);

        System.out.println(sprinkler.hashCode());
        System.out.println("Original: " + System.identityHashCode(sprinkler));

        System.out.println("Checking same locations...");
        boolean sameSprinkler = sprinkler.equals(sprinkler1);
        System.out.println("Sprinkler is same as Sprinkler1: " + sameSprinkler);
        System.out.println("*****************************************************************");

        Tank tank = new Tank(67, "Tank", 67.1);
        System.out.println(tank);

        Tank tank1 = new Tank(67, "Tank", 67.1);
        System.out.println(tank1);

        System.out.println(tank.hashCode());
        System.out.println("Original: " + System.identityHashCode(tank));

        System.out.println("Checking same locations...");
        boolean sameTank = tank.equals(tank1);
        System.out.println("Tank is same as Tank1: " + sameTank);
        System.out.println("*****************************************************************");

        Barrel barrel = new Barrel(68, "Barrel", 68.1);
        System.out.println(barrel);
        Barrel barrel1 = new Barrel(68, "Barrel", 68.1);
        System.out.println(barrel1);
        System.out.println(barrel.hashCode());
        System.out.println("Original: " + System.identityHashCode(barrel));

        System.out.println("Checking same locations...");
        boolean same3=adapter.equals(adapter2);
        System.out.println("Barrel is same as Barrel2");
        System.out.println("*****************************************************************");

        Bucket bucket = new Bucket(69, "Bucket", 69.1);
        System.out.println(bucket);

        Bucket bucket1 = new Bucket(69, "Bucket", 69.1);
        System.out.println(bucket1);

        System.out.println(bucket.hashCode());
        System.out.println("Original: " + System.identityHashCode(bucket));

        System.out.println("Checking same locations...");
        boolean sameBucket = bucket.equals(bucket1);
        System.out.println("Bucket is same as Bucket1: " + sameBucket);
        System.out.println("*****************************************************************");

        Mop mop = new Mop(70, "Mop", 70.1);
        System.out.println(mop);

        Mop mop1 = new Mop(70, "Mop", 70.1);
        System.out.println(mop1);

        System.out.println(mop.hashCode());
        System.out.println("Original: " + System.identityHashCode(mop));

        System.out.println("Checking same locations...");
        boolean sameMop = mop.equals(mop1);
        System.out.println("Mop is same as Mop1: " + sameMop);
        System.out.println("*****************************************************************");

        Vacuum vacuum = new Vacuum(71, "Vacuum", 71.1);
        System.out.println(vacuum);

        Vacuum vacuum1 = new Vacuum(71, "Vacuum", 71.1);
        System.out.println(vacuum1);

        System.out.println(vacuum.hashCode());
        System.out.println("Original: " + System.identityHashCode(vacuum));

        System.out.println("Checking same locations...");
        boolean sameVacuum = vacuum.equals(vacuum1);
        System.out.println("Vacuum is same as Vacuum1: " + sameVacuum);
        System.out.println("*****************************************************************");

        Broom broom = new Broom(72, "Broom", 72.1);
        System.out.println(broom);
        Broom broom1 = new Broom(72, "Broom", 72.1);
        System.out.println(broom1);
        System.out.println(broom.hashCode());
        System.out.println("Original: " + System.identityHashCode(broom));

        System.out.println("Checking same locations...");
        boolean same4=adapter.equals(adapter2);
        System.out.println("Broom is same as Broom1: "+same4);
        System.out.println("*****************************************************************");

        Dustpan dustpan = new Dustpan(73, "Dustpan", 73.1);
        System.out.println(dustpan);

        Dustpan dustpan1 = new Dustpan(73, "Dustpan", 73.1);
        System.out.println(dustpan1);
        System.out.println(dustpan.hashCode());
        System.out.println("Original: " + System.identityHashCode(dustpan));
        System.out.println("Checking for the locations.....");
        boolean sameDustpan=dustpan.equals(dustpan1);
        System.out.println("Dustpan sme as dustpan1: "+sameDustpan);
        System.out.println("*****************************************************************");

        Detergent detergent = new Detergent(74, "Detergent", 74.1);
        System.out.println(detergent);

        Detergent detergent1 = new Detergent(74, "Detergent", 74.1);
        System.out.println(detergent1);

        System.out.println(detergent.hashCode());
        System.out.println("Original: " + System.identityHashCode(detergent));

        System.out.println("Checking same locations...");
        boolean sameDetergent = detergent.equals(detergent1);
        System.out.println("Detergent is same as Detergent1: " + sameDetergent);
        System.out.println("*****************************************************************");

        Disinfectant disinfectant = new Disinfectant(75, "Disinfectant", 75.1);
        System.out.println(disinfectant);

        Disinfectant disinfectant1 = new Disinfectant(75, "Disinfectant", 75.1);
        System.out.println(disinfectant1);
        System.out.println(disinfectant.hashCode());
        System.out.println("Original: " + System.identityHashCode(disinfectant));

        System.out.println("Cheching same locations...");
        boolean sameDisinfectant=disinfectant.equals(disinfectant1);
        System.out.println("Disinfectant is same as Disinfectant1: "+sameDisinfectant);
        System.out.println("*****************************************************************");

        Bleach bleach = new Bleach(76, "Bleach", 76.1);
        System.out.println(bleach);
        Bleach bleach1 = new Bleach(76, "Bleach", 76.1);
        System.out.println(bleach1);

        System.out.println(bleach.hashCode());
        System.out.println("Original: " + System.identityHashCode(bleach));

        System.out.println("Checking same locations...");
        boolean same5=adapter.equals(adapter2);
        System.out.println("Bleach is same as Bleach1: "+same5);
        System.out.println("*****************************************************************");

        GlassesCase glassescase = new GlassesCase(77, "GlassesCase", 77.1);
        GlassesCase glassescase1 = new GlassesCase(77, "GlassesCase", 77.1);
        System.out.println(glassescase);
        System.out.println(glassescase1);
        System.out.println(glassescase.hashCode());
        System.out.println("Original: " + System.identityHashCode(glassescase));
        System.out.println("Checking same locations...");
        System.out.println("GlassesCase equals GlassesCase1: " + glassescase.equals(glassescase1));
        System.out.println("*****************************************************************");

        Sunglasses sunglasses = new Sunglasses(78, "Sunglasses", 78.1);
        Sunglasses sunglasses1 = new Sunglasses(78, "Sunglasses", 78.1);
        System.out.println(sunglasses);
        System.out.println(sunglasses1);
        System.out.println(sunglasses.hashCode());
        System.out.println("Original: " + System.identityHashCode(sunglasses));
        System.out.println("Checking same locations...");
        System.out.println("Sunglasses equals Sunglasses1: " + sunglasses.equals(sunglasses1));
        System.out.println("*****************************************************************");

        Umbrella umbrella = new Umbrella(79, "Umbrella", 79.1);
        Umbrella umbrella1 = new Umbrella(79, "Umbrella", 79.1);
        System.out.println(umbrella);
        System.out.println(umbrella1);
        System.out.println(umbrella.hashCode());
        System.out.println("Original: " + System.identityHashCode(umbrella));
        System.out.println("Checking same locations...");
        System.out.println("Umbrella equals Umbrella1: " + umbrella.equals(umbrella1));
        System.out.println("*****************************************************************");

        Raincoat raincoat = new Raincoat(80, "Raincoat", 80.1);
        Raincoat raincoat1 = new Raincoat(80, "Raincoat", 80.1);
        System.out.println(raincoat);
        System.out.println(raincoat1);
        System.out.println(raincoat.hashCode());
        System.out.println("Original: " + System.identityHashCode(raincoat));
        System.out.println("Checking same locations...");
        System.out.println("Raincoat equals Raincoat1: " + raincoat.equals(raincoat1));
        System.out.println("*****************************************************************");

        Thermos thermos = new Thermos(81, "Thermos", 81.1);
        Thermos thermos1 = new Thermos(81, "Thermos", 81.1);
        System.out.println(thermos);
        System.out.println(thermos1);
        System.out.println(thermos.hashCode());
        System.out.println("Original: " + System.identityHashCode(thermos));
        System.out.println("Checking same locations...");
        System.out.println("Thermos equals Thermos1: " + thermos.equals(thermos1));
        System.out.println("*****************************************************************");

        Lunchbox lunchbox = new Lunchbox(82, "Lunchbox", 82.1);
        Lunchbox lunchbox1 = new Lunchbox(82, "Lunchbox", 82.1);
        System.out.println(lunchbox);
        System.out.println(lunchbox1);
        System.out.println(lunchbox.hashCode());
        System.out.println("Original: " + System.identityHashCode(lunchbox));
        System.out.println("Checking same locations...");
        System.out.println("Lunchbox equals Lunchbox1: " + lunchbox.equals(lunchbox1));
        System.out.println("*****************************************************************");

        Cooler cooler = new Cooler(83, "Cooler", 83.1);
        System.out.println(cooler);

        Cooler cooler1 = new Cooler(83, "Cooler", 83.1);
        System.out.println(cooler1);
        System.out.println(cooler.hashCode());
        System.out.println("Original: " + System.identityHashCode(cooler));

        System.out.println("Checking same locations...");
        boolean sameCooler = cooler.equals(cooler1);
        System.out.println("Cooler is same as Cooler1: "+sameCooler);
        System.out.println("*****************************************************************");
        Spatula spatula = new Spatula(85, "Spatula", 85.1);
        Spatula spatula1 = new Spatula(85, "Spatula", 85.1);
        System.out.println(spatula);
        System.out.println(spatula1);
        System.out.println(spatula.hashCode());
        System.out.println("Original: " + System.identityHashCode(spatula));
        System.out.println("Checking same locations...");
        boolean sameSpatula = spatula.equals(spatula1);
        System.out.println("Spatula is same as Spatula1: " + sameSpatula);
        System.out.println("*****************************************************************");

        Whisk whisk = new Whisk(86, "Whisk", 86.1);
        Whisk whisk1 = new Whisk(86, "Whisk", 86.1);
        System.out.println(whisk);
        System.out.println(whisk1);
        System.out.println(whisk.hashCode());
        System.out.println("Original: " + System.identityHashCode(whisk));
        System.out.println("Checking same locations...");
        boolean sameWhisk = whisk.equals(whisk1);
        System.out.println("Whisk is same as Whisk1: " + sameWhisk);
        System.out.println("*****************************************************************");

        Strainer strainer = new Strainer(87, "Strainer", 87.1);
        Strainer strainer1 = new Strainer(87, "Strainer", 87.1);
        System.out.println(strainer);
        System.out.println(strainer1);
        System.out.println(strainer.hashCode());
        System.out.println("Original: " + System.identityHashCode(strainer));
        System.out.println("Checking same locations...");
        boolean sameStrainer = strainer.equals(strainer1);
        System.out.println("Strainer is same as Strainer1: " + sameStrainer);
        System.out.println("*****************************************************************");

        RollingPin rollingPin = new RollingPin(88, "RollingPin", 88.1);
        RollingPin rollingPin1 = new RollingPin(88, "RollingPin", 88.1);
        System.out.println(rollingPin);
        System.out.println(rollingPin1);
        System.out.println(rollingPin.hashCode());
        System.out.println("Original: " + System.identityHashCode(rollingPin));
        System.out.println("Checking same locations...");
        boolean sameRollingPin = rollingPin.equals(rollingPin1);
        System.out.println("RollingPin is same as RollingPin1: " + sameRollingPin);
        System.out.println("*****************************************************************");

        MeasuringCup measuringCup = new MeasuringCup(89, "MeasuringCup", 89.1);
        MeasuringCup measuringCup1 = new MeasuringCup(89, "MeasuringCup", 89.1);
        System.out.println(measuringCup);
        System.out.println(measuringCup1);
        System.out.println(measuringCup.hashCode());
        System.out.println("Original: " + System.identityHashCode(measuringCup));
        System.out.println("Checking same locations...");
        boolean sameMeasuringCup = measuringCup.equals(measuringCup1);
        System.out.println("MeasuringCup is same as MeasuringCup1: " + sameMeasuringCup);
        System.out.println("*****************************************************************");

        Tongs tongs = new Tongs(90, "Tongs", 90.1);
        Tongs tongs1 = new Tongs(90, "Tongs", 90.1);
        System.out.println(tongs);
        System.out.println(tongs1);
        System.out.println(tongs.hashCode());
        System.out.println("Original: " + System.identityHashCode(tongs));
        System.out.println("Checking same locations...");
        boolean sameTongs = tongs.equals(tongs1);
        System.out.println("Tongs is same as Tongs1: " + sameTongs);
        System.out.println("*****************************************************************");

        Tablet tablet = new Tablet(20, "Tablet", 20.1);
        Tablet tablet1 = new Tablet(20, "Tablet", 20.1);
        System.out.println(tablet);
        System.out.println(tablet1);
        System.out.println(tablet.hashCode());
        System.out.println("Original: " + System.identityHashCode(tablet));
        System.out.println("Checking same locations...");
        boolean sameTablet = tablet.equals(tablet1);
        System.out.println("Tablet is same as Tablet1: " + sameTablet);
        System.out.println("*****************************************************************");

        Telescope telescope = new Telescope(12, "Telescope", 12.1);
        Telescope telescope1 = new Telescope(12, "Telescope", 12.1);
        System.out.println(telescope);
        System.out.println(telescope1);
        System.out.println(telescope.hashCode());
        System.out.println("Original: " + System.identityHashCode(telescope));
        System.out.println("Checking same locations...");
        boolean sameTelescope = telescope.equals(telescope1);
        System.out.println("Telescope is same as Telescope1: " + sameTelescope);
        System.out.println("*****************************************************************");

        Thermometer thermometer = new Thermometer(14, "Thermometer", 14.1);
        Thermometer thermometer1 = new Thermometer(14, "Thermometer", 14.1);
        System.out.println(thermometer);
        System.out.println(thermometer1);
        System.out.println(thermometer.hashCode());
        System.out.println("Original: " + System.identityHashCode(thermometer));
        System.out.println("Checking same locations...");
        boolean sameThermometer = thermometer.equals(thermometer1);
        System.out.println("Thermometer is same as Thermometer1: " + sameThermometer);
        System.out.println("*****************************************************************");

        Trumpet trumpet = new Trumpet(5, "Trumpet", 5.1);
        Trumpet trumpet1 = new Trumpet(5, "Trumpet", 5.1);
        System.out.println(trumpet);
        System.out.println(trumpet1);
        System.out.println(trumpet.hashCode());
        System.out.println("Original: " + System.identityHashCode(trumpet));
        System.out.println("Checking same locations...");
        boolean sameTrumpet = trumpet.equals(trumpet1);
        System.out.println("Trumpet is same as Trumpet1: " + sameTrumpet);
        System.out.println("*****************************************************************");
        Trombone trombone = new Trombone(9, "Trombone", 9.1);
        Trombone trombone1 = new Trombone(9, "Trombone", 9.1);
        System.out.println(trombone);
        System.out.println(trombone1);
        System.out.println(trombone.hashCode());
        System.out.println("Original: " + System.identityHashCode(trombone));
        System.out.println("Checking same locations...");
        boolean sameTrombone = trombone.equals(trombone1);
        System.out.println("Trombone is same as Trombone1: " + sameTrombone);
        System.out.println("*****************************************************************");

        Transmitter transmitter = new Transmitter(24, "Transmitter", 24.1);
        Transmitter transmitter1 = new Transmitter(24, "Transmitter", 24.1);
        System.out.println(transmitter);
        System.out.println(transmitter1);
        System.out.println(transmitter.hashCode());
        System.out.println("Original: " + System.identityHashCode(transmitter));
        System.out.println("Checking same locations...");
        boolean sameTransmitter = transmitter.equals(transmitter1);
        System.out.println("Transmitter is same as Transmitter1: " + sameTransmitter);
        System.out.println("*****************************************************************");

        Violin violin = new Violin(6, "Low", 2.1);
        Violin violin1 = new Violin(6, "Low", 2.1);
        System.out.println(violin);
        System.out.println(violin1);
        System.out.println(violin.hashCode());
        System.out.println("Original: " + System.identityHashCode(violin));
        System.out.println("Checking same locations...");
        boolean sameViolin = violin.equals(violin1);
        System.out.println("Violin is same as Violin1: " + sameViolin);
        System.out.println("*****************************************************************");

        Wheelchair wheelchair = new Wheelchair(18, "Wheelchair", 18.1);
        Wheelchair wheelchair1 = new Wheelchair(18, "Wheelchair", 18.1);
        System.out.println(wheelchair);
        System.out.println(wheelchair1);
        System.out.println(wheelchair.hashCode());
        System.out.println("Original: " + System.identityHashCode(wheelchair));
        System.out.println("Checking same locations...");
        boolean sameWheelchair = wheelchair.equals(wheelchair1);
        System.out.println("Wheelchair is same as Wheelchair1: " + sameWheelchair);
        System.out.println("*****************************************************************");

        Whiteboard whiteboard = new Whiteboard(34, "Whiteboard", 34.1);
        Whiteboard whiteboard1 = new Whiteboard(34, "Whiteboard", 34.1);
        System.out.println(whiteboard);
        System.out.println(whiteboard1);
        System.out.println(whiteboard.hashCode());
        System.out.println("Original: " + System.identityHashCode(whiteboard));
        System.out.println("Checking same locations...");
        boolean sameWhiteboard = whiteboard.equals(whiteboard1);
        System.out.println("Whiteboard is same as Whiteboard1: " + sameWhiteboard);
        System.out.println("*****************************************************************");
  }
}