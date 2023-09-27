package day24enum_iterator_lambda;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {

    /*
     1) Iterator'lar loop ların yaptığı aynı işi yapar
     2) Iterator'larda sonsuz loop oluşma ihtimali yoktur
     3) Iterator'lar ile looplar arasında performans farkı yoktur
     4) Iterator'lar bir collection eleman silme ve bir coollection daki elemanı değiştirme konusunda daha başarılıdır
     5)İki tip Iterator vardır;
    a) Iterator:
        Sadece eleman silmede kullanılır, eleman eklemek veya elemanı değiştirmek mümkün değildir.

    b) ListIterator:
        Eleman silebilir, ekleyebilir ve değiştirebilir

      Note==>
        Interator sadece soldan sağa ( ilk eleman son elemana) çalışır
        ListIterator iki yönlü çalışabilir
 */


    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Fatma");
        myList.add("Mustafa");
        System.out.println(myList);//[Tom, Jim, Clara, Fatma, Mustafa]


        //specific bir elemani iterator ile nasil silebiliriz?

        // Iterator'a dönüştürdük
        Iterator<String> myItr = myList.iterator();//[ Tom,     Jim,    Clara,   Fatma,  Mustafa]

        while (myItr.hasNext()) { //hasNext() pointer a senden sonra eleman varmi diye sorar, eleman varsa true ya da false return eder

            String el = myItr.next();//next() pointer i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder
            if (el.equals("Tom")) {
                myItr.remove();  //remove() methodu next() methodunun return ettigi elemani siler
            }

        }
        System.out.println(myList);



        //ListIterator
        List<String> yourList = new ArrayList<>();
        yourList.add("Ali");
        yourList.add("Can");
        yourList.add("Aliye");
        System.out.println(yourList);//[Ali, Can, Aliye]

        //List Iterator'a dönüştürdük
        ListIterator<String> yourListItr = yourList.listIterator();//[  Ali,     Can,    Aliye]

        while (yourListItr.hasNext()) {

            String el = yourListItr.next();
            yourListItr.set(el + "*");
        }
        System.out.println(yourList);


        // tersten nasıl çalışırız?
        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);//[Ali, Can, Aliye]

        ListIterator<String> listItr2=list3.listIterator();
        //List Iterator'a dönüştürdük

        while(listItr2.hasNext()){ // Önce son elemana kadar gideriz
            listItr2.next();
        }

        while(listItr2.hasPrevious()){ // sondan previous(); ile geri döneriz
            String el=listItr2.previous();
            System.out.println(el+"<--");
        }

        // CORE JAVA BİTİŞİ






    }
}