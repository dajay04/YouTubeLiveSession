package collectionUnderstnd;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest
{
    public static void main(String[] args)
    {
        LinkedList<String> students = new LinkedList<>();

        // 1. Adding elements
        students.add("Ajay");
        students.add("Ravi");
        students.add("Simran");
        students.add("Pooja");
        System.out.println("After adding: " + students);

        // 2. Updating elements
        students.set(1, "Rahul");  // Update index 1
        System.out.println("After updating index 1: " + students);

        // 3. Removing elements
        students.remove("Pooja");      // Remove by value
        students.remove(0);           // Remove by index
        System.out.println("After removals: " + students);

        // 4. Iterating over elements
        System.out.println("Iterating using Iterator:");
        Iterator<String> itr = students.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 5. To Array
        Object[] arr = students.toArray();
        System.out.println("Array from LinkedList:");
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // 6. Size of LinkedList
        System.out.println("Size of LinkedList: " + students.size());

        // 7. removeFirst()
        if (!students.isEmpty()) {
            String removedFirst = students.removeFirst();
            System.out.println("Removed First: " + removedFirst);
        }

        // 8. removeLast()
        if (!students.isEmpty()) {
            String removedLast = students.removeLast();
            System.out.println("Removed Last: " + removedLast);
        }

        // Final List
        System.out.println("Final LinkedList: " + students);
    }
}
