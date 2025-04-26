package collectionUnderstnd;

import java.util.ArrayList;
import java.util.List;

public class ArrayVsCollection
{
    public static void main(String[] args)
    {

        // Using Array
        String [] array = new String[3];
        array[0]= "Selenium";
        array[1]= "Java";
        array[2]= "API Testing";

        System.out.println("Array Element");
        for (String tool: array)
        {
            System.out.println(tool);
        }

        // Using Collection
        List<String> collecrtion = new ArrayList<>();
        collecrtion.add("Selenium");
        collecrtion.add("Java");
        collecrtion.add("API Testing");
        collecrtion.add("Jenkings"); // dynamic wvalue



        System.out.println("Selection Element");
        for (String tool: collecrtion)
        {
            System.out.println(tool);
        }

    }
}
