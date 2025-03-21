import java.util.Scanner;
import java.util.Arrays;
public class MDArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[][] ={ {3, 4, 5, 6},
        { 34, 56, 78, 78},
        { 45, 89, 0, 67, 56}
    };
//        System.out.println(arr.length);
 //      arr= new int[][]
//                {
//                        { 23, 45, 67},//0
//                        {45, 67, 88, 97},//1
//                        { 56, 78, 89, 56, 45},//2
//                        { 34, 56, 78, 898}  //3                }
//
//                };
//        System.out.println( Arrays. toString(arr));
        //To  get the input
        for (int row = 0; row < arr.length; row++)
        {
            //for each column in every row
            for (int col = 0; col < arr[row].length; col++)
            {
                arr[row][col] = s.nextInt();
            }
        }
 //To get the output
        for (int row = 0; row < arr.length; row++) {
            //for each row in every column
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col] + " ");
            }
        }
        System.out.println();
        for( int a[]: arr)
        {
            System.out.println(Arrays. toString(a));
        }

    }
}
