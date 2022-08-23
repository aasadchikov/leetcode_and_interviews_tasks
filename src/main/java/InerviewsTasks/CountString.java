package InerviewsTasks;

import java.util.*;

public class CountString {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("appLe","b at","APPle","car!");
        Map<String,Integer> dataStructure = countStrings(strings);

        for (Map.Entry<String, Integer> entry : dataStructure.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static Map<String,Integer>countStrings(List<String> words){

        Map<String,Integer> map = new HashMap<>();
        List<String> newList = new ArrayList<>();

        for(String s:words){
            newList.add(s.toLowerCase().replaceAll("[^a-z]+",""));
        }

        for(String currentWord: newList) {
            if (map.containsKey(currentWord)) {
                map.put(currentWord, map.get(currentWord) + 1);
            }
            else {
                map.put(currentWord, 1);
            }
        }

        return map;
    }
}
