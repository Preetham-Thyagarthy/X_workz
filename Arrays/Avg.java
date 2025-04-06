import java.util.Scanner;
public class Avg
{
    public static void main(String[] args) {
        int arr[]={23, 23, 23, 23};
        int n=arr.length;
        int sum=0;
        for( int a: arr)
            sum+=a;
        double avg=(sum/n);
        System.out.println(" The average is"+avg);
    }
}
