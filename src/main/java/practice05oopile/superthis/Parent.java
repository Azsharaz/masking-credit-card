package practice05oopile.superthis;

public class Parent {

    // Parent isminde bir class olusturunuz
    // Child class'ı, Parent class'a extends ediniz
    // Child class'da parametresiz, tek parametreli ve iki parametreli obje olusturunuz.
    // super() constructor'u kullanarak Parent' den ekran cıktısı alınız


    public Parent() {
        System.out.println("Parent class parametresiz constructor");
    }


    public Parent(int a) {
        System.out.println("Parent class tek parametreli constructor");

    }

    public Parent(int a, int b) {
        this(); // çağırıldığında bu classtaki parametresiz constructora git demek
        System.out.println("Parent class 2 parametreli constructor");

    }


}
