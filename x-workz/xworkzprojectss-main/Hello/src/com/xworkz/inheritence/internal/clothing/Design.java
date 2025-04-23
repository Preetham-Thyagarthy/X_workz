package com.xworkz.inheritence.internal.clothing;

public class Design {
    public void display(Clothing clothing) {
        clothing.wear();
        clothing.material();
        clothing.size();
        clothing.brand();
        clothing.design();

        if (clothing instanceof TShirt) {
            System.out.println("Clothing is an instance of TShirt");
            TShirt tshirt = (TShirt) clothing;
            tshirt.color();
        }
    }
}
