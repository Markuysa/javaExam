package Bilet9My;

public class main {
    public static void main(String[] args) {
        LinkedIntList linkedIntList = new LinkedIntList(14,14,12);
        linkedIntList.outputList();
        linkedIntList.removeDuplicates();
        linkedIntList.outputList();
    }
}
