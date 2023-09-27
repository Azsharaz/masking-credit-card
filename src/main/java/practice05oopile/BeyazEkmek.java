package practice05oopile;

public abstract class BeyazEkmek implements Ekmek {


    // INTERFACE'I CLASS'A IMPLEMENT EDERSEK OVERRIDE ETMEMIZ GEREKIR
    @Override
    public void un() {

        System.out.println("Beyaz ekmek %59 un içerir");
    }

    @Override
    public void su() {
        System.out.println("Somun ekmek %38 su içerir");

    }

    @Override
    public void maya() {
        System.out.println("Beyaz ekmek %1.5 maya içerir");


    }

    @Override
    public void tuz() {

    }
    public abstract void sekil();

}
