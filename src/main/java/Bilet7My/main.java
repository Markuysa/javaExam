package Bilet7My;

public class main {
    public static void main(String[] args){
        LinkedIntList list1 = new LinkedIntList(1,3,5,7);
        LinkedIntList list2 = new LinkedIntList(3,4,5);
        list2.removeAll(list1);
    }
}
