package pratik;

import java.util.HashMap;
import java.util.Scanner;

public class OdevHashMap {

    public static void main(String[] args) {
        recurringLetters();
    }


    public static void recurringLetters(){
        Scanner scan=new Scanner(System.in);

        String str=scan.nextLine();
        // String str="Hello Henry!";
        //önce özel karakterleri sileriz
        str=str.replaceAll("\\p{Punct}", "").replaceAll(" ","");


        //aralarından bölüp array haline getirdik
        String letters[]=str.split("");

        //harflerin tekrarının da sayısal karşılığı olacağı için boş hashmap oluştururuz.
        HashMap<String, Integer> occMap = new HashMap<>();

        //arraylerde map'te var mı diye kontrol edecek loopu oluştururuz. (for each)

        for (String w: letters) {
            // kaç defa döndüğünü bir sepete eklemek için int sepeti oluşturur map içinden bakarız
            Integer numOccurance = occMap.get(w);
            if (numOccurance == null) { //tekrar sayısı sepeti sepet boş ise
                occMap.put(w, 1); //letters'ı w'ye ekle 1'i karşısına ata
            } else { // tekrar sayısı sepetinde var ise
                occMap.replace(w, numOccurance + 1); //occ map'ine ekle ve tekrar sayısı sepetini bir arttır)
                //
            }
        }
        System.out.println(occMap);


        }








    }






