package lambdaexpress;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    static List<Integer> filterOdds(List<Integer> myList, CheckNumber tester){

        List<Integer> filteredList  = new ArrayList<>();

        for (Integer n: myList){
            if (tester.test(n)) {
                filteredList.add(n);
            }
        }

        return filteredList;
    }




    public static void main(String[] args){

        List<Integer> numbers =  new ArrayList<>();

        for (int i = 0; i < 7; i++){
            numbers.add(i);
        }

        List<Integer> toPrintList = filterOdds(numbers, num -> ((num % 2) == 0));
        toPrintList.forEach(n -> System.out.println(n));
    }
}