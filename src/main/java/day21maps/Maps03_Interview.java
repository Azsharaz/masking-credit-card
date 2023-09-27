package day21maps;



import java.util.HashMap;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.TreeMap;

public class Maps03_Interview {
    public static void main(String[] args) {


        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1


        String s = "I like you, like like!";

        //String imizi tum noktalama isaretlerinden temizlemeliyiz
        s = s.replaceAll("\\p{Punct}", "");
        System.out.println(s);//I like you like like

        //Tek parca olan stringimizi kelimelere ayirmak icin split(" ") kullanmaliyiz
        // Split olunca çoklu string data olduğu için array sepetine koymalıyız.
        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));//[I, like, you, like, like]


        //words arrayindeki kelimeler birer birer mapde var mi yokmu diye kontrol edilecek
        //words arrayindeki kelimeler Map de yoksa Map e value su 1 olarak yerlestirilecek
        //words arrayindeki kelimeler Map de varsa Map e varolan value u 1 artirilarak yerlesitrilecek
        HashMap<String, Integer> occ = new HashMap<>();


        for (String w : words) {

            Integer numOfOccurance = occ.get(w);
            if (numOfOccurance == null) {
                occ.put(w, 1);
            } else {
                occ.replace(w, numOfOccurance + 1);
            }
        }
        System.out.println(occ);

        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1











        /*
        HASH MAP ILE HASHTABLE ARASINDAKI FARKLAR NELERDIR? ** INTERVIEW **
        1) HashMap threadSafe ve senkronize değildir, hashTable threadSafe ve senkronizedir.
               ** Çoklu iş ve sıralamalı işlerde
        2) HashMap hızlıdır, HashTable HashMap'e göre yavaştır.
        3) HashMap'lere bir tane null key ve istediginiz kadar null value koyabilirsiniz
            HashTable'lara keylerde ve valua'larda null kullanilmasina musaade etmez.

        NOT: HASHMAP VE HASH TABLE İKİSİ DE ENTRYLERİ İKİSİ DE ENTRYLERİ RASTGELE SIRALAR.

        NE ZAMAN HASHTABLE?
        1) threadSafe ve senkronize kullanmamız gerekirse (çoklu işler)
        2) key ve valuelarda null kullanmak yasak ise HashTable kullanmalıyız.

         */



        Hashtable<String, Integer> ogrenciNotlari = new Hashtable<>();
        ogrenciNotlari.put("Ali", 77);
        ogrenciNotlari.put("Veli", 38);
        ogrenciNotlari.put("Tom", 76);
        ogrenciNotlari.put("Brad", 58);
        ogrenciNotlari.put("Can", 58);
        // ogrenciNotlari.put("ahmet", null);Hashtable larda value null olamaz
        // ogrenciNotlari.put(null, 58);Hashtable larda keyler null olamaz

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", null);
        stdAges.put("Veli", null);
        stdAges.put("Tom", null);
        stdAges.put(null, 18);
        stdAges.put(null, 33);
        System.out.println(stdAges);

        /*
        1)TreeMap entryleri keylerine gore natural order a gore siraya koyar, Bu yuzden coooooook yavastir
        2)Treemap threadSafe ve synchronized degildir.
        3)TreeMaplerin keylerinde null kullanilamaz, ama value larinda istedigimiz kadar null kullanabiliriz
         */


        TreeMap<String,Integer >countryPopulation=new TreeMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Italy", 40000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
        countryPopulation.put("France", null);
        //  countryPopulation.put(null, 18000000);
        System.out.println(countryPopulation);






    }
}
