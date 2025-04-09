class Paper {
    public static void cut(String shape) {
        System.out.println("Cutting into " + shape + " shape");  
    }

    public static void fold(int times) {
        System.out.println("Folding " + times + " times");  
    }

    public static void write(String content) {
        System.out.println("Writing: " + content);  
    }

    public static void recycle(int weight, String material) {  
        System.out.println("Recycling " + weight + "kg of " + material);  
    }

    public static void store(String storageMethod, int temperature) {
        System.out.println("Storing with " + storageMethod + " at " + temperature + "°C");  
    }

    public static void adjustSize(int newSize, boolean isColored) {
        System.out.println("New size " + newSize + " with colored option: " + isColored);  
    }

    public static void decorate(String decorationType) {
        System.out.println("Decorating with " + decorationType); 
    }
}