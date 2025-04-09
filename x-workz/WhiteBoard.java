class WhiteBoard {
    public static void write(String content) {
        System.out.println("Writing: " + content);  
    }

    public static void erase(String area) {
        System.out.println("Erasing " + area);  
    }

    public static void clean() {
        System.out.println("Cleaning the whiteboard"); 
    }

    public static void draw(String shape) {
        System.out.println("Drawing a " + shape); 
    }

    public static void resize(int newSize) {
        System.out.println("Resizing the whiteboard to " + newSize + " inches");  
    }

    public static void store(String storageMethod) {
        System.out.println("Storing the whiteboard with " + storageMethod);  
    }

    public static void mount(String location) {
        System.out.println("Mounting the whiteboard at " + location);  
    }
}