class Beer {
    public static void brew(String type) {
        System.out.println("Brewing " + type + " beer");  
    }

    public static void serve(int temperature) {
        System.out.println("Serving at " + temperature + "°C"); 
    }

    public static void drink(String glassType) {
        System.out.println("Drinking from a " + glassType + " glass");
    }

    public static void store(String storageMethod, int temperature) {
        System.out.println("Storing with " + storageMethod + " at " + temperature + "°C");  
    }

    public static void adjustFlavor(int bitterness, boolean isAlcoholic) {
        System.out.println("Adjusting flavor with bitterness level " + bitterness + " and alcoholic option: " + isAlcoholic);  
    }

    public static void pairWithFood(String foodType) {
        System.out.println("Pairing with " + foodType);  
    }

    public static void label(String labelType) {
        System.out.println("Labeling with " + labelType + " label");  
    }
}