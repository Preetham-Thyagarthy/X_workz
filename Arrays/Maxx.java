//Program to find the 2nd largest element in an array
import java.util.Arrays;
public class Maxx
{
    public static void main(String[] args) {
        int[] arr = {23, 45, 67, 89, 33, 23};
        max2(arr);
    }
    public static void max2(int arr[]) {
        int size = arr.length;
        if (size <= 2)
        {
            System.out.println(" Invalid input");
            return;
        }
        Arrays.sort(arr);
        System.out.println( arr[size-2]);
    }

}
