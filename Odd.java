import java.util.Scanner;
public class Odd
{
    public static void main(String[] args)
    {
        int odd=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n=in.nextInt();

        int arr[]= new int[n];
        System.out.println(" Enter the" + " "+ n +" " + "Elements of an array");
        for( int i=0; i< n; i++)
        {
           arr[i]= in.nextInt();
        }
        for(int i=0; i<n; i++) {
            if ((arr[i] % 2) != 0)
                odd += arr[i];

        }
            System.out.print("The added odd elements of an array is"+" "+odd);
            in.close();
        }

}
