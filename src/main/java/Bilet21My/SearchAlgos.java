package Bilet21My;

import java.util.ArrayList;

public class SearchAlgos {

    public static <T> boolean roughSearch(CompareObjects<T> searchObject, ArrayList<CompareObjects<T>> listElements){
        for (var i : listElements) {
            if (i.compareTo(searchObject) > 0){
                return true;
            }
        }
        return false;
    }

}
