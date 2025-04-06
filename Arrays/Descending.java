import java.util.Arrays;
public class Descending
{
    public static void main(String[] args) {


        int[] arr = {32, 45, 11, 12, 34, 56, 110};
        Arrays.sort(arr);
        System.out.println("The descending order is");
        for(int i=arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
