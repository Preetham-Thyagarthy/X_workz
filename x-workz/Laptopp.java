// Class 1: Laptop
class Laptop {
    void turnOn() { System.out.println("Laptop is turning on..."); }
    void turnOff() { System.out.println("Laptop is shutting down..."); }
    void browse() { System.out.println("Browsing the internet..."); }
    void playGame() { System.out.println("Playing a game..."); }
    void code() { System.out.println("Writing code..."); }

    void externalMethods() {
        Lollipop l = new Lollipop();
        l.taste();
        l.unwrap();
        l.chew();
        l.buy();
        l.share();
    }
}

// Class 2: Lollipop
class Lollipop {
    void taste() { System.out.println("Tasting the sweet lollipop..."); }
    void unwrap() { System.out.println("Unwrapping the lollipop..."); }
    void chew() { System.out.println("Chewing the lollipop..."); }
    void buy() { System.out.println("Buying a lollipop..."); }
    void share() { System.out.println("Sharing the lollipop..."); }

    void externalMethods() {
        MNCCompany company = new MNCCompany();
        company.hireEmployee();
        company.launchProduct();
        company.conductMeeting();
        company.acquireCompany();
        company.fireEmployee();
    }
}

// Class 3: MNCCompany
class MNCCompany {
    void hireEmployee() { System.out.println("Hiring a new employee..."); }
    void launchProduct() { System.out.println("Launching a new product..."); }
    void conductMeeting() { System.out.println("Conducting a meeting..."); }
    void acquireCompany() { System.out.println("Acquiring another company..."); }
    void fireEmployee() { System.out.println("Firing an employee..."); }

    void externalMethods() {
        ICC icc = new ICC();
        icc.organizeTournament();
        icc.setRules();
        icc.handleDisputes();
        icc.conductMatch();
        icc.updateRankings();
    }
}

// Class 4: ICC
class ICC {
    void organizeTournament() { System.out.println("Organizing a tournament..."); }
    void setRules() { System.out.println("Setting cricket rules..."); }
    void handleDisputes() { System.out.println("Handling cricket disputes..."); }
    void conductMatch() { System.out.println("Conducting a match..."); }
    void updateRankings() { System.out.println("Updating cricket rankings..."); }

    void externalMethods() {
        RCB rcb = new RCB();
        rcb.playMatch();
        rcb.selectPlayers();
        rcb.practice();
        rcb.winTrophy();
        rcb.celebrate();
    }
}

// Class 5: RCB
class RCB {
    void playMatch() { System.out.println("RCB is playing a match..."); }
    void selectPlayers() { System.out.println("RCB is selecting players..."); }
    void practice() { System.out.println("RCB is practicing..."); }
    void winTrophy() { System.out.println("RCB wins the trophy!"); }
    void celebrate() { System.out.println("RCB is celebrating..."); }

    void externalMethods() {
        IplCup cup = new IplCup();
        cup.awardTrophy();
        cup.promoteEvent();
        cup.getSponsors();
        cup.increaseRevenue();
        cup.broadcastMatches();
    }
}

// Class 6: IplCup
class IplCup {
    void awardTrophy() { System.out.println("Awarding the IPL Trophy..."); }
    void promoteEvent() { System.out.println("Promoting IPL event..."); }
    void getSponsors() { System.out.println("Getting sponsors for IPL..."); }
    void increaseRevenue() { System.out.println("Increasing revenue for IPL..."); }
    void broadcastMatches() { System.out.println("Broadcasting IPL matches..."); }

    void externalMethods() {
        Globe globe = new Globe();
        globe.rotate();
        globe.showCountries();
        globe.zoomIn();
        globe.zoomOut();
        globe.spin();
    }
}

// Class 7: Globe
class Globe {
    void rotate() { System.out.println("The globe is rotating..."); }
    void showCountries() { System.out.println("Showing all countries..."); }
    void zoomIn() { System.out.println("Zooming into a specific region..."); }
    void zoomOut() { System.out.println("Zooming out for a global view..."); }
    void spin() { System.out.println("Spinning the globe..."); }

    void externalMethods() {
        Supra supra = new Supra();
        supra.accelerate();
        supra.brake();
        supra.drift();
        supra.refuel();
        supra.honk();
    }
}

// Class 8: Supra
class Supra {
    void accelerate() { System.out.println("Supra is accelerating..."); }
    void brake() { System.out.println("Supra is braking..."); }
    void drift() { System.out.println("Supra is drifting..."); }
    void refuel() { System.out.println("Refueling Supra..."); }
    void honk() { System.out.println("Supra is honking..."); }

    void externalMethods() {
        Icecream ice = new Icecream();
        ice.scoop();
        ice.melt();
        ice.freeze();
        ice.addToppings();
        ice.eat();
    }
}

// Class 9: Icecream
class Icecream {
    void scoop() { System.out.println("Scooping ice cream..."); }
    void melt() { System.out.println("Ice cream is melting..."); }
    void freeze() { System.out.println("Freezing ice cream..."); }
    void addToppings() { System.out.println("Adding toppings to ice cream..."); }
    void eat() { System.out.println("Eating ice cream..."); }

    void externalMethods() {
        Atom atom = new Atom();
        atom.split();
        atom.combine();
        atom.energize();
        atom.react();
        atom.neutralize();
    }
}

// Class 10: Atom
class Atom {
    void split() { System.out.println("Splitting an atom..."); }
    void combine() { System.out.println("Combining atoms..."); }
    void energize() { System.out.println("Energizing the atom..."); }
    void react() { System.out.println("The atom is reacting..."); }
    void neutralize() { System.out.println("Neutralizing the atom..."); }
}

// Main class to execute all methods
public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.turnOn();
        laptop.turnOff();
        laptop.browse();
        laptop.playGame();
        laptop.code();
        laptop.externalMethods(); // Calls methods from Lollipop

        Lollipop lollipop = new Lollipop();
        lollipop.externalMethods(); // Calls methods from MNCCompany

        MNCCompany company = new MNCCompany();
        company.externalMethods(); // Calls methods from ICC

        ICC icc = new ICC();
        icc.externalMethods(); // Calls methods from RCB

        RCB rcb = new RCB();
        rcb.externalMethods(); // Calls methods from IplCup

        IplCup cup = new IplCup();
        cup.externalMethods(); // Calls methods from Globe

        Globe globe = new Globe();
        globe.externalMethods(); // Calls methods from Supra

        Supra supra = new Supra();
        supra.externalMethods(); // Calls methods from Icecream

        Icecream icecream = new Icecream();
        icecream.externalMethods(); // Calls methods from Atom
    }
}