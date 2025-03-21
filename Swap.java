//Program to swap two arrays

import java.util.Arrays;
public class Swap
{
    public static void main(String[] args)
    {
        // Declaration and Initialsisation of an Array
        int[]arr= { 23, 45, 67, 88, 78};// To display the elements
        swap( arr, 0, 1); // If we give index value which is not there which gives you an  index out of Bound expection error

        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr, int index1, int index2 )
    {
       int temp= arr[index1];
       arr[index1]= arr[index2];
       arr[index2]= temp;
    }
}
