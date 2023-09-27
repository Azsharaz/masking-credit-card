package pratik;

import java.util.Scanner;

public class Modulus3 {
    public static void main(String[] args) {


        //1'den 100 e kadar yazdırın. 3'ün katında JAVA yazsın

        for (int i = 1; i < 10; i++) {
            if (i%3==0){
                System.out.print("JAVA-");
            }else {
                System.out.print(i+"-");
            }

        }
        System.out.println();


        //1'den 100'e kadar yazdırın. Hem 3'ün hem de 5'in katında "JAVA GÜZELDİR" yazdıralım
        for (int i = 1; i < 33; i++) {
            if (i%3==0 && i%5==0){
                System.out.print("JAVA GÜZELDİR ");
            }else {
                System.out.print(i+ " ");
            }

        }
        System.out.println();

        // KULLANICAN BİR STRING ISTEYIN VE TERSTEN YAZDIRIN.



    }



        // .next(); döngüye girer.



    }



// KULLANICIDAN BİR STRING ISTEYIN VE TERSTEN YAZDIRAN METHODUNU YAZINIZ.
