package kahvemakinesi;

public class Siparis {
    private Kahve kahve;
    private boolean sutEkli;
    private boolean sekerEkli;
    private int sekerMiktarı;
    private String boyut;
    public Siparis(Kahve kahve) {
        this.kahve = kahve;
    }
    public void setSutEkli(boolean sutEkli) {
        this.sutEkli = sutEkli;
    }
    public void setSekerEkli(boolean sekerEkli) {
        this.sekerEkli = sekerEkli;
    }
    public void setSekerMiktarı(int sekerMiktarı) {
        this.sekerMiktarı = sekerMiktarı;
    }
    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }
    //kahvenin hazırlanması
    public void hazirla() {
        System.out.println(kahve.getAd() + boyut + "hazırlanıyor...");
        if (sutEkli) {
            System.out.println("Süt ekleniyor..");
        }
        if (sekerEkli) {
            System.out.println(sekerMiktarı + "şeker ekleniyor...");
        }
        System.out.println("Siparişiniz hazır! Afiyet Olsun");
    }
}
