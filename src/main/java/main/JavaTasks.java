package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaTasks {
    // Вариант 2 - Напишите метод reverse, который принимает Map от целых чисел к строкам в качестве параметра
    public void reverse(HashMap<Integer,String> firstMap){
        HashMap<String,Integer> resultMap = new HashMap<>();
        for (Map.Entry<Integer,String> entry : firstMap.entrySet() ) {
            resultMap.put(entry.getValue(),entry.getKey());
        }
        
        }
    // Вариант 4 - проверка на четность элемента в множестве
    public boolean hasOdd(Set<Integer> firstSet){
        if (firstSet.size()!=0) {
            for (var i : firstSet){
                if (i%2==0) return true;
            }
        }
        return false;
    }

}


