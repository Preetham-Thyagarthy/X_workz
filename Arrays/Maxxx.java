//Program to find the second largest element in an Array if the duplicate is present
import java.util.Arrays;
public class Maxxx
{
    public static void main(String[] args) {
        int arr[]={ 1, 4, 5,7, 35,35};
        SecondLargest(arr);
    }
    static void SecondLargest( int[]arr)
    {
        Arrays.sort(arr);
     int size=arr.length;
     if(size<2)
     {
         System.out.println("Invalid input");
         return;
     }
     for(int i=size-2; i>=0; i--)
     {
         if(arr[i]!=arr[size-1])
         {
             System.out.println("The second largest element is"+arr[i]);
             return;
         }
     }
        System.out.println("There is no second largest element in an Array");
    }
}
