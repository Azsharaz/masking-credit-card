package pratik;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("1. KENAR UZUNLUĞUNU GİRİNİZ");
        int side1=input.nextInt();
        System.out.println("2. KENAR UZUNLUĞUNU GİRİNİZ");
        int side2= input.nextInt();
        System.out.println("3. KENAR UZUNLUĞUNU GİRİNİZ");
        int side3=input.nextInt();

        if(side1>0 && side2>0 && side3>0){
            if (side1==side2 && side2==side3){
                System.out.println("EŞKENAR ÜÇGEN");
            }else if (side1==side2 || side1==side3 || side2==side3)  {
                System.out.println("İKİZKENAR ÜÇGEN");

            }else if (side1!=side2 && side2!=side3 && side1!=side3 ) {
                System.out.println("ÇEŞİT KENAR ÜÇGEN");
            }
        }

    }

}
