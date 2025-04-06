//Program to check if the array is sorted
public class Sort
{
    public static void main(String[] args) {
        int[]arr={10, 20, 30, 40, 50};
        boolean isBoolean=true;
        for(int i=0; i<arr.length-1; i++)//beacause the array need to be traversed till one but last
        {
            if(arr[i]>arr[i+1])
            {
              isBoolean=false;
              break;
            }
        }
        if(isBoolean)
        {
            System.out.println("The array is sorted or in ascending order");
        }
        else {
            System.out.println(" The array is not sorted");
        }
    }
}
