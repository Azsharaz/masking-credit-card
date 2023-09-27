package day03wrapperconcatenationoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //***** 1. adım= Scanner Class'tan object oluştur.*****

        Scanner input=new Scanner(System.in);

        // 2. adım= Kullanıcıya ne istediğinize dair mesaj veriniz.

        System.out.println("Lütfen yaşınızı giriniz.");


        // 3. adım= Uygun method'u kullanarak kullanıcının verdiği datayı memorye yerleştiriniz.

        byte age=input.nextByte(); //Kullanıcının vermiş olduğu datayı byte tipinde alır getirir.

        System.out.println(age);










    }


}
