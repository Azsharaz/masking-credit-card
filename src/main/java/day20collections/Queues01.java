package day20collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        // FIFO - First in first out --> İlk giren ilk çıkar
        Queue<String> depo=new LinkedList<>();
                                   //Constructor olarak queue interface olduğundan seçemeyiz.
                                //Priority Que veya Linkedlist seçebiliriz.

        depo.add("et");
        depo.add("süt");
        depo.add("yumurta");
        depo.add("peynir");
        System.out.println(depo); // [et, peynir, yumurta, süt]
        // Insertion order'a göre dizdik LINKEDLIST ile
        depo.remove(); // [peynir, süt, yumurta] --> ILK NODU SİLER
        System.out.println(depo);

        System.out.println(depo.peek()); // peynir --> SİLMEDEN İLK NODU VERİR
        System.out.println(depo); // [peynir, süt, yumurta]

        depo.clear(); // tüm nodeları temizler
        System.out.println(depo.poll()); // boş ise null verir ama HATA VERMEZ (SON ELEMAN)
       // System.out.println(depo.element()); // EXCEPTION ERROR verir
        System.out.println(depo.peek()); // boş ise null verir ama HATA VERMEZ (İLK ELEMAN)



        Queue<String> wareHouse=new PriorityQueue<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Egg");
        wareHouse.add("Orange");
        wareHouse.add("Tomato");
        System.out.println(wareHouse); // [Egg, Milk, Meat, Orange, Tomato]
        // Java kendi öncelik sırasına göre dizdi.





    }
}
