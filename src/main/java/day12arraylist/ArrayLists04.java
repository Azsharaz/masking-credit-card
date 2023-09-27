package day12arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists04 {


    // Bir List oluştururken kısa yol
   // Arrays.asList() methodu

    List<Integer> list= Arrays.asList(1,3,5,9);


    // Ama bazı kısıtlamalar var >>
    //  .remove();
    //  .add();
    //  .clear(); methodları çalışmaz.

    // Eleman sayısını değiştiren methodlar KULLANILAMAZ !!!     LENGTH'i ve SIZE'ı değiştiremeyiz.
    // ELEMAN SAYISIYLA OYNAMADAN DİĞER METHODLAR KULLANILABİLİR. >>>
    //  .set();
    //  .size();

    // YANİ BAŞI SONU BELLİ DATALARDA ÇALIŞACAKSAK VE LIST'IN IMKANLARINFAN FAYDALANMAK ISTIYORSAK KULLANABILIRIZ.







}
