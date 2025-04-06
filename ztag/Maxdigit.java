//Program to Reverse an Array
import java.util.Arrays;
import java.util.Collections;
public class Reverse
{
    public static void main(String[] args)
    {
     Integer[]digit={34, 56, 78, 99};
     Arrays.sort(digit, Collections.reverseOrder());
     StringBuilder largestNumber= new StringBuilder();
     for( int digits:digit) {
         largestNumber.append(digits);
     }
        System.out.println("The largest digit"+" "+largestNumber);
    }
}
