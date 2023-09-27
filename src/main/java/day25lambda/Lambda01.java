package day25lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(12, 9, 131, 14, 9, 10, 4, 12, 15));

        printEvenElements2(nums);
    }

    //1) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran(void)
    // method'u olusturunuz.(Structured-eski usül)

    // Structured - eski usül
    public static void printEvenElements1(List<Integer> nums) {
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.println(w + " ");
            }


        }

    }

    //1) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran(void)
    // method'u olusturunuz.(functional-lambda)
    public static void printEvenElements2(List<Integer> nums) {
        //  nums.stream().filter(t->t%2==0).forEach(t-> System.out.println(t+" ")); best practice değildir
        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.println(t + " ")); //daha okunur


    }

    //1) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran(void)
    // method'u olusturunuz.(functional-lambda)
    public static void printSquareOfOddNumbers(List<Integer> nums) {

        //2) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda  aralarina
        // bosluk koyarak yazdiran method'u olusturunuz.(Functional)

        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.println(t + " "));

        //3) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina
        // bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    }

    public static void printCubeOfDistinctOddElements(List<Integer> nums) {

        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));
    }


    // Lambda'da distinct(); gibi veri işleyişinde yükü azaltacak methodları başa ekleriz.

    //4)Bir list'teki "tekrarsiz" "CIFT " ELEMANLARIN "karelerinin" "toplamını"
    // hesaplayan method oluşturun

    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums) {
        int sum = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u); //identity'e yapacağımız işlemde etkisiz elemanı koyarız. toplamada 0 çarpmada 1
        // t -- identity olur u da stream'den gelir

    }

    //5) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin" "çarpımını"
    // hesaplayan bir method oluşturun

    public static void printProductOfSquaresOfDistinctOddElements(List<Integer> nums) {
        int product = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(1, (t, u) -> t * u);
        System.out.println(product);
    }


    //6)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun
    //1. yol
    public static void getMaxValue1(List<Integer> nums) {
        int max = nums.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);
    }


    //2. yol

    public static void
    getMaxValue2(List<Integer> nums) {
        int max = nums.
                stream().
                distinct().
                reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    //3. yol
    public static void getMaxValue3(List<Integer> nums) {
        Integer max = nums.stream().distinct().sorted().reduce((t, u) -> u).get();
        System.out.println(max);
    }

    //4. yol
    public static void getMaxValue4(List<Integer> nums) {
        Integer max = nums.
                stream().
                distinct().
                sorted().
                reduce(Math::max).
                get();
        System.out.println(max);
    }

    //7)Verilen List'teki "minimum değeri" bulmak için bir method oluşturun
    //1. yol
    public static void getMinValue1(List<Integer> nums) {

        Integer min = nums.
                stream().
                distinct().
                reduce((t, u) -> t > u ? u : t).
                get();
        System.out.println(min);
    }

    //2. yol
    public static void getMinValue2(List<Integer> nums) {

        Integer min = nums.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                reduce((t, u) -> u).
                get();
        System.out.println(min);
    }

    //3. yol
    public static void getMinValue3(List<Integer> nums) {

        Integer min = nums.
                stream().
                distinct().sorted().
                reduce((t, u) -> t).
                get();
        System.out.println(min);
    }

    //4. yol . Math.min methodu ile
    public static void getMinValue4(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct().
                reduce((t, u) -> Math.min(t, u)).
                get();
        System.out.println(min);
    }

          //8)Verilen List'ten 7 den buyuk en kucuk cift sayi yi bulmak için bir method oluşturun
         // 12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi
        public static void getMinGreaterThanSevenEven(List<Integer> nums) {
        Integer min = nums.
                stream().
                filter(t -> t > 7 && t % 2 == 0).
                sorted().
                findFirst().
                get(); //Stream'lerde .reduce(); methodunun identity'siz halini kullanırsak optional return eder.
            // .get(); ile görebiliriz.
        System.out.println(min);
    }








}
