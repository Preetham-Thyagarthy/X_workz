//Program to find the second minimum element in an array if the duplicate elements are present
import java.util.Arrays;
public class SecondMinn
{
    public static void main(String[] args) {
        int[]arr={ 45, 57, 56, 34, 45};
        System.out.println(Arrays.toString(arr));
        SecondMinn(arr);
    }
    static void SecondMinn( int[]arr)
    {
     int size=arr.length;
     if(size<2)
     {
         System.out.println(" Invalid input");
         return;
     }
     Arrays.sort(arr);
     for( int i=1; i<size-1; i++)
     {
         if(arr[i]!=arr[0])
         {
             System.out.println("The second smallest element is"+arr[i]);
             return;
         }
     }
        System.out.println("No second smallest element found");
     return;

    }
}
