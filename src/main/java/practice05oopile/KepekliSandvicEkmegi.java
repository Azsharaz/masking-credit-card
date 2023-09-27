package practice05oopile;

import day16staticoop.InstanceRunner;
import day18oop.Animal;

public class KepekliSandvicEkmegi extends  KepekliEkmek{

    // kepekli ekmek özelliği taşır ama farklı özellikleri de vardır



    @Override
    public void kepek() {

    }

    @Override
    public void sekil() {
        // super.sekil(); ----> override ile gelen parentın özelliği olan super.sekil()'i sileriz ve kendi özelliğimizi ekleriz
        System.out.println("Kepekli sandvic ekmegi ince uzundur");






    }
}
