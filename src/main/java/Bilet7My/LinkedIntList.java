package Bilet7My;

import java.util.LinkedList;

public class LinkedIntList {
    private LinkedIntListNode root;
    int size = 0;
    LinkedIntList(int ...a){
        root = new LinkedIntListNode(a[0],null);
        LinkedIntListNode tempRoot = root;
        for (var i : a){
            if (size != 0){
                tempRoot.next= new LinkedIntListNode(i,null);
                tempRoot=tempRoot.next;
            }
            size++;
        }
    }
    public void removeAll(LinkedIntList list2){
        var firstListNode = this.root;
        var secondListNode = list2.root;
        LinkedIntListNode result = null;
        while (firstListNode != null && secondListNode != null){
            if (firstListNode.data < secondListNode.data){
                result = firstListNode;
                firstListNode = firstListNode.next;
            } else if (firstListNode.data== secondListNode.data) {
                if (firstListNode == this.root){
                    root = firstListNode.next;
                    firstListNode = root;
                }else{
                    result.next = firstListNode.next;
                    firstListNode = firstListNode.next;
                }
                secondListNode = secondListNode.next;
                size--;
            }else{
                secondListNode = secondListNode.next;
            }
        }
    }

}
