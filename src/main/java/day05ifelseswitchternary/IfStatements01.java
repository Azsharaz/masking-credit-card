package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatements01 {

    public static void main(String[] args) {


        //EXAMPLE 1-- VERİLEN BİR SAYININ POZİTİF, NEGATİF VEYA NÖTR OLDUĞUNU KONTROL EDEN KODU YAZINIZ.

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");

        int num= input.nextInt();

        if (num>0) {
            System.out.println("Sayı Pozitiftir.");
        }else if (num<0) {
            System.out.println("Sayı Negatiftir.");
        }else{
            System.out.println("NÖTR");


        }



    }
}
