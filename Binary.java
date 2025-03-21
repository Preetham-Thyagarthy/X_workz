import java.util.Scanner;
class Binarysearch {
    static int binarySearch(int[] arr, int key)
    {
        int left = 0, right = arr.length - 1;// index
        while( left<=right)
        {
            int mid = left + (right - left) / 2; //to the find the index of the middle element

        if(arr[mid] == key)
            return mid; // Returns the index of the middle element

            if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
            return -1;
    }

    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter the size of the array  ");
        int n= in.nextInt();

        int[]arr= new int[n];

        System.out.println("Enter the sorted array elements");
        for( int i=0; i<n; i++)
        arr[i]=in.nextInt();

        System.out.println("Enter the key element need to be searched");
        int key= in.nextInt();

        int result= binarySearch(arr, key);

        if( result!=-1)
        {
            System.out.println(" Element found at position"+" "+ result);
        }
        else
        {
            System.out.println(" Element not found");
        }
        in.close();
    }

    }

