package day12arraylist;


import java.util.ArrayList;
import java.util.List;

    public class ArrayList03 {
        public static void main(String[] args) {
                   //     ADVANCED INTERVIEW SORUSU // !!
            //Example : Bir tane Integer List olusturunuz
            //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
            //           [12, 23, 10, 19] ==> 12 and 10


            List<Integer> nums = new ArrayList<>();
            nums.add(12);
            nums.add(23);
            nums.add(10);
            nums.add(19);

            // Array'leri sort yaparken ArrayList.sort();
            // EN YAKINLARI BULMAK İÇİN ÖNCELİKLE Collections.sort(); METHODUYLA SIRAYA KOYARIZ.
            // YENİ BİR VARIABLE OLUŞTURURUZ -->> minDiff
            // MİNİMUMU BULMAK İÇİN Math.min classı >> minimum farkı bulduk ama bunu veren sayıları bulmadık henüz



            // 1. indexteki sayıyı getir dedik. 0. index'teki sayıyı al ve farkını ver. (0 koyamayız fark olmaz)
            int minDiff= nums.get(1)-nums.get(0);

            // En küçük farkın (minDiff'i) buluyoruz. Loop açarız çünkü sürekli iki sayı arasındaki farka bakacağız.
                                 // Index olduğu için for i <<

            for (int i = 1; i < nums.size(); i++) {       // 1. indexten başla bitişine kadar. <= olursa
                // sort yapınca kücükten büyüğe -->> en küçükle bir sonrakini alacağız.
                // 0. index'te zaten en küçüğü var. 0-1 yaparsak -1. index diye bir şey olmadığı için 1'den başlatırız.


                minDiff=Math.min(minDiff,nums.get(i)-nums.get(i-1))   ;
                //

            }
            System.out.println(minDiff);


            // en kucuk farki bulduk, bu minDiffi hangi iki sayidan elde ettigimiz buluyoruz

            for (int i = 1;    i <nums.size() ;    i++) {  //
                if(nums.get(i)-nums.get(i-1) ==minDiff){
                    System.out.println(nums.get(i) +" ve "+ nums.get(i-1));
                }
            }










        }
    }

