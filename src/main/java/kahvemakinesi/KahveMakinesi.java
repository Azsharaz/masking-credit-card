package kahvemakinesi;

import java.util.Scanner;
public class KahveMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kahve turkKahvesi = new Kahve("Türk Kahvesi");
        Kahve filtreKahve = new Kahve("Filtre Kahve");
        Kahve espresso = new Kahve("Espresso");
        // kulanıcıya kahve seçimini söyle
        System.out.println("Hangi kahveyi istersiniz?");
        System.out.println("1. " + turkKahvesi.getAd());
        System.out.println("2. " + filtreKahve.getAd());
        System.out.println("3. " + espresso.getAd());
        int secim = scanner.nextInt();
        scanner.nextLine(); // Dummy kod.
        Kahve secilenKahve = null;
        switch (secim) {
            case 1:
                secilenKahve = turkKahvesi;
                break;
            case 2:
                secilenKahve = filtreKahve;
                break;
            case 3:
                secilenKahve = espresso;
                break;
            default:
                System.out.println("Geçersiz Seçim");
                scanner.close();
        }
        // sipariş Oluşturma
        Siparis siparis = new Siparis(secilenKahve);
        //süt ekleme
        System.out.println("Süt eklenmesini istermisiniz? (Evet/Hayır): ");
        String sutCevap = scanner.nextLine();
        if (sutCevap.equalsIgnoreCase("Evet")) {
            siparis.setSutEkli(true);
        }
        //şeker ekleme
        System.out.println("Şeker eklenmesini istermisiniz? (Evet/Hayır): ");
        String sekerCevap = scanner.nextLine();
        if (sekerCevap.equalsIgnoreCase("Evet")) {
            siparis.setSekerEkli(true);
            System.out.println("Kaç şeker olsun? ");
            int sekerMiktari = scanner.nextInt();
            scanner.nextLine();
            siparis.setSekerMiktarı(sekerMiktari);
        }
        //kahve boyutu
        System.out.println("Hangi boyutda olsun) (Büyük Boy/Orta Boy/Küçük Boy");
        String boyutCevap = scanner.nextLine();
        siparis.setBoyut(boyutCevap);
        siparis.hazirla();
        scanner.close();
    }
}