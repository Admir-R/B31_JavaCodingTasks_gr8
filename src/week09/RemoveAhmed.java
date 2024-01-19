package week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAhmed {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Admir","Adora"));
        System.out.println(removeName(names));
        System.out.println(removeName2(names));
    }

    public static List<String> removeName(List<String> names){

        Iterator iterator = names.iterator();

        while (iterator.hasNext()){
            if(iterator.next().equals("Ahmed")){
                iterator.remove();
            }
        }
        return names;
    }

    public static List<String> removeName2(List<String> names){
        names.removeIf(p-> p.equals("Ahmed"));
        return names;
    }

    }
/*
2) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */