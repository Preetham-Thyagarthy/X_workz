package com.xworkz.anu.prog;

public class Player {
        void play() {
            System.out.println("RCB is playing a match...");
        }
    }

    class RCB {
        void match(Player player) {
            if (player != null) {
                player.play();
            } else {
                System.out.println("No player available.");
            }
        }
    }

    class Planet {
        void explore() {
            System.out.println("Exploring the universe...");
        }
    }

    class Space {
        void travel(Planet planet) {
            if (planet != null) {
                planet.explore();
            } else {
                System.out.println("No planet available.");
            }
        }
    }

    class Engine {
        void ignite() {
            System.out.println("Rocket engine ignited...");
        }
    }

    class Rocket {
        void launch(Engine engine) {
            if (engine != null) {
                engine.ignite();
            } else {
                System.out.println("No engine available.");
            }
        }
    }

    class Medicine {
        void consume() {
            System.out.println("Taking Dolo 650...");
        }
    }

    class Dolo650 {
        void take(Medicine medicine) {
            if (medicine != null) {
                medicine.consume();
            } else {
                System.out.println("No medicine available.");
            }
        }
    }

    class Haircut {
        void trim() {
            System.out.println("Haircut in progress...");
        }
    }

    class Barber {
        void cut(Haircut haircut) {
            if (haircut != null) {
                haircut.trim();
            } else {
                System.out.println("No haircut available.");
            }
        }
    }

    class Lens {
        void capture() {
            System.out.println("Camera is capturing...");
        }
    }

    class Camera {
        void click(Lens lens) {
            if (lens != null) {
                lens.capture();
            } else {
                System.out.println("No lens available.");
            }
        }
    }

    class Fruit {
        void eat() {
            System.out.println("Eating mango...");
        }
    }

    class Mango {
        void taste(Fruit fruit) {
            if (fruit != null) {
                fruit.eat();
            } else {
                System.out.println("No mango available.");
            }
        }
    }

    class Cushion {
        void rest() {
            System.out.println("Relaxing on the pillow...");
        }
    }

    class Pillow {
        void sleep(Cushion cushion) {
            if (cushion != null) {
                cushion.rest();
            } else {
                System.out.println("No pillow available.");
            }
        }
    }

