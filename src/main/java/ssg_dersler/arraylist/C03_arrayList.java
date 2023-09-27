package ssg_dersler.arraylist;

import java.util.ArrayList;

public class C03_arrayList {
    public static void main(String[] args) {
        /*
        bir dogal sayi listesi olusturun
        ve olusturdugunuz listedeki tum ogeleri toplayın
         */
        ArrayList<Integer>mylist=new ArrayList<>();
        mylist.add(3);
        mylist.add(5);
        mylist.add(7);
        mylist.add(9);
        mylist.add(25);
        int sum=0;
        for (Integer a:mylist
             ) {
            sum+=a;
        }
        System.out.println(sum);
    }
}
