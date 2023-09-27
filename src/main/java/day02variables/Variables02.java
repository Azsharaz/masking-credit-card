package day02variables;

public class Variables02 {
  // Non-primitve Data Type

    public static void main(String[] args) {

        // Örnek 9: Öğrenci ismi için variable oluşturup değer olarak Ali Can atayınız.
        // String oluştururken atanmak istenen değer her zaman çift tırnak içinde olmalıdır.
        // Aynı zamanda bir class'tır.

        String nameStudent="Ali Can";

        int age=7;

        // String için default değer null'dır. Null, 0 demek değildir; sıfır da bir değer demektir.
        // Null, içinde variable veya method bulunmayan boş bir obje demektir.

        /*
                             -Interview sorusu-
        1. Primitive ve non-primitive data typeları arasındaki fark nedir?

        *-> Primitive'ler sadece bizim atadığımız değeri içerir.
           Non-primitive'ler bizim atadığımız değeri ve "methodlar" içerir.*

        -> Primitive'ler küçük harfle başlar.
           Non-primitiveler büyük harfle başlar.

        -> Primitive'leri java üretmiştir ve sayısı (8) sabittir.
           Non-primitive'leri Java ve programcılar üretebilir.

        -> Primitive'lerin kapladığı yer kendi data type'ına göre bellidir ve de değişme.
           Non-primitive'ler memoryde büyüklüğüne göre değişen boyutlarda bellek kullanabilir.


         */

        //Öğrenci notları için iki adet variable oluşturun ve toplamlarını ekrana yazdırın.

        byte note1=40;
        byte note2=70;

        System.out.println(note1+note2);



    }


}
