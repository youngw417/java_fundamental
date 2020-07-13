package hashmap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main{

    public static void main(String[] args){

        Map<String, Integer> cities = new HashMap<>();

        cities.put("Lehi", 62712);
        cities.put("Seattle", 72745);
        cities.put("San Frncisco", 884363);
        cities.put("Austin", 1000000);
        cities.put("Denver", 619968);
        cities.put("Rleight", 464758);
        cities.put("New York City", 862300);

        cities.put("Austin", 950715);

        System.out.println("\n*** The HashMap ***");
        System.out.println(cities);

        System.out.println("\nHashMap contains Raleigh as a key: " + cities.containsKey("Raleigh"));
        System.out.println("HashMap contains the value 1000000: " + cities.containsValue(1000000));
        System.out.println("\nsize of the HashMap is " + cities.size());

        cities.remove("Seattle");
        cities.remove("Potland");
        System.out.println("\nHashMap with one Removed");

        for (HashMap.Entry mapElem: cities.entrySet()){

            System.out.print("key is " + mapElem.getKey());
            System.out.println("   Value is " + mapElem.getValue());
        }
            List<HashMap.Entry> myList = new ArrayList<>(cities.entrySet());
            myList.sort(Comparator.comparing(o -> o.getKey().toString()));

            System.out.println("\nSorted by Key");
            System.out.println(myList);

            myList.sort(Comparator.comparing( o -> (int) o.getValue(), Comparator.reverseOrder()));

            System.out.println("\nSort by Value");
            System.out.println(myList);

            myList.clear();
            System.out.println("\nThe HashMap Cleard");
            System.out.println(myList);
        
    }
}