// Multi Dimension arraylist
import java.util.Scanner;
import java.util.ArrayList;
public class MultiAL
{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        //Declaration
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();

        //Initialisation
        for( int i=0; i<3; i++)                 //If you dont initalise and try to add new elements it will gives you an error
        {
            list.add(new ArrayList<>());
        }

        //Add new elements
        for(int i=0;i<3;i++)
        {
            for( int j=0;j<3;j++)
            {
              list.get(i).add( in.nextInt());
            }
        }
        System.out.println(list);

    }
}
