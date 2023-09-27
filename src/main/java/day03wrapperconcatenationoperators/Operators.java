package day03wrapperconcatenationoperators;

public class Operators {

    public static void main(String[] args) {

        /* OPERATORS 1

        1) +, -, *, / işlemleri Java'da matematikte olduğu gibi kullanılır.
        2) TAMSAYI VE TAMSAYI BÖLÜNDÜĞÜNDE SONUÇ DAİMA TAMSAYI --> VİRGÜLDEN SONRASINI SİLER, YUVARLAMAZ.
        3) Bir matematiksel işlemde farklı data tiplerini kullanırsanız sonuç her zaman BÜYÜK data tipinde olur.

         */

        int kisiSayisi=10;
        int paraMiktari=25;

        System.out.println(paraMiktari/kisiSayisi); //2.5 OLMASI GEREKİRKEN 2
        // TAMSAYI VE TAMSAYI BÖLÜNDÜĞÜNDE SONUÇ DAİMA TAMSAYI --> VİRGÜLDEN SONRASINI SİLER, YUVARLAMAZ.

        int ogrenciSayisi=10;
        double ucretMiktarı=25;

        System.out.println(ucretMiktarı/ogrenciSayisi); //2.5 --> DOUBLE DATA TYPE'INDA
        // Bir matematiksel işlemde farklı data tiplerini kullanırsanız sonuç her zaman BÜYÜK data tipinde olur.

        /* LOGICAL OPERATORS

        AND ve OR işlemleri

          -->  ÇAY       AND        KAHVE      SONUÇ
              true       &&         false      false
              false      &&         false      false
              false      &&         true       false
              true       &&         true       true

          **X  AND (&&) İŞLEMİNDEN TRUE ALABİLMEK İÇİN HERR ŞEYY TRUE OLMADILIDIR.  **
          BİR FALSE SONUCU FALSE YAPAR

            CAY       OR      KAHVE     SONUC
            true      ||      false     true
            false     ||      true      true
            false     ||      false     false
            true      ||      true      true

            **OR (||) İŞLEMİNDE BİR TRUE SONUCU TRUE YAPMAK İÇİN YETERLİDİR.**
            OR (||) İŞLEMİNDE SONUCUN FALSE OLABİLMESİ İÇİN HER ŞEY FALSE OLMALIDIR.

             3) NOT operatoru ( ! )  true olani false, false olani true yapar.
            !true  ===> false
            !false ===> true
            !!true ===> true

         4) CAMPARISON (KARŞILAŞTIRMA) OPERATORS
            <,>, <=, >=, == , !=

          NOTE: Karsilastirma operatorlerini kullandiginizda sonuc kesinlikle boolean (true, false) alirsiniz
         */

        boolean first = 3 < 5;
        boolean second = 2 + 3 != 5;
        boolean third = 2 + 3 * 5 >= 19;

        System.out.println(first && second);//false
        System.out.println( first || second || third);//true






    }
}
