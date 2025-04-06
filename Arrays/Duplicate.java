//Program to find the dupliacate element in an array
public class Duplicate
{
    public static void main(String[] args) {
        int[]arr={23, 45, 67, 89, 23 };
        for( int i=0; i<arr.length; i++)
        {
            for( int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i]);
                    break;
                }
            }
        }

    }
}
