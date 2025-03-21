public class Avg
{
    public static void main(String[] args) {
        int[]arr={23, 45, 54, 34, 22};
        int sum=0;
        for( int a: arr)
        {
          sum+=a;
        }
        double average= (double)sum/arr.length;
        System.out.println("Average is"+ average );
    }
}
