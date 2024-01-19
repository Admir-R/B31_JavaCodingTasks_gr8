package week10;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortMapByValue {

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("a", 4);
        map.put("b", 0);
        map.put("c", 1);
        map.put("d", 3);
        map.put("e", 5);
        map.put("f", 5);
        map.put("g", 2);

        System.out.println("Original map: "+ map);
        System.out.println("Sorted by value: "+ sortByValue(map));
    }


    public static Map<String, Integer> sortByValue(Map<String, Integer> map){

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

        for (int i = 0; i < entries.size(); i++) {
            for (int j = 0; j < entries.size() - 1; j++) {

                if(entries.get(j).getValue() > entries.get(j + 1).getValue()){
                   Map.Entry<String,Integer> temp = entries.get(j);
                   entries.set(j, entries.get(j + 1));
                   entries.set(j + 1 , temp);

                }
            }
        }

        Map<String, Integer> sortedMapByValue = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> eachEntry : entries) {
            sortedMapByValue.put(eachEntry.getKey(), eachEntry.getValue());
        }
        return sortedMapByValue;
    }

}
/*
Map - Sort the map by values
Write a method that can sort the Map by values
 */