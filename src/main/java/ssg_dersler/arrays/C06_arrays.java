package ssg_dersler.arrays;

import java.util.Arrays;

public class C06_arrays {
    public static void main(String[] args) {
        /*
        9.soru-Verilen bir array'e yeni bir element ekleyin
        */
        int arr[]={1,2,3,4,5,6,7,8,9,11,12,13,14,15};//10
        int sayi=10;
        int yeniArr[]=new int[arr.length+1];
        System.out.println(Arrays.toString(yeniArr));
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];
        }
        yeniArr[yeniArr.length-1]=sayi;
        System.out.println(Arrays.toString(yeniArr));
    }
}
