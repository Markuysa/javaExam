package Bilet21My;

public class CompareObjects<T> implements Comparable<T>{

    T data;
    @Override
    public int compareTo(Object o) {
        if (this.equals(o)) return 1;
        else return -1;
    }
    CompareObjects(T data){
        this.data = data;
    }
}
