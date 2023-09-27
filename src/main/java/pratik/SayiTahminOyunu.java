package pratik;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

    /*
    Bir oyun yazılımı geliştirmek istiyorsunuz.
    Oyuncuya 1 ile 100 arasında rastgele bir sayı seçilir ve oyuncunun bu sayıyı tahmin etmesi gerekiyor.
    Oyuncuya her tahmininde, sayının büyük mü küçük mü olduğunu söyleyen bir geri bildirim verilir.
    Oyuncu doğru tahmin edene kadar devam etmelidir.
    Bir do-while döngüsü kullanarak bu oyunu Java'da yazın.
     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randomnum = new Random();

        int min = 1;
        int max = 10;
        int rastgeleSayi = randomnum.nextInt(max)+min; //10 olmadan önce 21
        int tahmin;


        do {
            System.out.println("lütfen 1 ile 10 arasındaki tahminizi giriniz.");
            tahmin = scan.nextInt();
            if (tahmin > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı giriniz");
            } else if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı giriniz");

            } else {
                System.out.println("Tebrikler! Kazandınız.");


            }


        } while (tahmin != rastgeleSayi);
    }
}