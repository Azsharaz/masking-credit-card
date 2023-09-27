package ssg_dersler.arrays;

import java.util.Arrays;

public class C03_arrays {
    public static void main(String[] args) {
        /*
        3.soru Verilen array
        in tum elemanlarini bir soldaki konuma tasiyacak
        bir program yazin. Ornek; array ((1,2,3)) ise output (2, 3, 1) olacak
        */
        int sayilar[]={9,7,2,12,26,1,5,10,8,3};
        int ilk=sayilar[0];
        for (int i = 0; i < sayilar.length-1 ; i++) {
            sayilar[i]=sayilar[i+1];
            System.out.println(Arrays.toString(sayilar));
        }
        sayilar[sayilar.length-1]=ilk;
        System.out.println(Arrays.toString(sayilar));
    }
}
