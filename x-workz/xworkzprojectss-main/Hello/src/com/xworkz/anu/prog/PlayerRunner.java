package com.xworkz.anu.prog;

public class PlayerRunner {
        public static void main(String[] args){
            RCB rcb = new RCB();
            Player player = new Player();
            rcb.match(player);
            rcb.match(null);

            Space space = new Space();
            Planet planet = new Planet();
            space.travel(planet);
            space.travel(null);

            Rocket rocket = new Rocket();
            Engine engine = new Engine();
            rocket.launch(engine);
            rocket.launch(null);

            Dolo650 dolo = new Dolo650();
            Medicine medicine = new Medicine();
            dolo.take(medicine);
            dolo.take(null);

            Barber barber = new Barber();
            Haircut haircut = new Haircut();
            barber.cut(haircut);
            barber.cut(null);

            Camera camera = new Camera();
            Lens lens = new Lens();
            camera.click(lens);
            camera.click(null);

            Mango mango = new Mango();
            Fruit fruit = new Fruit();
            mango.taste(fruit);
            mango.taste(null);

            Pillow pillow = new Pillow();
            Cushion cushion = new Cushion();
            pillow.sleep(cushion);
            pillow.sleep(null);
        }
    }

