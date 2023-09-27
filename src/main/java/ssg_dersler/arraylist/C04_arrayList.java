package ssg_dersler.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_arrayList {
    public static void main(String[] args) {
        /*
        bir dogal sayi listesi olusturun
        ve olusturdugunuz listedeki cift ogeleri toplayin
         */
        ArrayList<Integer>myList=new ArrayList<>();
        myList.add(2);
        myList.add(42);
        myList.add(43);
        myList.add(44);
        myList.add(45);
        myList.add(46);
        myList.add(4);
        myList.add(6);
        myList.add(8);
        myList.add(81);
        int sum=0;
        for (Integer a:myList
             ) {
            if (a%2==0){
                sum+=a;
            }
        }
        System.out.println(sum);

    }
}
