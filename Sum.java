import java.util.Arrays;
public class Sum
{
    public static void main(String[] args) {
        int[]arr={ 12, 13, 14, 15};
        System.out.println(Arrays. toString(arr));
        sum(arr);
    }
    static void sum( int[]arr)
    {int summ=0;
        for( int suu : arr) {

            summ+= suu;
        }
        System.out.println("The sum is"+summ);
    }
}
