package day06switchyernarystring;

public class StringManipulations02 {

    public static void main(String[] args) {

        String s = "Learn Java earn 12345 money";

        //Ornek 1: "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz.

        String s1=s.replace("money","dollar");
        System.out.println(s1); // Learn Java earn dollar



        //Ornek 2: "s" String'indeki tum "e" harflerini siliniz

        String s2=s.replace("e","");
        System.out.println(s2); // Larn Java arn mony


        //Ornek 3
        String s3=s.replaceAll("[0-3]","*");
        System.out.println(s3); // Learn Java earn ***45 money


        //Ornek 4 //örnek 4: "s" String'indeki rakam sayisini bulunuz.

        int num=s.replaceAll("[^0-9]","").length();

        System.out.println(num);






    }
}
