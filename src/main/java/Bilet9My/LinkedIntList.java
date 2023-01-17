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
        LinkedIntListNode prev = this.root;
        while (firstEntry!=null){
            while(secondEntry!=null && prev!=null){
                if (firstEntry.data == secondEntry.data){
                    prev.next  = secondEntry.next;
                }
                else{
                    prev=prev.next;
                }
                secondEntry = secondEntry.next;
            }
            firstEntry = firstEntry.next;
            prev = firstEntry;
            if (firstEntry!=null){
                secondEntry = firstEntry.next;
            }else{
                secondEntry = null;
            }

        }

    }


}
