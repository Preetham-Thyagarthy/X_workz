import java.util.Scanner;
public class LinearSearch
{
    static int linearSearch( int[]arr, int key)
    {
       for( int i=0; i<arr.length; i++)
       {
           if(arr[i]== key)
           {
               return i;
           }
       }

     return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array length");
        int n=sc.nextInt();

        int arr[]= new int[n];

        System.out.println("Enter the array elements");
        for( int i=0; i<n; i++)
        arr[i]= sc.nextInt();

        System.out.println("Enter the  key element to be searched");
        int key= sc.nextInt();

        int result=linearSearch( arr,key);

          if( result!=-1)
          {
              System.out.println("Element found at index"+ result);
        }
          else
          {
              System.out.println("element not found in the array");
          }

       sc.close();
    }
}
