import java.util.*;

public class MyMain {
    public static void main(String[] args) {
        // ArrayList -> array
        // LinkedList -> связанный список
        // ArrayDeque
        // Synchronization

        // difference
        // List myList = new ArrayList(); -> only methods and references from
        // the list Interface

        // ArrayList myList = new ArrayList(); // ArrayList + List

        // Iterator

        //------------------------------------------------------------------------------------------------------------

        // ArrayList
        // add
        // remove
        // set
        // Collections.sort()
        // get()
        // clear()
        // size()
        // contains
        // capacity()
        // Arrays.asList
        ArrayList <String> names = new ArrayList<>();

        ArrayList <String> names2 = new ArrayList<>(Arrays.asList("Archil", "Ilona", "Kirill", "Sergey")); // List + ArrayList

        for (int index = 0; index < names2.size(); index++)
        {
            names2.get(index);
        }

        for (String name : names2)
        {
            System.out.println(name);
        }

        names2.add(0, "Igor");

        System.out.println("\n" + names2.get(0));

        List<String> listName = new ArrayList<String>(); // List -> child

        System.out.println("-----------------------------------------------");

        Iterator name = names2.iterator();

        while (name.hasNext())
        {
            System.out.println(name.next());
        }

        //-------------------------------------------------------------------------------------------------------------

        // LinkedList

        // add
        // addFirst
        // addLast
        // clear
        // contains
        // element()
        // getFirst()
        // getLast()
        // offerFirst()
        // offerLast()
        // poll() - retrieves and removes first element
        // pollFirst() - retreives ahd removes first element, or null
        // pollLast

        LinkedList<String> namesLinked = new LinkedList<>(Arrays.asList("Link1", "Link2"));

        System.out.println("\n" + namesLinked.get(1));

        String polledValue = namesLinked.poll();
        System.out.println(polledValue);

        //-------------------------------------------------------------------------------------------------------------

        // ArrayDeque
        // Очередь с обоих сторон
        // resizable array
        // efficiency
        // resizable
        // lightweight
        // not synchronized
        // has maximum capacity
        ArrayDeque <Integer> numbers = new ArrayDeque<Integer>();
        numbers.add(100);
    }
}
