package pratik;

import java.util.Scanner;

public class IfElsePratik01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen ders notunuzu giriniz");
        int not=scan.nextInt();
        if (not>=85 && not<=100) {
            System.out.println("A");
        }else if (not>=70 && not<85){
            System.out.println("B");
        }else if (not>=50 && not<70){
            System.out.println("C");
        }else if (not>=45 && not<50){
            System.out.println("D");
        } else if (not<45 && not>0) {
            System.out.println("F");

        }else{
            System.out.println("HATALI NOT GİRİŞİ YAPTINIZ");
        }
    }
}

