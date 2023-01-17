package Bilet21My;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<CompareObjects<Integer>> arrayList = new ArrayList<>();
        CompareObjects<Integer> obj = new CompareObjects<>(10);
        var key = new CompareObjects<>(10);
        arrayList.add(new CompareObjects<>(10));
        arrayList.add(key);
        arrayList.add(new CompareObjects<>(20));
        arrayList.add(new CompareObjects<>(40));
        arrayList.add(new CompareObjects<>(30));
        arrayList.add(new CompareObjects<>(100));
        System.out.println(SearchAlgos.roughSearch(key,arrayList));

    }
}
