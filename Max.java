import java.util.Arrays;
public class Max {
    public static void main(String[] args) {
        int[] arr = {23, 45, 55, 56, 47, 88};
        System.out.println(Arrays.toString(arr));//To display the elements
        System.out.println(max(arr));

    }

    //Imagine that the array is not empty
    static int max(int[] arr) {
        if (arr.length ==0)
        {
            return -1;
        }
        int max = arr[0]; // Imagine the 0th element of the array is the maximum one
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                // if current element is >0
                 max= arr[i];
            }
        }
        return max;
    }
}




