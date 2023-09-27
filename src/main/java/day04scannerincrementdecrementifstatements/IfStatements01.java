package day04scannerincrementdecrementifstatements;

public class IfStatements01 {
    public static void main(String[] args) {

        // IF STATEMENTS
        // Bazı kodların bazı şartlara göre aktif olması için kullanılır.


        // ÖRNEK: SAYI -1 İLE 10 ARASINDA İSE RAKAM YAZDIRSIN

        int number=13;

        if (number > -1 && number <10) {
            System.out.println("Rakam");
        }

        // ÖRNEK 2: Sayı 3 basamaklı ise ekrana "Sayı 3 basamaklıdır!" yazdırın.

        int n=123;

        if (n>99 && n<1000) {
            System.out.println("Sayı 3 basamaklıdır!");



            if(!(n > 99 && n < 1000))  {
                System.out.println("Sayı üç basamaklı değildir");}
        }












    }

}
