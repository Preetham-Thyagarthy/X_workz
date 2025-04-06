//Program to find the second minimum element in an array
import java.util.Arrays;
public class SecondMin
{
    public static void main(String[] args) {
        int[]arr={36, 56, 78, 90, 34, 28};
        System.out.println(Arrays.toString(arr));
        SecondMin(arr);
    }
    static void SecondMin(int[]arr)
    {
        int size= arr.length;
        if(size<2)
        {
            System.out.println(" Invalid input");
            return;
        }
        Arrays.sort(arr);

            System.out.println(arr[1]);
            return;
    }
}
