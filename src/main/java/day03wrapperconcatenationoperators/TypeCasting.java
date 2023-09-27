package day03wrapperconcatenationoperators;

public class TypeCasting {
    public static void main(String[] args) {

        /*
        NUMERIC PRIMITIVE DATA TYPELARININ BİRBİRİNE DÖNÜŞTÜRÜLMESİNE "Type Casting" denir.
        Numeric data typelar= byte, short, int, long, float, double

        NOT: Küçük data tiplerini büyük data typeına çevirmeyi Java otomatik olarak yapar.
        Bu işleme "AutoWidening" denir.
        Büyük data typelarını küçük data typelarına çevirmek risklidir.
        Java bu riskli işleri otomatik olarak yapmaz. DEV YAPAR.
        Bu işleme Explicit Narrowing denir.

         */

        // ÖRNEK: byte data typeını int data typeına çeviriniz.

        byte age=13;

        int ageInt=age; //Auto Widening

        // ÖRNEK: int data typeını short data typeına çeviriniz.

        int weight=313;

        short weightShort=(short)weight; //Explicit Narrowing-Java'yı forcelarız









    }
}
