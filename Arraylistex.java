import java.util.ArrayList;
 public class Arraylistex
{
    public static void main(String[] args)
    {

        // Here we will mention the wrapper class like <Integer> not the datatypes like int

        ArrayList<Integer> list = new ArrayList<Integer>(10); // Not necessary to specify the size
                         //reference name
        //list is the reference variable
        list.add(10);
        list.add(30);
        list.add(10);
        list.add(30);
        list.add(10);
        list.add(30);
        list.add(10);
        list.add(30);
        list.add(10);
        list.add(30);
        list.add(10);
        list.add(30);
        list.add(10);
        list.add(30);
        list.add(10);
        list.add(30);
        list.add(10);
        list.add(30);
        list.add(10);
        list.add(30);


        System.out.println(list.contains(30));// Returns true or false whether the given list contains value or not

        System.out.println(list.set(0,99)); // It sets the zeroth index to 99

        System.out.println(list.remove(7)); //It removes the value which is there in the index no. 7

        System.out.println(list);
    }
}