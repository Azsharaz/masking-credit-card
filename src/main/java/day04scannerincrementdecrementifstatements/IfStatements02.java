package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class IfStatements02 {

    public static void main(String[] args) {

        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int num=input.nextInt();

        // 1. YOL


          if (num%2==0){
              System.out.println("Sayı çifttir.");  // IF KULLANDIKTAN SONRA SOUT DAİMA SÜSLÜ PARANTEZ İÇİNDE OLMALI
               }

          if (num%2!=0) {
              System.out.println("Sayı tektir.");   // İŞİMİZ BİTİNCE SÜSLÜ PARANTEZ OLMAZ

          }

               // 2. YOL
              // IF ELSE STATEMENTS --- SADECE İKİ DURUMLU SENARYOLAR




              if (num%2==0){
                  System.out.println("Cift sayi");

              }else{

                  System.out.println("Tek sayi");
              }

              }







}


