package practice02;

import java.util.Scanner;

public class C05Switch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen puanızı giriniz");
        double puan = scan.nextDouble();
        String seviye = "";

        if (puan >= 0 && puan < 1) {

            seviye = "KALDI";
        }
        if (puan >= 1 && puan < 2) {

            seviye = "GECTİ";
        }
        if (puan >= 2 && puan < 2.5) {
            seviye = "IYI";
        }
        if (puan >= 2.5 && puan < 3.5) {
            seviye = "UST";
        }
        if (puan >= 3.5 && puan <= 4) {
            seviye = "HARİKA";
        } else {
            seviye = "atanmadı";
        }

        System.out.println("seviye = " + seviye);

        switch (seviye) {
            case "KALDI":
                System.out.println("F");
                break;
            case "GECTİ":
                System.out.println("D");
                break;
            case "IYI":
                System.out.println("C");
                break;
            case "UST":
                System.out.println("B");
                break;
            case "HARİKA":
                System.out.println("A");
                break;

            default:
                System.out.println("lütfen geçerli bir değer giriniz");
        }







    }
}
