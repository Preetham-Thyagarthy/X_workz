//To find the gcd of two numbers
public class GCD {
    public static void main(String[] args) {
        int num1=36;
        int num2=42;
        int gcd=Gcd(num1,num2);
        System.out.println("The GCD of:"+num1+"and" +num2+"is"+gcd);
    }
    public static int Gcd(int a, int b)
    {
     while(b!=0)
        {
         int temp=b;
         b=a%b;
         a=temp;

        }
     return a;
    }
}
