package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.clothing.Clothing;
import com.xworkz.inheritence.internal.clothing.Design;
import com.xworkz.inheritence.internal.clothing.TShirt;

public class ClothingRunner {
    public static void main(String[] args) {

        Clothing clothing = new Clothing();
        clothing.wear();
        clothing.material();
        clothing.size();
        clothing.brand();
        clothing.design();
        System.out.println("**************************************");
        Clothing clothing1 = new TShirt();
        clothing1.wear();
        clothing1.material();
        clothing1.size();
        clothing1.brand();
        clothing1.design();

        System.out.println("**************************************");

        TShirt tShirt = new TShirt();
        tShirt.wear();
        tShirt.material();
        tShirt.size();
        tShirt.brand();
        tShirt.design();

        System.out.println("************Casting example**************");
        Design design=new Design();
        design.display(clothing);
        design.display(clothing1);
        design.display(tShirt);

    }
}
