package pratik;

public class Flags {

    /* Flag variable is used as a signal in programming to let the program know that a certain condition has met.
     It usually acts as a boolean variable indicating a condition to be either true or false.
Example 1: Check if an array has any even number.

Input : arr[] = {1, 3, 7, 5}
Output : No All numbers are odd.

 Input : arr[] = {1, 2, 7, 5}
Output : Yes There is one even number in the array.

We initialize a flag variable as false, then traverse the array.
As soon as we find an even element, we set flag as true and break the loop. Finally we return flag.

     */


    //Java program to check if given array has any even number
    boolean checkIfAnyEven(int arr[], int n) {
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String args[]) {
        Flags obj = new Flags();
        int arr[] = {1, 3, 2, 5, 6, 7};
        int n = arr.length;
        if (obj.checkIfAnyEven(arr, n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }



   /* Java'da "flag" terimi genellikle belirli bir durumu veya koşulu temsil etmek için kullanılan bir değişkeni ifade eder.
   Bu tür bir değişken, programın belirli bir noktasında kontrol etmek,
   bir şartı yerine getirmek veya bir işlemi etkinleştirmek veya devre dışı bırakmak için kullanılabilir.
   Flag'lar, programlarınızın mantığını kontrol etmek ve belirli koşullara göre farklı davranışlar sergilemek için oldukça yaygın
   olarak kullanılır.*/

    // Örneğin, aşağıdaki Java kod örneği, bir "flag" değişkeni kullanarak bir döngünün çalışma süresini kontrol etmektedir:


        boolean flag = true; // Bir flag değişkeni oluşturuldu ve true değeri atandı.
        int a = 0;
        int b = 1;

        while (flag) {
            // Döngü içinde belirli bir işlem yapılır.
            System.out.println("Döngü çalışıyor...");

            // Belirli bir koşulu kontrol eder ve flag'i değiştirir.
            if (a>b/* belirli bir koşul */) {
                flag = false; // Koşul sağlandığında flag değeri false olarak değiştirilir.
            }
        }

        System.out.println("Döngü sona erdi.");

    }


}
