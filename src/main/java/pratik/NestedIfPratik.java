package pratik;

import java.util.Scanner;

public class NestedIfPratik {
    public static void main(String[] args) {

        System.out.println("yapmak istediğiniz işlemi yazınız");
        Scanner islem=new Scanner(System.in);
        double num1= islem.nextDouble();
        char op=islem.next().charAt(0);
        double num2=islem.nextDouble();

       if (op=='+')
            System.out.println((int)(num1+num2));
       else if (op=='-')
            System.out.println((int)(num1-num2));
       else if (op=='/')
            System.out.println(num1/num2);
       else if (op=='*')
           System.out.println(num1*num2);




    }

}
