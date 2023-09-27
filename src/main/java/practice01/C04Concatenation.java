package practice01;

import java.beans.JavaBean;

public class C04Concatenation {

    public static void main(String[] args) {

        String str1= "Java";
        String str2="Güzel";

        int sayi1=5;
        int sayi2=3;

            /*2 tane string, 2 tane int data turunde variable olusturun

        Java5Güzel yazdırın
        8Java yazdırın
        Java8Guzel yazdırın
        2Güzel15 yazdırın
        Java22 yazdırın
        53Güzel yazdırın

         */

        // Java5Güzel
        System.out.println(str1+sayi1+str2);

        // Java8Guzel
        System.out.println(str1+(sayi1+sayi2)+str2);

        // 2Güzel15
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);

        // Java22

        System.out.println(str1+(sayi1*sayi2-sayi2));
        //veya
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));

        // 53Güzel

        System.out.println(sayi1+(sayi2+str2));
        System.out.println(""+sayi1+sayi2+str1);

        //

    }
}
