package pratik.OOP;

import java.util.Arrays;

public class AburCuburRunner {

    // Burası ürünlerin nihai kullanıcıyla buluştuğu yer.
    // Ürünün satışının gerçekleştiği, ürünün aktif olarak rol aldığı kısım. Bu sebeple main içinde çalışmalı.


    public static void main(String[] args) {


        Çikolata cikolata=new Çikolata("seffaf","fındıklı","isvicre",15.00,"25.19.2024",
                "%30","%5","%25");
        //new Çikolata("seffaf","fındıklı","isvicre",15.00,"25.19.2024","%30","%5","%25");

        cikolata.uretim();
        System.out.println(cikolata);





    }


}
