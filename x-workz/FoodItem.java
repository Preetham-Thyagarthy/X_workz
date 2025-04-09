class FoodItem {
    public static void prepare(String name) {
        System.out.println("Preparing " + name);  
    }

    public static void cook(int time) {
        System.out.println("Cooking for " + time + " minutes");  
    }

    public static void serve(String style) {
        System.out.println("Serving in " + style + " style");  
    }

    public static void addIngredients(int quantity, String ingredient) {  
        System.out.println("Adding " + quantity + " of " + ingredient);  
    }

    public static void store(String storageMethod, int temperature) {
        System.out.println("Storing with " + storageMethod + " at " + temperature + "°C");  
    }

    public static void adjustPortionSize(int newSize, boolean isVegetarian) {
        System.out.println("New portion size " + newSize + " with vegetarian option: " + isVegetarian);  
    }

    public static void garnish(String garnishType) {
        System.out.println("Garnishing with " + garnishType);  
    }
}