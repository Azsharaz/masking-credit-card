package pratik;

import java.util.Scanner;

public class NestedAdvanced {

    /*
    Soru: Bir restoran menüsünde farklı yemekler bulunmaktadır. Kullanıcıdan seçtiği yemeğin türünü
    ve porsiyon miktarını (küçük, orta, büyük) girmesini isteyen bir Java programı yazınız.
     Fiyatlar aşağıdaki gibidir:

Kırmızı Et Yemeği: Küçük: 20 TL, Orta: 30 TL, Büyük: 40 TL
Tavuk Yemeği: Küçük: 15 TL, Orta: 25 TL, Büyük: 35 TL
Balık Yemeği: Küçük: 25 TL, Orta: 35 TL, Büyük: 45 TL
Kullanıcıdan alınan bilgilere göre seçilen yemeğin türünü, porsiyon miktarını ve fiyatını yazdıran programı yazınız.
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Bir yemek türü seçiniz (1. Kırmızı Et yemeği, 2. Tavuk, 3. Balık");
        int yemekTuru= scan.nextInt();

        System.out.println("Porsiyon seçiniz (1. Küçük, 2. Orta, 3. Büyük");
        int porsiyon= scan.nextInt();

        double fiyat=0;

        if (yemekTuru>=1 && yemekTuru<=3 && porsiyon>=1 && porsiyon<=3); {

            if (yemekTuru==1){
                if (porsiyon==1) {
                    fiyat = 20;
                }else if (porsiyon==2) {
                    fiyat = 30;
                }else if (porsiyon==3){
                            fiyat=40;
                        }System.out.println("Kırmızı et yemeği fiyatı "+fiyat+ " TL'dir");
                }else if (yemekTuru==2) {
                if (porsiyon==1) {
                    fiyat = 15;
                }else if (porsiyon==2) {
                    fiyat = 25;
                }else if (porsiyon==3){
                    fiyat=35;
                }System.out.println("Tavuk yemeği fiyatı "+fiyat+ " TL'dir");
            }else if (yemekTuru==3) {
                if (porsiyon==1) {
                    fiyat = 25;
                }else if (porsiyon==2) {
                    fiyat = 35;
                }else if (porsiyon==3){
                    fiyat=45;
                }System.out.println("Balık yemeği fiyatı "+fiyat+ " TL'dir");


            }
        }
            }
        }




