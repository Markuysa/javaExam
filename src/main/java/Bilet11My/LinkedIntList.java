package Bilet11My;

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

    void firstLast(){

        var first = root;
        var temp = root;
        root = root.next;
        while (temp.next!=null){
            temp = temp.next;
        }
        first.next = null;
        temp.next = first;


    }
    void outputList(){
        var temp = root;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print('\n');
    }

}
