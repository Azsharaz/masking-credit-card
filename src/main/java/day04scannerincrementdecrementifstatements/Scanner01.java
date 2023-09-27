package day04scannerincrementdecrementifstatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
          /*
       Ornek:  Kullanıcıdan i)Adini ve Soyadini ii)Yaşını iii)Boyunu iv)kilosunu v) medeni durumunu girmesini isteyin
               Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın
        */

        Scanner input=new Scanner(System.in);  // Scanner() --> constructor demek

        System.out.println("Adınızı ve soyadınızı giriniz.");

        String fullName=input.nextLine(); // NEXT LİNE methodu kullanıcıdan çok kelimeli string almak için

        System.out.println("Yaşınızı giriniz.");

        byte age=input.nextByte();

        System.out.println("Boyunuzu giriniz.");

        float height=input.nextFloat();

        System.out.println("Kilonuzu giriniz.");

        short weight=input.nextShort();

        System.out.println("Medeni durumunuzu giriniz.");

        // next () methodu kullanıcıdan tek kelimeli string almak için kullanılır.

        String maritalStatus=input.next();


        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);




    }
}
