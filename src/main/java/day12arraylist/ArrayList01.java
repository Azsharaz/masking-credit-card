package day12arraylist;

import java.util.ArrayList;

public class ArrayList01 {

    public static void main(String[] args) {

        ArrayList < Integer > ages = new ArrayList<>();

        // ArrayListlere eleman nasıl eklenir?

        ages.add(5);  // Arraylere insertion order ile ekleme yapılır --> Yani ekleme sırasına= göre sone gelir.
        ages.add(7);
        ages.add(19);

        ages.add(1,313); // 1. index'e 313'ü atar
        ages.add(3,777); // 3. index'e 777'yi atar

        System.out.println(ages); // (5, 313, 7, 777, 19, 999)

        ArrayList < Integer > newAges = new ArrayList<>();

        newAges.add(1);
        newAges.add(2);
        newAges.add(3);

        ages.addAll(newAges); // İki array listi birleştirme.
                              // Insertion order ile eklendiği için sona eklenir.

        System.out.println(ages); // (5, 313, 7, 777, 19, 999, 1, 2, 3)

                                 // add.All indexli yoluyla istediğimiz yere ekleyebiliriz.

        ages.addAll(0, newAges); // Başa almak için 0. indexe atadık.
        System.out.println(ages); // (1, 2, 3, 5, 313, 7, 777, 19, 999, 1, 2, 3)

        int numOfElement=ages.size();  // ArrayList içindeki eleman sayısı
        System.out.println(numOfElement);


        // --> get methodu kullanarak elde ettiğimiz datayı görünür kılmak için int sepetine ekledik.
        // böylece methodların return type'larına bir vurgu yaptık.
        int el=ages.get(2);     // Yazdığımız indexteki karakteri çağırır.
        System.out.println(el); //3



        // bazı methodlar bir şey yapar, görev yerine getirir. >> return etmez.
        ages.set(1,313);       // 1= bu konuma atayacağımız index,      313= atayacağımız karakter
        System.out.println(ages);   //yani (index,gelecek olan karakter)
        // set methoduna index girerek girmiş olduğumuz index'teki elemanı güncellemesini sağladık. return type'a ihtiyaç yoktur.
        // bu nedenle herhangi bir data type'ı (kavanoz, sepet) içerisinde store etmedik. (kavanoz, sepet açmadık)


        //Örnek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin.


        ArrayList < Integer > list = new ArrayList<>();

        list.add(23);
        list.add(24);
        list.add(12);
        list.add(9);
        list.add(3);
        System.out.println(list); // (23, 24, 12, 9, 3)



        // for each loop yapacağız, set methodunu kullanacağız.

        //[23, 24, 12, 9, 3]
        for (Integer w : list) {

            if (w % 2 != 0) {
                list.set(list.indexOf(w)  ,11);

            }
        }
        System.out.println(list);




    }




}
