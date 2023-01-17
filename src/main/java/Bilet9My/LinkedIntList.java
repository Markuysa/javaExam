package Bilet9My;

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
    void outputList(){
        var temp = root;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print('\n');
    }
    public void removeDuplicates(){
        var firstEntry = this.root;
        var secondEntry = this.root.next;
        while (firstEntry!=null){
            while(secondEntry!=null){
                if (firstEntry.data == secondEntry.data){
                    var temp = secondEntry;
                    secondEntry = secondEntry.next;
                }
                secondEntry = secondEntry.next;
            }
        }
    }


}
