package pratik;
import java.util.Scanner;
public class BMICalculator {

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Please enter your height.");
            double height=scan.nextDouble();


            System.out.println("Please enter your weight.");
            double weight=scan.nextDouble();

            double bmi;


            // Kullanıcı santimetre olarak boy girdiyse, bunu metreye çevir.
            if (height >= 3) {

                height = height / 100;
            }


              bmi = weight / (height * height);



            if (bmi<18.5 && bmi>1){
                       System.out.println("You are weak");
                   }else if (bmi>18.5 && bmi<20){
                       System.out.println("Your weight is ideal");
                   }else if (bmi>25 && bmi<30){
                       System.out.println("You are fat");
                   }else if (bmi>=30){
                       System.out.println("You are obese");
                   }else {
                System.out.println("Please enter valid values.");
            }






            }



  }


