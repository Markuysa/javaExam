package Bilet2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> mapIntToStr = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Input how much records u want");
        int mapSize = in.nextInt();
        for(int i =0  ; i < mapSize;i++) {
            mapIntToStr.put(in.nextInt(), in.nextLine());
        }
        Map<String,Integer> mapStrToInt = reverse(mapIntToStr);
        printMap(mapStrToInt);
    }
    public static Map<String,Integer> reverse (Map<Integer, String> currentMap) {
        Map<String,Integer> reversedMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry: currentMap.entrySet())  {
            if(reversedMap.get(entry.getValue()) == null) {
                reversedMap.put(entry.getValue(), entry.getKey());
            }
        }
        return reversedMap;
    }
    public static void printMap(Map<String, Integer> map) {
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
