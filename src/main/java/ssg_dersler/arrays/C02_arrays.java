package ssg_dersler.arrays;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {
        /*
        2.soru bir array olusturun ve olusturdugunuz arraydeki sayilari kucukten buyuge siralayin
         */
        int sayilar[]={9,7,2,12,26,1,5,10,8,3};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

    }
}
