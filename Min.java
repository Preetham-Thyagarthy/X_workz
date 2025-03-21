import java.util.Arrays;
public class Min
{
    public static void main(String[] args)
    {
        int[] arr = {12, 0, 78, 34, 56, 78, 90};
        System.out.println(Arrays.toString(arr));
        System.out.println(min(arr));
    }
    static int min(int[] arr)
    {
        if (arr.length == 0)
        {
            return -1;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
}