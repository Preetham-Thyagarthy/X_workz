//Program to find the sum of an Array
public class Sum
{
    public static void main(String[] args) {
        int[]arr={ 23, 45, 3, 4};
        int sum=0;
        for( int a: arr)
        {
            sum+=a;
        }
        System.out.println(sum);
    }
}
