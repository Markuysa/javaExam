package Bilet6;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.*;

public class main {
    public static void main(String[] args) {

        String[] array = new String[]{"Farm","Zoo","Car","Apple","Bee","Golf",
        "Bee","Dog","Golf","Zoo","Zoo","Bee","Bee","Apple"};
        guavaSort(array);

    }

    public static void guavaSort(String[] array){
        Multiset<String> firstSet = HashMultiset.create();
        firstSet.addAll(Arrays.asList(array));
        List<String>[] buckets = new List[firstSet.size()/5];
        for (int i = 0; i<firstSet.size()/5;i++){
            buckets[i] = new LinkedList<String>();
        }
        for (String entry:firstSet.elementSet()){
            buckets[entry.hashCode() % (firstSet.size()/5)].add(entry);
        }
        int counter  = 0;
        for (var bucket:buckets){
            Collections.sort(bucket);
            for (var str:bucket){
                for (int j = 0; j< firstSet.count(str);j++){
                    array[counter]=str;
                    System.out.print(str+" ");
                    counter++;
                }
            }

        }
        System.out.print('\n');


    }
}
