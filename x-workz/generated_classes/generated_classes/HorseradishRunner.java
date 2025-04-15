package generated_classes.generated_classes;

public class HorseradishRunner {
    public static void main(String[] args) {
        Horseradish horseradish1 = new Horseradish("15", "India", "Green");
        Horseradish horseradish2 = new Horseradish("15", "India", "Green");
        System.out.println(horseradish1.equals(horseradish2));
        System.out.println(horseradish1);
        System.out.println(horseradish2.hashCode());
    }
}