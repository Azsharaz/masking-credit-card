package ssg_dersler.arrays;

import java.util.Arrays;

public class C04_arrays {
    public static void main(String[] args) {
                /*
        5.soru Verilen bir int array'deki
        en buyuk sayiyi yazdiran bir method olusturun.
         */
        int sayilar[]={9,7,2,12,26,1,5,10,8,3};
       // Arrays.sort(sayilar);
       // System.out.println(sayilar[sayilar.length - 1]);
        maxSayiYazdir(sayilar);
        minSayiYazdir(sayilar);

    }


    private static void minSayiYazdir(int[] sayilar) {
        int minSayi=sayilar[0];
        for (int i = 0; i <sayilar.length ; i++) {
            minSayi=Math.min(minSayi,sayilar[i]);
        }
        System.out.println("arraydeki en kucuk sayi : "+minSayi);

    }

    public static void maxSayiYazdir(int sayilar[]){
        int maxSayi=sayilar[0];
        for (int i = 0; i <sayilar.length ; i++) {
            maxSayi=Math.max(maxSayi,sayilar[i]);

        }
        System.out.println("array icinde en buyuk sayi : "+maxSayi);
    }

}
