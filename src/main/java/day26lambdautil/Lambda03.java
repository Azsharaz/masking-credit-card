package day26lambdautil;

import java.util.stream.IntStream;

public class Lambda03 {

    public static void main(String[] args) {
        System.out.println(getSumFromSevenToSeventy());

    }

    //4) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz
    public static int getSumFromSevenToSeventy() {
        return IntStream.
                rangeClosed(7, 70).
                reduce(Math::addExact).
                getAsInt(); //IntStream'lerde .reduce(); methodunun identity'siz halini kullanırsak optional return eder.
        // .getAsInt(); ile görebiliriz.
    }

    //5)3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    //1.yol
    public static int getMultiplicationFromThreeToNine() {
        return IntStream.
                rangeClosed(3, 9).
                reduce(Math::multiplyExact).
                getAsInt();
    }

    //2.yol ==>range kullanimi
    public static int getMultiplicationFromThreeToNine2() {
        return IntStream.
                range(3, 10).
                reduce(Math::multiplyExact).
                getAsInt();
    }
    //6)Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.

    public static int getFactorial(int x) {
        // 0 istersek hata alırız, rangeClosed(); kullandığımızda soldaki sayı sağdakinden küçük olamaz.

        if(x==0){  // If'le düzenleriz.
            return 1;
        } else if (x<0) {
            System.out.println("Faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;
        } else {
            return IntStream.
                    rangeClosed(1,x).
                    reduce(Math::multiplyExact).    // Math classından multiply exactt methodunu kullandık
                    getAsInt();
        }
    }

    //7) Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    public static int getSumOfEvensBetweenTwoInteger(int a, int b) {

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        return IntStream.
                range(a + 1, b).
                filter(Utils::isNumberEven). // Utils classında method oluşturduk.
                sum();
    }






    }




