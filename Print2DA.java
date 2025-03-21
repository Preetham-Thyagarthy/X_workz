
import java.util.Arrays;
public class Print2DA {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 45, 67},
                {34, 56, 78, 99},
                {45, 67, 89, 67, 46}
        };
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }
    }
}
