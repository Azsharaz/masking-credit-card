package ssg_dersler.arraylist;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class C06_arrayList {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]  bu listi
        //       [1, 3, 5, 6, 7] bu hale donusturun
        ArrayList<Integer>myList=new ArrayList<>();
        myList.add(1);
        myList.add(3);
        myList.add(5);
        myList.add(3);
        myList.add(5);
        myList.add(6);
        myList.add(1);
        myList.add(7);
        tekrarsizListOlustur(myList);
    }

    private static void tekrarsizListOlustur(ArrayList<Integer> myList) {
        ArrayList<Integer>tekrarsizList=new ArrayList<>();
        for (Integer a:myList
             ) {
            if (!tekrarsizList.contains(a)){
                tekrarsizList.add(a);
            }
        }
        System.out.println(tekrarsizList);
    }
    // bir listede ortalamanin ustunde olan element sayisini bulunuz odev!!!!
}
