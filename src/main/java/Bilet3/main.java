package Bilet3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Marty","Stepp");
        map.put("Stuart","Reges");
        map.put("Jessica","<Miller>");
        map.put("Amanda","Camp");
        map.put("Hal","Stepp");

        System.out.println(isUnique(map));

    }

    public static boolean isUnique(Map<String,String> firstMap){
        Set<String> resultSet = new HashSet<>();
        int counter = 0;
        for (var i:firstMap.entrySet()){
            resultSet.add(i.getValue());
            counter++;
        }
        if (counter!= resultSet.size()) return false;
        return true;
    }
}
