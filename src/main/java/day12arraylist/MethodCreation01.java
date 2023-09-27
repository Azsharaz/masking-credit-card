package day12arraylist;

public class MethodCreation01 {

    public static void main(String[] args) {


    /*
                                JAVA'DA METHOD NASIL OLUŞTURULUR?
          Access Modifier + return type +  Method ismi +         () +             {}
                public       static void       main         (String[] args)       {}


                               MAIN METHODUN DIŞINDA CLASS'IN İÇİNDE
                      >> Method'un method'u olmaz, class'ın methodu olur.


                      METHOD OLUŞTURMAK METHODU ÇALIŞTIRMAK İÇİN YETERLİ DEĞİLDİR.
  >>         MAIN METHOD İÇİNDEN ÇAĞIRILMASI GEREKİR ------>>>   method call
     */
        int sonuc= toplamaYap(13,12);   // method call yaptık
        System.out.println("sonuc = " + sonuc);


    }   // >> main method kapanışı >>


      // Ornek 1 :toplama islemi yapan bir method olusturunuz

       public static int  toplamaYap(int a, int b){

        return a+b;          // Methodun çağırıldığı yere çıkan değeri getir demek.

       }


















    }  // >> class kapanışı >>



