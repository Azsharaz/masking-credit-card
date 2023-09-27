package practice05oopile;

public class C02Encapsulation {



    //Ali, Can, 25 ozelliklerine sahip bir obje olusturunuzz ve yazdırınız
    //objenin yasını 30 olarak guncelleyin
    //parametresiz cons kullanarak 2. bir obje olusturun
    //Ayse, Yilmaz, 40 degerlerini atayın
    //yas ı -5 olarak guncelleyin
    //yas negatif deger alamayacak sekilde set methodunu guncelleyin
    //isim kucuk harfle baslamayacak sekilde set methodunu guncelleyin
    //isim kucuk harfle baslamayacak sekilde parametreli constructoru guncelleyin

    public static void main(String[] args) {

        C01Encapsulation obj1=new C01Encapsulation("Ali", "Can",25);
        System.out.println(obj1.getIsim());      // Ali
        System.out.println(obj1.getSoyisim()); // Can
        System.out.println(obj1.getYas()); // 25
        System.out.println(obj1); // C01Encapsulation{isim='Ali', soyisim='Can', yas=25}

        //objenin yasını 30 olarak guncelleyin
        obj1.setYas(30);
        System.out.println(obj1.getYas());

        //parametresiz cons kullanarak 2. bir obje olusturun
        C01Encapsulation obj2=new C01Encapsulation();
        System.out.println(obj2); // C01Encapsulation{isim='null', soyisim='null', yas=0}

        //Ayse, Yilmaz, 40 degerlerini atayın
        obj2.setYas(40);
        obj2.setIsim("Ayşe");
        obj2.setSoyisim("Yılmaz");
        System.out.println(obj2); // C01Encapsulation{isim='Ayşe', soyisim='Yılmaz', yas=40}

        //yaşı -5 olarak guncelleyin

        obj2.setYas(-5);
        System.out.println(obj2.getYas());
        System.out.println(obj2);

        //yas negatif deger alamayacak sekilde set methodunu guncelleyin

        System.out.println(obj2);

        //isim kucuk harfle baslamayacak sekilde set methodunu guncelleyin

        obj2.setIsim("ayşe");




        //isim kucuk harfle baslamayacak sekilde parametreli constructoru guncelleyin
              // C01'E GIDERİZ




    }



}
