package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<String> cities =  new ArrayList<>();

        cities.add("Lehi");
        cities.add("Seattle");
        cities.add("San Francisco");
        cities.add("Austin");
        cities.add("Denver");
        cities.add("raleigh");
        cities.add("New York City");
        cities.add("Austin");

        System.out.println("\n*** The ArrayList ***");
        System.out.println(cities);

        System.out.println("The element at index 0 is " + cities.get(0) );

        // System.out.println("The element at index 100 is " + cities.get(100));
        System.out.println();
        System.out.println("The ArrayList contains \"New York City\": " + cities.contains("New York City"));
        System.out.println("The ArrayList contains\"Portland\": " + cities.contains("Portland"));
        System.out.println("\nReplacing element at index 3");
        System.out.println("Original element at index 3: " + cities.get(3));
        cities.set(3, "Portland");
        System.out.println("Replaced element \"Portland\" at index3: " + cities.get(3));

        System.out.println("\nBefore adding elent at index 3");
        System.out.println(cities);
        cities.add(3, "Austin");
        System.out.println("After adding \"Austin\" element at index3");
        System.out.println(cities);

        cities.remove(3);
        System.out.println("\nRemoved index 3 so the first \"Austin\"");

        for (String c: cities){
            System.out.println(c);

        }

        System.out.println("\nSize of the ArrayList is " + cities.size());


        for (int i = 0; i < cities.size(); i++){
            System.out.println("Index: " + i + " Value: " + cities.get(i));
        }

        System.out.println("\nSort in Alphabetical Order");
        Collections.sort(cities);
        for (int i = 0; i < cities.size(); i++){
            System.out.println("Index: " + " Value: " + cities.get(i));

        }

        System.out.println("\nSort in Reverse Alhpabetical Order");
        Collections.sort(cities, Comparator.reverseOrder());
        for (int i = 0; i < cities.size(); i++){
            System.out.println("Index: " + " Value: " + cities.get(i));

        }

        System.out.println("\nThe empty ArrayList");
        cities.clear();
        System.out.println(cities);

    }
}