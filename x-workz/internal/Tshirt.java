package internal;

public class Tshirt {
    String brand;
    String color;
    int size;

    @override
    public boolean equals(Object obj)
    {
        if (obj != null) {
            Tshirt tshirt1 = this;
            Tshirt tshirt2 = (Tshirt) obj;//Casting

            if (tshirt1.brand.equals(tshirt2.brand) && tshirt1.color.equals(tshirt2.color) && tshirt1.size == tshirt2.size) {
                System.out.println("Both the tshirt are same");
                return true;

            }

        }
        public static void main (String[]args)
        {
            Tshirt tshirt1 = new Tshirt();
            tshirt1.brand = "Puma";
            tshirt1.color = "Black";
            tshirt1.size = 28;

            Tshirt tshirt2 = new Tshirt();
            tshirt2.brand = "Puma";
            tshirt2.color = "Black";
            tshirt2.size = 28;


        }
    }
    }
}


