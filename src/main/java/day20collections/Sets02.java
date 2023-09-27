package day20collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {

        //Example 1: Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz.

        long t1=System.nanoTime();
        HashSet<String> emailsHs=new HashSet<>();
        // Hash set'ler daha hızlı olduğu için önce hash ile oluştur
        emailsHs.add("k@gmail.com");
        emailsHs.add("a@gmail.com");
        emailsHs.add("l@gmail.com");
        emailsHs.add("z@gmail.com");
        emailsHs.add("m@gmail.com");
        emailsHs.add("b@gmail.com");
        System.out.println(emailsHs);

        long t2=System.nanoTime();

        // sonra sort etmek için tree set içine koy
        TreeSet<String> emailsTs=new TreeSet<>(emailsHs);
        System.out.println(emailsTs);

        long t3=System.nanoTime();

        System.out.println(t2-t1); // hash setin çalışma süresi --> 225600
        System.out.println(t3-t2); // treeset'in çalışma süresi --> 1215400







    }
}
