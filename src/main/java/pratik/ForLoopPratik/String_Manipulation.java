package pratik.ForLoopPratik;

import java.util.Scanner;

public class String_Manipulation {
    public static void main(String[] args) {
        // bir string ifadedeki tüm harfleri tekrarsız şekilde yazdırın

        String givenString = "bence java çok güzül";
        String clearString = "";

        for (int i = 0; i < givenString.length() ; i++) {

            char characters=givenString.charAt(i);

            if (givenString.indexOf(characters)==givenString.lastIndexOf(characters)){
            clearString=clearString+characters;
            }
    }
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime yazın");
        String kelime = scan.nextLine();
        String tekrarsızHarf = "";

        for (int i = 0; i < kelime.length(); i++) {
            char karakter = kelime.charAt(i);
            // Karakter kelimenin başka bir yerinde tekrar ediyor mu kontrol et
            if (kelime.indexOf(karakter) == kelime.lastIndexOf(karakter)) {
                tekrarsızHarf = tekrarsızHarf + karakter;
            } else {
                tekrarsızHarf = tekrarsızHarf + kelime.charAt(0); // İlk karakteri kullan
            }
        }
        System.out.println(tekrarsızHarf);



}
}