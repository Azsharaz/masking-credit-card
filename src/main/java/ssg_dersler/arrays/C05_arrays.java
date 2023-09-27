package ssg_dersler.arrays;

public class C05_arrays {
    public static void main(String[] args) {
         /*
        6.Soru -Verilen String bir array'de en uzun
        ve en kisa String'leri yazdıran bir method olusturun
        */
        String isimler[]={"Selma","Ahmet","Çiğdem","Ayten","Zafer","Sila","Rumeysa"};
        enUzunVeEnKisa(isimler);
    }

    private static void enUzunVeEnKisa(String[] isimler) {
        String max=isimler[0];
        String min=isimler[0];
        for (String w:isimler
             ) {
            if (max.length()<w.length()){
                max=w;
            }
            if (min.length()>w.length()){
                min=w;
            }
        }
        System.out.println("en kisa String : "+min);
        System.out.println("en uzun String : "+max);


    }
}
