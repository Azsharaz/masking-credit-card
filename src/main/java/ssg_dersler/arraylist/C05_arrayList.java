package ssg_dersler.arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class C05_arrayList {
    public static void main(String[] args) {
         /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazin
         */
        Random random=new Random();
        int sayi=0;
        ArrayList<Integer>sayiListesi=new ArrayList<>();
        while (sayiListesi.size()<200){
            sayi= random.nextInt(500);
            if (sayiListesi.contains(sayi)){
                continue;
            }
            sayiListesi.add(sayi);
        }
        Scanner scan=new Scanner(System.in);
        int tahminHakki=5;
        int tahminSayisi=0;
        do {
        System.out.println("lutfen tahminde bulunmak icin bir tamsayi giriniz");
        sayi= scan.nextInt();
        tahminSayisi++;
            //System.out.println(sayiListesi);
        if (sayiListesi.contains(sayi)){
            System.out.println("tebrikler "+tahminSayisi +". tahminde dogru sonuca vardiniz");

            break;
        }else System.out.println("tekrar deneyiniz");
        tahminHakki--;
            System.out.println("kalan tahmin hakkınız "+tahminHakki);
    }while (tahminHakki>0);
        if (tahminHakki==0){
            System.out.println("malesef bulamadiniz oyunu tekrar baslatin");
        }
    }
}
