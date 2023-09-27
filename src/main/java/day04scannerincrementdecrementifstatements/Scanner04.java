package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {
        // Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz
        //           45678 ==> 45 + 78 = 123

        Scanner input=new Scanner(System.in);

        System.out.println("5 basamaklı bir sayı giriniz.");
        int num= input.nextInt();

        int firstTwo=num/1000;   //Bir tam sayıyı 1000'e bölersek son 3 basamağı silmiş oluruz.

        // % --> MODULUS OPERATOR
        // Solunda bulunan sayının sağında bulunan sayıya bölümünden KALANI verir.
        // --> DOLAYISIYLA %10 BİZE HER ZAMAN BİZE SOLDAKİ SAYININ BİRLER BASAMAĞINDA BULUNAN SAYIYI VERİR.


        int lastTwo =num%100;
        System.out.println(firstTwo + lastTwo);




    }
}
