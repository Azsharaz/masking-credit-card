package practice01;


import java.util.Scanner;

public class C05Scanner {
    public static void main(String[] args) {

    /*

    kullanıcıdan aldıgınız sayının karesini bulunuz bulunuz
    not: bir sayının karesi, sayının kendisi ile carpımına esittir

    */


        Scanner scan=new Scanner(System.in);

        // Scanner yaz ve kırmızı olunca üstüne gle import de. geri kalanı sen yazıyorsun.
        // Scanner x=new Scanner();               x=bizim objemiz

        System.out.println("Lütfen karesini bulmak istediğiniz sayıyı giriniz.");

        int sayi=scan.nextInt();

        System.out.println(sayi);

        System.out.println(sayi*sayi);



    }


}
