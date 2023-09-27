package practice02;

import java.util.Scanner;

public class C04NestedTernary {

    public static void main(String[] args) {

         /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner input=new Scanner(System.in);
        System.out.println("iki tam sayı giriniz");
        int a=input.nextInt();
        int b=input.nextInt();


        System.out.println(a==b? "Sayılar birbirine eşittir" : (a>b) ? a : b);







    }


}
