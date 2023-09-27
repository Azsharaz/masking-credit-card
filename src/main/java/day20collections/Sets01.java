package day20collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {
    /*
    1)Set' ler tekrarsiz eleman  (unique) depolamak icin kullanilir
    2) 3 tane Set Class i vardir
        a) HashSet Class
            Hash benzersiz id olusturma teknigidir. Bu teknige Hashing technique denir
            HashSet elemanlari rastgele siralar
            HashSet elemanlari siralamadigidan cok hizli calisir
            HashSetler nulli eleman kabul eder

        b) LinkedHashSet Class
            LinkedHashSet ler elemanlari sizin verdiginiz siraya gore dizdiklerinden(insertion order) Hashsetlere gore yavastirlar

        c) TreeSet Class
            TreeSet elemanlari natural order a gore dizerler.
            ve bu nedenle cok yavastirlar, en yavas settir
      3) TreeSet cok yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisiriz
     */

        HashSet<String> hs = new HashSet<>();
        hs.add("Sinan");
        hs.add("Kerem");
        hs.add("Tuba");
        hs.add("Onur");
        System.out.println(hs);//[Kerem, Sinan, Tuba, Onur] //Rastgele sıraladı
        hs.add("Tuba"); // Eklemez ama hata da vermez
        hs.add(null);
        hs.add(null); // Eklemez ama hata da vermez
        System.out.println(hs); // [Kerem, null, Sinan, Tuba, Onur]

        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(313);
        lhs.add(19);
        lhs.add(7);
        lhs.add(1);
        lhs.add(null);
        System.out.println(lhs); // [313, 19, 7, 1, null] --> Instertion order'a göre sıraladı

        LinkedHashSet<Integer> ls=new LinkedHashSet<>();
        lhs.add(313);
        lhs.add(19);
        lhs.add(17);
        lhs.add(11);
        lhs.add(null);


        lhs.retainAll(hs); // kesişim kümesini alır, kalanını siler
        System.out.println(lhs);
        System.out.println(ls);


        TreeSet<Character> ts=new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        // ts.add(null); // kabul etmez, nereye atayacak?
        System.out.println(ts); //[A, G, R, U, Z] // Natural order'a göre sıraladı.
        System.out.println(ts.subSet('G', 'U')); // son indexi almadan içindeki elemanların nerede başlayıp nerede bittiğini gösterir


    }
}