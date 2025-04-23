package com.xworkz.anu.prog;

public class Display {
    void run() {
        System.out.println("Displaying ads...");
    }
}

class Shop {
    void ads(Display display) {
        if (display != null) {
            display.run();
        } else {
            System.out.println("No display available.");
        }
    }
}
