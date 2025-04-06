//Program to find the minimum element in an array
import java.util.Arrays;
public class Min
{
    public static void main(String[] args) {
        int[]arr={ 34, 67, 89,90};
        System.out.println(Arrays.toString(arr));
        min(arr);
    }
    public static int min( int[]arr)
    {
        if (arr.length == 0) {
            return -1;
        }
     int min=arr[0];
     for(int i=1;i<arr.length; i++)
     {
         if(arr[i]<min)
         {
             min=arr[i];
         }
     }
        System.out.println("The minimum element is"+" "+min);
     return min;
    }
}
