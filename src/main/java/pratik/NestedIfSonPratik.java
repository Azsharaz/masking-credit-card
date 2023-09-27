package pratik;

import java.util.Scanner;

public class NestedIfSonPratik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        Kullanıcıdan satın almak istediği paketi sorunuz. (1. premium üyelik gym, 2. normal üyelik)
        kullanıcıdan yanında diyetisyen desteği isteyip istemediğini sorunuz. (evet/hayır)

        Premium üyelik normal=1500 tl------ diyetisyenli 2000 tl
        normal üyelik 750 tl ------- diyetisyenli 1250 tl


         */


        System.out.println("Lütfen istediğiniz üyelik tipini yazınız. (Premium veya Normal)");

        String Membership = scan.next();

        System.out.println("Diyetisyen desteği ister misiniz?");

        String Support = scan.next();

        int price = 0;

if (Membership.equalsIgnoreCase("Premium")){
    if(Support.equalsIgnoreCase("Hayır")){
        price=1500;
    }else if (Support.equalsIgnoreCase("Evet")){
        price=2000;
    }
    System.out.println("Paket fiyatınız "+price+ " TL'dir.");
}else if (Membership.equalsIgnoreCase("normal")){
    if (Support.equalsIgnoreCase("evet")){
        price=1250;
    }else if (Support.equalsIgnoreCase("hayır")){
        price=750;
    }
    System.out.println("Paket fiyatınız "+price+" TL'dir.");
}else{
    System.out.println("hatalı giriş.");
}


    }
}




