package practice03;


import java.util.Scanner;

public class C05DoWhileLoop {
    public static void main(String[] args) {


        /*
          Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
          Kullaniciya bitirmek istediginde 0'a basmasini soyleyin

          kullanici bitirmek istediginde
          toplam kac adet pozitif tam sayi girdigini
          ve bunlarin toplaminin kac oldugunu yazdirin

          Kullanici negatif sayi girerse
          "negatif sayi kullanamazsiniz " yazdirin
          bu negatif sayiyi sayi adedine ve toplama eklemeyin
         */

    Scanner scan=new Scanner(System.in);

    int sayac=0;
    int toplam=0;



    do {
        System.out.println("Lütfen işlem yapmak istediğiniz pozitif bir tam sayı giriniz.\nBitirmek için 0'a basınız.");
        int sayi= scan.nextInt();

        if(sayi==0){
            break;
        } else if (sayi<0) {
            System.out.println("Negatif sayı kullanamazsınız.");
        }else {                     // else kullanmak istemezsen continue; yazıp devam ettirebilirsin
                                   // son kalan duru sayının pozitif olma ihtimli olduğu için else(veya continue) kullandık

            toplam+=sayi;
            sayac++;
        }


    }while (true);

        System.out.println("Girdiğiniz "+sayac+"adet tamsayının toplamı: "+toplam);

    }
}