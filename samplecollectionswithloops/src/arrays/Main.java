package arrays;

import java.util.Random;
import java.util.Collections;
import java.util.Arrays;


public class Main{

    public static void main(String[] args){

        Random rand = new Random();
        System.out.println("*** Array Example ***");
        
        int[] ournums =  new int[7];

        for (int i = 0; i < 5; i++) {
            ournums[i] = rand.nextInt(10);
        }

        System.out.println("The third element of the array is " + ournums[2]);
        System.out.println();
        System.out.println("Print using a for each loop");

        for (int arrEach: ournums){
            System.out.println("Item: " + arrEach);
        }
        System.out.println();
        System.out.println("Print using a regular loop");
        for (int i = 0; i < ournums.length; i++){
            System.out.println("Array Element " + i + " = " + ournums[i]);
        }

        System.out.println();
        System.out.println("*** Another Way Example ***");

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars.length);

        cars[1] = "Honda";
        System.out.println(cars);
        System.out.println("Before sort Element index 2 " + cars[2]);

        Arrays.sort(cars);
        System.out.println("After sort Element index 2 " + cars[2]);
        Arrays.sort(cars, Collections.reverseOrder());
        System.out.println();
        System.out.println("Array in descending order");

        System.out.println(Arrays.toString(cars));

    }
}