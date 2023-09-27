package day04scannerincrementdecrementifstatements;

public class IncrementDecrement {

    public static void main(String[] args) {

        // Increase - Decrease

        // Increment :
        int a=5;
        System.out.println(a);

        a= a+2; //7 oldu
        System.out.println(a);

        // Kısayolu
        a+=2; //9
        System.out.println(a);

        //Decrement
        int c=8;

        c=c-3; //5 oldu

        c-=2; //2 oldu

        // Increment 2

        int d=6;

        d=d*2;

        d*=2;  // --> BUNU KULLAN

        // 1 ile increment
        int f=9;

        f++;

        System.out.println(f);

        //1 ile decrement

        int h=9;
        h--;

        System.out.println(h);

        // POST/PRE INCREMENT

        int i=10;
        int k=i++;            //POST INCREMENT

        System.out.println(i); //11
        System.out.println(k); //10

        int m=15;
        int n=++m;           //PRE INCREMENT

        System.out.println(m); //15
        System.out.println(n); //16

        //Ornek

        int p = 17;
        int r = p--;

        System.out.println(p);
        System.out.println(r);

        int s = 20;
        int t = --s;

        System.out.println(s);
        System.out.println(t);











    }
}
