package practice05oopile.superthis;

public class Child extends Parent {

    // Child class'da parametresiz, tek parametreli ve iki parametreli obje olusturunuz.
    public Child() {
        super();  // constructorların ilk satırında her zaman super yazar
        // bu constructor
        System.out.println("Child class parametresiz constructor");
    }


    public Child(int a) {
        super(2);
        System.out.println("Child class tek parametreli constructor");

    }

    public Child(int a, int b) {

        System.out.println("Child class 2 parametreli constructor");

    }


    public static void main(String[] args) {

        // Bir classta statik blok varsa ilk o çalışır, yoksa main method çalışır


        // Child obje1=new Child(); //Parent class parametresiz constructor
        // Parent class parametresiz constructor

        // Child obje1=new Child(a); //Parent class tek parametreli constructor
        // Parent class tek parametreli constructor

        // this(); kullanarak (içine de parametre yazarak) bulundupğumuz classtan method çağırırız.
        // super() kullanarak (içine de parametre yazarak) Parent'dan method çağırırız.
        Child obje1 = new Child(2, 3);

        //Parent class parametresiz constructor;
        //parent'da this(); dediğimiz için ekstradan 1 tane daha geldi
        //Parent class 2 parametreli constructor
        // Child class 2 parametreli constructor


    }

}
