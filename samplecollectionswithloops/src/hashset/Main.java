package hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Collections;

public class Main{


    public static void main(String[] args){

        Set<String> h =  new HashSet<>();

        h.add("Lehi");
        h.add("Seattle");
        h.add("San Francisco");
        h.add("Austin");
        h.add("Denver");
        h.add("Raleight");
        h.add("New York City");
        h.add("Austin");

        System.out.println("\n*** The HashSet ***");
        System.out.println(h);

        System.out.println("\nHashSEt contains Raleight or not: " + h.contains("Raleigh"));

        System.out.println("\nSize of the HashSet: " + h.size());

        h.remove("Seattle");
        h.remove("Portland");
        System.out.println("\nHashSet with one Removed");

        Iterator<String> i = h.iterator();

        while (i.hasNext()){

            String temp = i.next();
            System.out.println(temp);
        }

        List<String> hlist = new ArrayList<>(h);
        System.out.println("\nThe Sorted HashSet");
        Collections.sort(hlist);
        System.out.println(hlist);

        h.clear();
        System.out.println("\nthe HashSet Cleared");
        System.out.println(h);
    }
}