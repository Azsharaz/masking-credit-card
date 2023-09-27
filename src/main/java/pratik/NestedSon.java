package pratik;

import java.util.Scanner;

public class NestedSon {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*
        Bir restoranın menüsünde hamburgerler, pizza ve sandviçler bulunmaktadır.
        Kullanıcıdan bir seçenek (1: Hamburger, 2: Pizza, 3: Sandviç)
        ve ekstra malzeme isteyip istemediği (Evet/Hayır) bilgisini isteyen bir Java programı yazınız.
        Kullanıcıdan alınan bilgilere göre seçilen yemeği ve ekstra malzeme isteğini yazdıran programı yazınız.
         */


        System.out.println("Lütfen seçiminizi belirtiniz. (1. Hamburger, 2. Pizza, 3. Sandviç)");
        int yemek= scan.nextInt();
        System.out.println("Ekstra malzeme ister misiniz? (Evet/Hayır)");
        String Malzeme= scan.next();

        if (yemek==1){
            System.out.println("Seçim: Hamburger");
        } else if (yemek==2) {
            System.out.println("Seçim: Pizza");
        } else if (yemek==3) {
            System.out.println("Seçim: Sandviç");
        }else{
            System.out.println("Lütfen geçerli bir giriş yapınız.");
        }
        if (Malzeme.equalsIgnoreCase("evet")){
            System.out.println("Ekstra malzeme eklendi.");
        }else if (Malzeme.equalsIgnoreCase("Hayır")){
            System.out.println("Ekstra malzeme istenmedi");
        }else{
            System.out.println("Hatalı seçim yaptınız.");
        }


    }
}
