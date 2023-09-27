package ssg_dersler.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class C02_arrayList {
    public static void main(String[] args) {
        /*
        bir list olusturun ve bu listteki
        elemanlari alfabetik siraya gore siralayin
         */
        ArrayList<String>sehirler=new ArrayList<>();
        sehirler.add("Manisa");
        sehirler.add("Izmir");
        sehirler.add("Denizli");
        sehirler.add("Giresun");
        sehirler.add("Erzurum");
        sehirler.add("Zonguldak");
        Collections.sort(sehirler);
        System.out.println(sehirler);

    }
}
