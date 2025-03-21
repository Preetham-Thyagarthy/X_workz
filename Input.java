//To get the input
import java.util.ArrayList;
import java.util.Scanner;
public class Input
{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        ArrayList<Integer>list= new ArrayList <Integer>();

        //input
        for( int i=0; i<5; i++)
        {
            list.add(in.nextInt());
        }

        //get any index
        for( int i=0; i<5; i++)
        {

            System.out.println(list.get(i)); // Pass index here because list[index] will not work here

        }
        System.out.println(list);
    }
}
