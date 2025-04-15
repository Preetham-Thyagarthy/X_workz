package generated_classes.generated_classes;

public class CeleryRunner {
    public static void main(String[] args) {
        Celery celery1 = new Celery("Mild", "15", "March");
        Celery celery2 = new Celery("Mild", "15", "March");
        System.out.println(celery1.equals(celery2));
        System.out.println(celery1);
        System.out.println(celery2.hashCode());
    }
}