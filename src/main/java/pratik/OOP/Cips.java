package pratik.OOP;

import day14constructorsdatetime.DateTime;

public class Cips extends AburCubur {

    String tuzOranı, yagOranı;


    @Override
    protected void uretim() {
        System.out.println("");
    }

    public Cips(String wrapping, String type, String countryofOrigin, double price, String expireDate, String tuzOranı, String yagOranı) {
        super(wrapping, type, countryofOrigin, price, expireDate);
        this.tuzOranı = tuzOranı;
        this.yagOranı = yagOranı;












    }
}







