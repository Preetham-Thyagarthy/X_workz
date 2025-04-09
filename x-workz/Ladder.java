class Ladder {
    public static void climb(int height) {
        System.out.println("height " + height);  
    }

    public static void fold(int times) {
        System.out.println("times " + times);  
    }

    public static void extend(int length) {
        System.out.println("length " + length);  
    }

    public static void roll(int times, String color) {  
        System.out.println("times " + times + " color " + color);  
    }

    public static void adjustHeight(int newHeight, int weight) {
        System.out.println("newHeight " + newHeight + " weight " + weight);  
    }

    public static void moveLadder(int distance, String direction) {
        System.out.println("distance " + distance + " direction " + direction); 
    }

    public static void resizeLadder(double newHeight, boolean isFoldable, int steps) {
        System.out.println("newHeight " + newHeight + " isFoldable " + isFoldable + " steps " + steps);  
    }
}