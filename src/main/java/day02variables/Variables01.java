package day02variables;

public class Variables01 {

    public static void main(String[] args) {

        //Variable nasıl oluşturulur?
        //Data Type + Variable Name + Assingment Operator + Variable değeri + Noktalı Virgül

        int age = 13;

        System.out.println(age);


           /*
           Javada temelde iki tip data vardır.
           1. Primitive data type:
              char, boolean, byte, int, long, float, double

           2. Non-primitive data type:
           Sayısı belli değildir.
           Her class aynı zamanda bir non-primitive data type'dır.
               String
            */


        // Char: 2 byte
        // Tek karakterler için kullanılır. Sayı, sembol, harf fark etmez. Örn: A, x, ?, 5
        // Değerler her zaman tek tırnak içine koyulmalıdır.

        char isminIlkHarfi = 'A';

        // Boolean: 1 bit
        // Blooleanlar sadece iki farklı değer olabilir; true ve false
        // Ornek 2: boolean data type'inde emeklimisin sorusu icin bir variable olusturun ve false degerini atayin.

        boolean isRetired = false;

        // Byte: 1 byte
        // Tam sayılar içindir
        // -128'den +127'ye kadar(dahil) tam sayı değerleri için kullanılır.
        // Örnek 3: byte data type'ında öğrenci yaşı için bir variable oluşturunuz.

        byte ogrenciYasi = 15;

        // Short: 2 byte
        // -32768 ile 32767 arasındaki sayılar(dahil) tamsayılar için kullanılır

        short siteNufusu = 7567;

        // Integer: 4 byte
        // Tam sayilar icindir.
        // -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir
        // Ornek 5: Ulke nufusu icin bir variable olusturup deger atamasi yapiniz

        int pupulationCounty=254632523;

        // sout= println kodunun kısa yolu

        // Long: 8 byte
        // Tam sayilar icindir.
        // -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.
        // Ornek 6: iNsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.

        long cellNumberInHumanBody=98765432145875L;

        // Long yazılsa bile int kabul edilir, bu yüzden teyit etmek için sonuna L koyulur.
        // Değer int aralığındaysa sonuna L koymaya gerek yok;

        long weightOfSun=85696;

        // Float: 4 byte
        // Virgüllü(Ondalık/Decimal) sayılar için kullanılır.
        // Örnek 7: Gömlek fiyatı için bir variable oluşturun.
        // Java ndalıklı sayıları otomatik olarak double kabul eder.
        // Float'a çevirebilmek için sonuna büyük veya küçük F koyulur.

        float priceOfShirt=19.99F;

        // Double: 8 byte
        // Virgülden sonraki rakam daha fazla olabilir. --> Float'tan farkı.
        // Yine virgüllü sayılar için kullanılır.
        //Çok sık kullanılır.

        double weightCell=11.2564892;

        System.out.println(weightCell);

        // 1.5E-14 --> 1.5 çarpı 10 üzeri -15 demektir.



    }
}