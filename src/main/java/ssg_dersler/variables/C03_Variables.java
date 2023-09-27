package ssg_dersler.variables;

import java.util.Scanner;

public class C03_Variables {

    public static void main(String[] args) {


        double kilo,yas=15,boy;
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz");
        kilo= scan.nextDouble();
        System.out.println("lutfen boyunuzu giriniz.");
        boy=scan.nextDouble();

        System.out.println(yas+kilo+boy);
        // başa "" ekleyince concata dönüşür
        // "\n" veya \n alt satıra geçirmeyi sağlar
        System.out.println(yas+"\n"+kilo+"\n"+boy);










    }
}
