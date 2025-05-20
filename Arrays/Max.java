//Program to find the Maximum element in an Array
import java.util.Arrays;
public class Max {
    public static void main(String[] args)
    {
        int[] arr = {34, 35, 67, 89, 345};
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
    }

        public static int max(int[]arr) {
            if (arr.length == 0) {
                return -1;
            }
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
         return max;
        }
}
