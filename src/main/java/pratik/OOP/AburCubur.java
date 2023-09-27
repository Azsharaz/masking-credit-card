package pratik.OOP;

import day14constructorsdatetime.DateTime;

import java.time.format.DateTimeFormatter;

public class AburCubur {

    // inheritance kullanmak istersek   1)extends 2)override 3)constructor çağırma 4) super ve this
    // encapsulation kullanmak istersek 1) private 2)getter setter
    // abstraction kullanmak istersek   1)interface 2)unutmamak için uyarmak amaçlı (to do list)
    // polymorphism kullanmak istersek  1) override ettiğimiz datayı değiştirmek, overloading


    String wrapping, type, countryofOrigin;
    double price;
    String expireDate;


    public AburCubur(String wrapping, String type, String countryofOrigin, double price, String expireDate) {
        this.wrapping = wrapping;
        this.type = type;
        this.countryofOrigin = countryofOrigin;
        this.price = price;
        this.expireDate = expireDate;
    }

    protected void uretim(){
        System.out.println("Üretime başlandı.");
    }

    protected void paketlemeVeYukleme(){
        System.out.println("Paketleme ve sevkiyat için yükleme başladı");
    }

    protected void sevkiyat(){
        System.out.println("Sevkiyat basladı");
    }














}
