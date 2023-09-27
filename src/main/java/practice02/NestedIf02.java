package practice02;

import java.util.Scanner;

public class NestedIf02 {

    public static void main(String[] args) {
        /*
      Kullanıcıdan sisteme bir numara girmesini isteyin.

      Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

      Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Rakam" yazdırın,
      10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.

  */


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");

        int num=scan.nextInt();



        if (num<0){
            System.out.println("negatif sayı");
        }else{
            System.out.println("negatif sayı");

        }if (num<10) {
            System.out.println("rakam");

        }else if (num>=10){
        }


    }
}
