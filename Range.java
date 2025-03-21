import java.util.Arrays;
public class Range
{
    public static void main(String[] args)
    {
        int[]arr={ 23, 56, 78, 90, 67, 34};
        System.out.println(Arrays.toString(arr));
        System.out.println(range(arr, 0, 2));

    }
    static int range(int[]arr, int start, int end)
    {

        if( end> start)
        {
            return -1;
        }
       if( arr == null)
       {
           return -1;
       }


        int rmax= arr[start];
        for(int i=start; i<=end; i++)
        {
         if( arr[i]> rmax)
         {
             rmax= arr[i];
         }
        }
        return rmax;
    }
}
