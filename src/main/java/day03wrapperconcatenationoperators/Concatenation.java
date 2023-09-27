package day03wrapperconcatenationoperators;

public class Concatenation {
    public static void main(String[] args) {

        // ÖRNEK 1: Bir String ve iki integer variable oluşturun. String değeri ile Integerların toplamını console'a yazdırın.

        String s="elma";
        int a=10;
        int b=11;

        System.out.println(s+a+b); //elma1011
        System.out.println(s+a*b); //elma110
        System.out.println(a+(a+b)); //elma21
        System.out.println(a+b+s); //21elma
        System.out.println(a+s+b); //10elma11

        // Java'da + sembolü iki sayı arasında kullanılırsa TOPLAMA İŞLEMİ olur
        // Java'da + sembolü iki String arasında veya bir String ve bir sayı arasında kullanılırsa CONCATENATION olur
        // Concatenation işlemi BİRLEŞTİRME yapar.
          // Concatenation işlemlerinde Java matematikteki işlem önceliğini kullanır.

        /*              --MATEMATİKTE İŞLEM ÖNCELİĞİ --

        1. ÜSLÜ SAYILAR
        2. PARANTEZ İÇİ
        3. BÖLME VEYA ÇARPMA İŞLEMİ
        4, TOPLAMA VEYA ÇIKARMA

        ** AYNI ÖNCELİKLİ OLANLARDA SOLDAN SAĞA YAPILIR **

        */

    }
}
