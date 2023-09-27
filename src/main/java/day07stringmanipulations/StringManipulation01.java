package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulation01 {

    public static void main(String[] args) {

          /*
            Example : Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun
                        ii)Space characteri password'de olmasin
                        iii)En az bir tane buyuk harf olsun
                        iv)En az bir tane kucuk harf olsun
                        v)En az bir tane rakam olsun
         */


        Scanner input=new Scanner(System.in);
        System.out.println("LÜTFEN PASSWORDÜNÜZÜ GİRİNİZ.");
        String pwd= input.nextLine();

        // 1) En az 8 character olsun
        boolean lenghthControl=pwd.length()>7;
        System.out.println("lengthControl="+lenghthControl);

        // 2) Space characteri password'de olmasin
        boolean spaceControl=!pwd.contains(" ");
        System.out.println("spaceControl= "+spaceControl);

        // 3) En az bir tane buyuk harf olsun
        boolean upperCaseControl=pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("upperCaseControl = " + upperCaseControl);

        // 4) En az bir tane kucuk harf olsun

        boolean lowerCaseControl=pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("lowerCaseControl = " + lowerCaseControl);


        // 5) En az bir tane rakam olsun
        boolean numberControl=pwd.replaceAll("[^1-9]","").length()>0;
        System.out.println("numberControl = " + numberControl);



        boolean result=lenghthControl && spaceControl && upperCaseControl && lowerCaseControl && numberControl;



        if (result){
            System.out.println("Password geçerli");
        }else{
            System.out.println("Password geçersiz");
        }

    }

}
