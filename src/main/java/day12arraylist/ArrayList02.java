package day12arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

    public static void main(String[] args) {

        // ArrayList < Integer > list = new ArrayList<>(); oluşturma
       // >>          Arraylist(veya sadece List) < Data type(Wrapper)> isim = new ArrayList<>();


                   // INTERVIEW SORUSU //
        //Örnek : Tekrarli elemanlari olan bir listten sadece tekrarsiz elemanlari olan bir list elde edinn
        //           [J, a, v, a, v] ==> [J, a, v]


        List<Character> a = new ArrayList<>(); // a sepetinde J, a, v, a, v var
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');

        List<Character> b = new ArrayList<>(); // boş sepeti açtık

        for (Character w : a) {  // a'daki elemanları w'de loop'a aktardık.

            if (!b.contains(w)) { // b listi a list'inden w loop sepetine gelen karakterleri içermiyorsa

                b.add(w);        // add ile a'dan w'ye aktarılan karakterleri b sepetine ekle

            }
        }
        System.out.println(b); // (J, a, v)

        /*  LOGIC

        BİR LİSTTEN BAŞKA BİR VERİ ELDE ETMEMİZİ İSTİYORSA BAŞKA BİR LİST SEPETİ AÇIP ORADA TOPLAMAYA ÇALIŞIRIZ.

         */

                       // INTERVIEW SORUSU //  --- KALITELI SORU--
        //Örnek : Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.

        ArrayList<String> r = new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");
        System.out.println(r);  // Manisa, Nigde, Tokat, Van

        // sürekli tekrar varsa loop kullanacağız.
        // öncelikle for each
        // for ( Data type     yeni list(sepet) ismi(w)    :  gezmek(eklemek) istediğimiz list) {        <<<<<  for each
        // eğer ki bir listte eleman silme işlemi yapmak istersek for each KULLANAMAYIZ!!!!

        for ( String w : r) {
            if (w.contains("a")){
                r.remove(w);                    // >> BU KOD FOR EACH'TE ÇALIŞMAZ ÇÜNKÜ KELİMELERDEKİ INDEX DEĞİŞTİ.
        }
        }

        // for i kullanırız çünkü indexler VAR

        for (int i = 0; i < r.size(); i++) {    // i sepetine koyup 1. indexten sonuna kadar döndürmeye başla dedik
            if (r.get(i).contains("a")) {       //i'nin indexine baştan başlayarak git, a içerenleri kontrole başla
                r.remove(i);                   // a içerenleri sil
                // biz eleman sildikçe indexler geriye kaydı. böyle devam edersek 0'dan 1'e geçerken diğer elemanı atlayacakç
                i--;      // bu yüzden işlemi tamamladıktan sonra bir eksilterek git diyerek baştaki i++ ile nötrlemiş olduk
            }
        }

        System.out.println(r); // Nigde


























    }
}
