package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        // SORU--> GÜN SAYISINI VERDİĞİNİZDE GÜN İSMİNİ VEREN KODU YAZINIR
        // 1==> PAZAR 2==>PAZARTESİ

        Scanner input=new Scanner(System.in);

        System.out.println("LÜTFEN KAÇINCOI GÜN OLDUĞUNU GİRİNİZ.");
        byte num=input.nextByte();

        if (num==1){
            System.out.println("SUNDAY");
        }else if(num==2) {
            System.out.println("MONDAY");
        }else if (num==3){
            System.out.println("TUESDAY");
        }else if(num==4) {
            System.out.println("WEDNESDAY");
        }else if (num==5){
            System.out.println("THURSDAY");
        }else if (num==6) {
            System.out.println("FRIDAY");
        }else if (num==7) {
            System.out.println("SUNDAY");
        } else{
            System.out.println("HATALI GİRİŞ YAPTINIZ. LÜTFEN 1 İLE 7 ARASINDA BİR SAYI GİRİNİZ.");


    }

        }





    }

