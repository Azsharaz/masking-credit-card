package day13methodcreation_methodoverloading_varargs_passbyvalue;

import java.util.Scanner;

public class Varargs {

    public static void main(String[] args) {


        int sum = toplamaYap(1, 2, 3, 4, 5, 6, 7);
        System.out.println("sum = " + sum);




    } // main method end


        // SORU- Toplama işlemi yapan method yazınız.

    public static int toplama(int a, int b) {
        return a + b;
    }
    // javada farklı sayıdaki parametrelerin hepsini kabul eden bir yapı vardır
    // bu yapıya "Varargs" diyoruz
    // Varargs arka planda Array yapısını kullanır.

    public static int toplamaYap(int... a) {  // ( int a..., int...b) hep a kullanılacak, b'ye sıra gelmeyecek.
                                                // b burada hata verir, unused kod çünkü
        //Array varmış gibi düşünüp yazarız.
        int sum = 0; // toplama --> etkisiz eleman
        for (int w : a) {   // for each loopu kullanırız çünkü condition yok. sonsuz loop conditionsız --> (w<10 gibi)
            sum = sum + w;
        }

          return sum; // bunu yazmayı unutma, methoda return etmen gerek
    }

    // 1) Bir method parantezinde birden fazla Varargs kullanılmaz. (çünkü ilki dolmaz)
    // 2) Bir method parantezinde birden fazla parametre kullanılacaksa Varargs en sonda olmalıdır!
    // 3) Object kullanarak hem string hem varargs ile method create edebiliriz.
    // 4) Bir Varargs'ta aynı tip datalar olmalı.


























} // class end
