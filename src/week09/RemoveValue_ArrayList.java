package week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveValue_ArrayList {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 85, 50, 100, 101, 200, 300, 1000, -100));

        System.out.println(removeMoreThan100(numbers));
    }


    public static List<Integer> removeMoreThan100(List<Integer> numbers){

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()){
            if(iterator.next() > 100){
                iterator.remove();
            }
        }
        return numbers;
    }
}
/*
3) ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100
 */