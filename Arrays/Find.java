//To find the missing element in an array
public class Find
{
    public static void main(String[] args) {
        int[]arr={1,2,3,4,6,7};
        int missing=Findmissing(arr);
        System.out.println("The missing element is:"+missing);
    }
    public static int Findmissing(int[]arr)
    {
        int n=arr.length;
        int total= (n+1)*(n+2)/2;
        int sum=0;
        for(int num:arr)
        {
            sum+=num;
        }
        return total-sum;
    }
}
