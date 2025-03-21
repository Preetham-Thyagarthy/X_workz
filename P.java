import java.util.Scanner;
public class P
{
    static int p(int[]arr, int key)
    {
     for( int i=0;i<arr.length; i++)
        {
          if( arr[i]==key)
          {
              return i;
          }
        }
     return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

     System.out.println(" Enter the no. elements in an array") ;
     int n=sc.nextInt();


     int []arr=new int[n];
        System.out.println(" Enter the array elements");
     for( int i=0;i<n;i++) {
         arr[i] = sc.nextInt();
     }

         System.out.println("Enter the key element");
         int key=sc.nextInt();

         int result= p(arr, key);

         if( result!=-1)
         {
             System.out.println("Element found at"+" "+ result);
         }
         else {
             System.out.println("Element not found");
         }
      sc.close();
    }
    }
