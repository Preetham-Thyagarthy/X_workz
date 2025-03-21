import java.util. Arrays;
class Colnotfound
{
    public static void main(String[] args) {
        int[][] arr= {
                { 2, 4, 5},
                {45, 68, 45, 87, 890},
                { 34, 56, 78, 56}

        } ;
        for( int row=0; row<arr.length; row++)
        {
            for( int col=0; col<arr[row].length; col++)
            {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println( );
        }
    }
}
