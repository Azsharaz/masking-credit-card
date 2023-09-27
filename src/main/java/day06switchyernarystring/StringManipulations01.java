package day06switchyernarystring;

public class StringManipulations01 {
    public static void main(String[] args) {


        String s="Java is easy";

        //Example 1: "s" String'inde kullanılar karakter sayısını bulunuz

        // length methodu= karakter sayısı


        int sLength=s.length();
        System.out.println(sLength);


        // Example 2: "s" String'indeki ilk indexte bulunan karakteri  ve son indexte bulunan karakteri alınız.



        char firstChar=s.charAt(0);
        System.out.println(firstChar); // 0=J

        char secondChar=s.charAt(11);
        System.out.println(firstChar); // 11=Y

        //NOT -- s.charAt(0) KODU BİZE HER ZAMAN İLK KARAKTERİ VERİR ÇÜNKÜ INDEX 0'DAN BAŞLAR
        // NOT2 -- s.charAt(s.length()-1) charAt method parantezie almak istediğimiz indexi vermemiz gerekiyor.
         //** s.length()-1 String'in kaç karakter olduğunu bilmeden de son karakteri bulabiliyoruz olayı bu. **
        // s.length()-1 ile her zaman son indexi alabilmeyi saglamis olduk.


        //Example 3: "s" String'indeki ilk 4 characteri aliniz.
        //** substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir. [0,4) **


        String s1=s.substring(0,4);
        System.out.println(s1); // java

        String s2 = s.substring(5,7);
        System.out.println(s2); // is

        String s3=s.substring(8,12);
        System.out.println(s3); // easy



        // 2. yol
        // Bir karakterden başlayarak sonuna kadar almak isterseniz o zaman tek parametreli methodu kullanabilirsiniz.


        String s4=s.substring(8);
        System.out.println(s4);

        //Example 6:  "s" String'inde easy kelimesinin var olup olmadigini kontrol ediniz.

        boolean isExist=s.contains("easy"); // Upper-lower case duyarlı, containste ignorecase yok.
        System.out.println(isExist); //true


        // Example 7: "s" String'inin belli bir harfle baslayıp baslamadıgını kontrol ediniz.

        boolean isStart=s.startsWith("Java");
        System.out.println(isStart); //true

        //Example 8: "s" String'inin "easy" ile bitip bitmediğini kontrol ediniz.

        boolean isEnd=s.endsWith("easy");
        System.out.println(isEnd);

























    }
}
