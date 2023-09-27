package day14constructorsdatetime;

public class Car {

    /* Constructor nedir?
     Classtan obje oluşturmamızı sağlayan kod bloklarıdır.
     Class oluşturduğumuzda java bize otomatik bir constructor verir. Ama bu constructor gözle görülmez
     Gözle görülmeyen, otomatik olarak java tarafından verilen bu contructorlara default constructor deniz.
     default constructor==> Car(){}

     siz kendi constructorınızı oluşturduğunuz zaman java default'u siler.

     Constructor nasıl oluşturulur?
     Access Modifier + Class ismi + () + {}

     INTERVIEW SORUSU
     METHOD ILE CONSTRUCTOR ARASINDAKI FARK NEDIR
     1) METHODLARDA RETURN TYPE OLUR (VOID, INT), constructorlarda olmaz.
     2) Methodlar yaptıkları işe göre isimlendirilirler, constructorlar ise her zaman CLass ismi ile isimlendirilirler.
     3) Methodlar bir aksiyon yapmak için oluşturulur,  constructorlar ise object oluşturmak içindir.
     4) Method isimleri küçük harfle başlar, constructor isimleri ise class ismi ile aynı olduğundan büyük harfle başlar.

     Parametreli constructorlar oluşturarak aynı classtan farkı özelliklere sahip objectler oluşturabiliriz.

    */


    //Variable lar olusturalim
    String make = "Honda";
    String model = "Accord";
    int year =2023;
    boolean hybrid=true;


    // DINAMIK CONSTRUCTOR
    public Car(String make, String model, int year, boolean hybrid){
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;
    }

    public Car(){

    }

    // Ikı parametreli
    public Car(String make, String model){
        this.make=make;
        this.model=model;
    }


    //Method lar olusturalim
    public void hareket(){
        System.out.println("Honda hizli hareket eder");
    }
    public void dur(){
        System.out.println("Honda guvenli bir sekilde durur");
    }



    // Class içinde sağ tık->Generate->toString();->Hepsi seçili okay
    // Hepsini sout yapmasını sağlar
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }


    // Sağ tık, Constructor,seç, okay
    public Car(String make, boolean hybrid) {
        this.make = make;
        this.hybrid = hybrid;
    }
}





