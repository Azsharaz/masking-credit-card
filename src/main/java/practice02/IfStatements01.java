package practice02;

import java.util.Scanner;

public class IfStatements01 {


    public static void main(String[] args) {

        //kullanıcıdan iki sayı isteyin
        //sayıların ikisi de pozitifse sayıların toplamını yazdırın
        //ikisi de negatifse sayıların çarpımını yazdırın
        //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
        //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın

Scanner input=new Scanner(System.in);
        System.out.println("lütfen iki sayı isteyiniz.");
        int num1= input.nextInt();
        int num2= input.nextInt();


        if(num1>0 && num2>0){
            System.out.println(num1+num2);
        }else if (num1<0 && num2<0){
            System.out.println(num1*num2);
        }else if ((num1>0 && num2<0) || (num1<0 && num2>0)){
            System.out.println("farklı işaretlerde sayılarla işlem yapamazsınız");
        }else if (num1==0 || num2==0){
            System.out.println("sıfır çarpmaya göre yutan elamandır");
        }








    }
    }
