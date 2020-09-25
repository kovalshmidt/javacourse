package lesson_6;

import java.util.*;
import java.util.stream.Collectors;

public class Maps {

    public static void main(String[] args) {


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Andry");
        map.put(2, "Martin");
        map.put(3, "Vitaliy");
        map.put(4, "Bob");
        map.put(5, "Elena");
        map.put(6, "Kate");

        String elena = map.get(6);
//        System.out.println(elena);

        HashMap<String, List<String>> cities = new HashMap<>();
        cities.put("Germany", Arrays.asList("Berlin", "Munchen", "Frankfurt"));
        cities.put("Ukraine", Arrays.asList("Lviv", "Kyiv", "Harkiv"));
        cities.put("Italy", Arrays.asList("Rome", "Venice", "Milan"));

        // Map<String, List<String>
        // Entry<String, List<String>
        // Set<Entry<String, List<String>>
        for (Map.Entry<String, List<String>> entry : cities.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }

        Map<HighSchoolStudent, Integer> mapsdf = new HashMap<>();

        //Set, List, Queue [v] [v] [v] [v] [v] [v] [v] ....
        //Map              [k[v]] [k[v]] [k[v]] [k[v]] ....
        //Set of Entries   [entry[k, v]] [entry[k, v]] [entry[k, v]] ....


        List<Integer> list = Arrays.asList(1, 5, 3, 6, 2, 7, 23, 643, 23, 64, 32, 34);
        List<Integer> listOfEven = new ArrayList<>();
        for (Integer number : list) {
            if (number % 2 == 0) {
            }
        }

        List<Integer> lists = list.stream().filter(x -> x % 2 == 0).map(x -> x * 2).collect(Collectors.toList());
        System.out.println(lists);

    }
}
