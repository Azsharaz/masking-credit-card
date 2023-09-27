package day07stringmanipulations;

public class StringManipulation02 {

    public static void main(String[] args) {

        // DEV VE TESTER ORTAK SORU
        //Example 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //    String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv = "$456.99";
        String laptop = "$875.99";

        String newTv=tv.replace("[$]","");
        String newlaptop=laptop.replace("[$]","");

       Double sum= Double.valueOf(newTv)+Double.valueOf(newlaptop); // Dolar işaretinden dolayı hata verdi
                                                            // O yüzden yukarıda replace all ile sildik.
        System.out.println(sum);



        // Example 2: Verilen ismin-soyisimde ilk ismin ilk harfini ve soyisminin ilk harfini ekrana yazdırınız
        //  "    ali cAN    "= AC

        // TRIM METHODU
        // BİR STRINGIN BAS VE SONUNDAKI SPACE KARAKTERLERINI SILER, ORTADAKINI SILMEZ.

        String name="ali cAN";
        char first=name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char last=name.trim().toString().split(" ")[1].charAt(0);
                                    // Splitle 1'i ifade edince sağı alır.
                                      // 0 dersek de sol tarafı almaya başlar.
                                        // char.at(0) dersek de 0 --> ilk karakteri al demektir.

        System.out.println(first+last); // 132 dedi. Beklediğimiz AC yazdırmadı.
                                            // Çünkü charlar matematik işlemi görünce matematiksel işlemler yapar
                                                // Bunun için başına stringte yaptığımız gibi ""+ yapar devam ederiz=
        System.out.println(""+first+last);




        //Ornek : Bir string'in belirli bir karakterinden baslayarak belirli bir karaktere kadar tum
        //karakterleri dynamic olarak aliniz
        // abc@gmail.com ==> gmail
        // indexOf("") methodu ==> parantez içine yazılan karakterin ilk görünümünün ismini verir.

        String mail= "abc@gmail.com";
        System.out.println(mail.substring(4,9)); // gmail i aldık ama başka kullanıcı isminde bu çalışmaz.
        int startingIndex=mail.indexOf("@")+1;
        int endingIndex=mail.indexOf(".");
        String companyName=mail.substring(startingIndex, endingIndex);
        System.out.println("companyName = " + companyName); // @'den sonra .'ya kadar olan kısmın hepsini almış olduk.








    }
}
