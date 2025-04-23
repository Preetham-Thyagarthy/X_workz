package com.xworkz.anu.prog;

import com.xworkz.Access.Instancemethods;

public class DisplayRunner {
        public static void main(String[] args) {
            Shop shop = new Shop();
            Display display = new Display();

            shop.ads(display); // Valid case
            shop.ads(null); // Null case
            Instancemethods obj=new Instancemethods();
            obj.printage();
        }
    }
