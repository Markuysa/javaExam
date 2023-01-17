package Bilet29;

import java.util.ArrayList;

public class MyStack<G> {
    private ArrayList<G> massive = new ArrayList<>();

    public void push(G data) {
        massive.add(data);
    }
    public G peek() {

        return massive.get(massive.size()-1);
    }
    public G pop() {
        G d = massive.get(massive.size()-1);
        massive.remove(massive.size()-1);
        return d;
    }
    public boolean isEmpty() {
        return massive.isEmpty();
    }
}
