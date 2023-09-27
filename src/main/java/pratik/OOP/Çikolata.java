package pratik.OOP;

public class Çikolata extends AburCubur {


   String sekerOranı, unoranı, sutOranı;





    @Override
    public String toString() {
        return "Çikolata{" +
                "wrapping='" + wrapping + '\'' +
                ", type='" + type + '\'' +
                ", countryofOrigin='" + countryofOrigin + '\'' +
                ", price=" + price +
                ", expireDate='" + expireDate + '\'' + "sekerOranı='" + sekerOranı + '\'' +
                ", unoranı='" + unoranı + '\'' +
                ", sutOranı='" + sutOranı + '\'' +
                '}';

    }

    public Çikolata(String wrapping, String type, String countryofOrigin, double price, String expireDate, String sekerOranı, String unoranı, String sutOranı) {
        super(wrapping, type, countryofOrigin, price, expireDate);
        this.sekerOranı = sekerOranı;
        this.unoranı = unoranı;
        this.sutOranı = sutOranı;












    }
}



