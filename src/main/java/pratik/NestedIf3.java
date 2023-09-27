package pratik;

import java.util.Scanner;

public class NestedIf3 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir yıl girmesini isteyen ve
        girilen yılın artık yıl olup olmadığını belirleyen bir Java programı yazınız.
        Bir yıl, ya 4'e tam bölünecek ve 100'e tam bölünmeyecek,
        ya da direkt 400'e tam bölünebiliyorsa artık yıldır.
        Eğer yıl artık ise "Artık Yıl", değilse "Artık Yıl Değil" mesajını yazdırın.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("BİR YIL GİRİNİZ.");
        int year = scan.nextInt();

        if (year > 0) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("ARTIK YILDIR");
            } else {
                System.out.println("Artık yıl değil");
            }


        }
    }
}
