package generated_classes.generated_classes;

public class SnakeGourdRunner {
    public static void main(String[] args) {
        SnakeGourd snakegourd1 = new SnakeGourd("Winter", "March");
        SnakeGourd snakegourd2 = new SnakeGourd("Winter", "March");
        System.out.println(snakegourd1.equals(snakegourd2));
        System.out.println(snakegourd1);
        System.out.println(snakegourd2.hashCode());
    }
}