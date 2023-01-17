package Bilet9My;

public class main {
    public static void main(String[] args) {
        LinkedIntList linkedIntList = new LinkedIntList(14,8,14,12,1,14,11,8,8,10,4,9,1,2,5,2,4,12,12);
        linkedIntList.outputList();
        linkedIntList.removeDuplicates();
        linkedIntList.outputList();
    }
}
