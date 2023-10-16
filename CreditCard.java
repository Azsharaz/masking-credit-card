package creditcard;

import java.util.Scanner;

public class CreditCard {

    public static void main(String[] args) {
        /* * Ask user his/her Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)


(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”)

Input :

John White 1234234534561478

Output :

Name : J*** W****

CCN  : **** **** **** 1478

         */

        String specialCharacters = "!@#$%^&*()_+[]{}|;':,.<>?";
        boolean finish = true;

        do {
            System.out.println("Please enter your name, surname and credit card");
            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            String surname = scan.nextLine();
            String creditCard = scan.nextLine().trim().replaceAll("\\s", "");

            String EditedName = name.substring(0, 1).toUpperCase() + name.substring(1).replaceAll("[a-zA-Z]", "*");
            String EditedSurname = surname.substring(0, 1).toUpperCase() + surname.substring(1).replaceAll("[a-zA-Z]", "*");
            String EditedCard = creditCard.substring(0, 12).replaceAll("[0-9]", "*")+ " " +creditCard.substring(12);


            if (creditCard.length() < 16 || creditCard.contains(specialCharacters)) {
                System.out.println("Please enter a valid card number.");
            } else {
                System.out.println("Name: " + EditedName + " " + EditedSurname + "\nCCN: " + EditedCard);
            }


        } while (finish);


    }
}
