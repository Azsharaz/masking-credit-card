package day06switchyernarystring;

public class Ternary01 {

    public static void main(String[] args) {

        /* Example 1
        Bir sayının mutlak değerini hesaplayan kodu yazınız.
       -4==>-4*-1                     4==>4              0==>0
         */

        int c=4;

        // condition ? ture ise : false ise


        int result=c<0 ? -1*c : c;

        System.out.println(result);


        /*  Example 2:
        Iki sayinin isareti ayni ise bu sayilari carpan,
        isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
         mesaji veren kodu yaziniz.

         */

        int a=13;
        int b=7;
        Object result2= (a>0 &&  b>0) || (a<0 && b<0) ? a*b : "Farklı işaretli sayıları çarpamıyorum";

        System.out.println(result2);



        // Object java'da bütün Non-primitive classların ortak parentıdır. (hz adem)
        // Object'in parentı YOKTUR.
        // Farklı data tipleri için ortak bir variable oluşturmak istediğimizde data type olarak "Object" kullanırız.












    }


}
