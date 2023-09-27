package practice05oopile;

public class C01Encapsulation {

    // -------------- DEPO CLASS  --------------

        /*
    bir class olusturun
    private access mod sahip variablelar olusturun: isim, soyisim, yas seklinde
    parametreli ve parametresiz constructor olusturun
    bu variablelara ait getter setter methodlarını olusturun
    toString methodunu olusturun
     */


    private String isim;
    private String soyisim;
    private int yas;

    public C01Encapsulation(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;
    }


    //eğer bir classta bir constructor oluşturursak default constructor devre dışı kalır.
    // bunun için paramatresiz bir constructor daha oluşturmak gerekir.
    // 1. parametresiz constructor

    public C01Encapsulation() {
    }


    // 2. parametresiz constructor
    public C01Encapsulation(String isim, String soyisim, int yas) { // sağ tık generate constructor

        // setIsim(isim); methodunu da kullanabiliriz.
        if (isim.charAt(0) >= 'A' && isim.charAt(0) <= 'Z') { //isim kucuk harfle baslamayacak sekilde set methodunu guncelleyin
            // charAt ASCII değerlere baktığı için operatorleri kullanabiliriz.
            this.isim = isim;
        } else {
            System.out.println("ilk harf küçük olamaz");
        }


        // setSoyisim(soyisim); methodunu da kullanabiliriz
        if (soyisim.charAt(0) >= 'A' && isim.charAt(0) <= 'Z') { //isim kucuk harfle baslamayacak sekilde set methodunu guncelleyin
            // charAt ASCII değerlere baktığı için operatorleri kullanabiliriz.
            this.soyisim = soyisim;
        } else {
            System.out.println("ilk harf küçük olamaz");
        }

        if (yas > 0)
            this.yas = yas;
        else
            System.out.println("Yaş değeri negatif olamaz!");

        //  setYas(yas); da kullanılabilir.
    }


    //3. getter setter methodları -- sağ tık generate getter and setter


    public String getIsim() { // getter getirir, bir şey return eder o yüzden return type'ı void değil
        return isim;
    }

    public void setIsim(String isim) {   // bir şey set eder o yüzden return type'ı void
        if (isim.charAt(0) >= 'A' && isim.charAt(0) <= 'Z') { //isim kucuk harfle baslamayacak sekilde set methodunu guncelleyin
            // charAt ASCII değerlere baktığı için operatorleri kullanabiliriz.
            this.isim = isim;
        } else {
            System.out.println("ilk harf küçük olamaz");
        }

    }


    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {         //yas negatif deger alamayacak sekilde set methodunu guncelleyin
        if (yas < 0) {
            System.out.println("yaş negatif değer olamaz");
        } else {
            this.yas = yas;
        }

    }


    //4. toString(); --> bunu yapmazsak referansını(adresi) gösterir

    @Override
    public String toString() {
        return "C01Encapsulation{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                '}';
    }
}
