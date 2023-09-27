package day21maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps01 {
    public static void main(String[] args) {


        // COLLECTION DEGILDIR
        // KEY = TEKRARSIZ (UNIQUE) --VALUE = TEKRARLI OLABILIR
        // HER BIR ELEMANINA ENTRY DENIR (KEY=VALUE PARÇASI)
        // TAMAMINA ENTRY SET DENIR


          /*
        KEY                        VALUE
        (tekrarsiz                 (tekrarli
        unique)                    olabilir)

        Cat             =           Kedi  | ( Cat = Kedi bir "entry" dir)
        Dog             =           Kopek |===> entry set( map in tum elemanlari)
        Hard            =           Zor   |
        Difficult       =           Zor   |
        (String)                   (String) ==> Data tipleri farkli olabilir
      */



 /*
        1) Map lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        2) key kismi tekrarsiz, value kismi tekrarli olabilir
        3) Map ler deki her bir elemana entry denir, tamamina ise EntrySet denir
        4) Entry ler tekrarsiz oldugu icin entry set denilir
        5) Key ve valuelar ayri ayri data type larinda olabilirler
        6) Map ler collection degildir, farkli bir yapidir
        7) HashMap ler entry leri rastgele siralar, bu yuzden en hizli map dir
         */

        //Map nasil olusturulur?


        HashMap<String, Integer> countryPopulation = new HashMap<>();

        //Map e entry nasil eklenir?
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Italy", 40000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation); // süslü parantez içinde verir {Turkiye=83000000, Netherland=18000000, USA=400000000, Italy=40000000, Germany=83000000}

        //get() methodu key ile calisir ve value kismini verir
        Integer turkiyePopulation = countryPopulation.get("Turkiye");
        System.out.println(turkiyePopulation);
        //Butun key leri nasil alabilirim?
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);
        //Butun value lari nasil alabilirim?
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values); // [83000000, 18000000, 400000000, 40000000, 83000000]


        //Example 1: countryPopulation map'indeki ulkelerin nufuslarinin ortalamsi nedir?

        // önce valueları tek tek alır sonra toplarız -> foreach döngüsü
        int sum = 0;
        for (int w : values) {
            sum += w;
        }
        System.out.println(sum / values.size());

        // MAPLER LOOPLARLA KULLANILAMAZ.
        // LOOPLARLA KULLANMAK İSTERSEK ENTRYSET() METHODU İLE COLLECTIONA DÖNÜŞTÜRMEMİZ GEREKİR
        Set<Map.Entry<String, Integer>> entries = countryPopulation.entrySet();
        // neyi tutacaksan elmasın içine onun data type'ı (mapimizin key ve valuesu)
        System.out.println(entries);


        //Example 2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin
        //toplamini bulunuz.

        int toplam=0;

        for (Map.Entry<String, Integer>  w :entries ) {
            toplam=toplam+w.getKey().length()+w.getValue();
        }
        System.out.println(toplam); // 624000032







    }

}