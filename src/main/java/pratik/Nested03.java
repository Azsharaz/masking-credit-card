package pratik;

import java.util.Scanner;

public class Nested03 {

    /*
    Soru: Bir otobüs firması bilet ücreti hesaplama programı yapmanız gerekiyor.
    Kullanıcıdan yaşı ve seyahat sınıfını (1: Ekonomi, 2: Business) girmesini isteyen bir Java programı yazınız.

     Bilet fiyatları aşağıdaki gibidir:

     Ekonomi Sınıfı: 12 yaş altı için 50 TL, 12-18 yaş arası için 100 TL, 18 yaş üstü için 150 TL
     Business Sınıfı: 12 yaş altı için 100 TL, 12-18 yaş arası için 200 TL, 18 yaş üstü için 300 TL

     Kullanıcıdan alınan bilgilere göre seçilen seyahat sınıfını, yaş grubunu ve bilet ücretini yazdıran programı yazınız.


     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen seyahat sınıfınızı seçiniz. (1. Ekonomi, 2. Business)");
        int sinif = scan.nextInt();

        System.out.println("Lütfen yaşınızı giriniz.");
        int age = scan.nextInt();

        double price = 0;

        if (sinif == 1) {
            if (age < 12 && age > 0) {
                price = 50;
            } else if (age > 12 && age < 18) {
                price = 100;
            } else if (age > 18) {
                price = 150;
            }
                System.out.println("Bilet fiyatınız " + price + " TL'dir.");
        }else if (sinif == 2) {
                if (age < 12 && age > 0) {
                    price = 100;
                } else if (age > 12 && age < 18) {
                    price = 200;
                } else if (age > 18) {
                    price = 300;
                }
                    System.out.println("Bilet fiyatınız " + price + " TL'dir.");
                }else {
                    System.out.println("Hatalı seçim yaptınız.");

            }
        }
    }


