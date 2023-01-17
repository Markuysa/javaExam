package main;

class Node<T>{
    T data;
    Node<T> next;
    Node(T data,Node<T> next){
        this.data=data;
        this.next=next;
    }
}


public class Stack<T>{
    int size;
    Node<T> prev;
    Stack(){
        this.size = 0;
    }
    public void push(T data){
        if (this.size == 0){
            prev  = new Node<T>(data, null);
        }else{
            Node<T> elem  = new Node<T>(data, prev);
            prev = elem;
        }
        this.size++;
    }
    public void printStack(){
        var temp = prev;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

