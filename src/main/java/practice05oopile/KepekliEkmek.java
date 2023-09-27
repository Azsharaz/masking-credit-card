package practice05oopile;

public class KepekliEkmek implements Ekmek {


    // INTERFACE'I CLASS'A IMPLEMENT EDERSEK OVERRIDE ETMEMIZ GEREKIR
    @Override
    public void un() {
        System.out.println("Kepekli ekmek %50 un içerir");
    }


    @Override
    public void su() {
        System.out.println("Kepekli ekmek %38 su içerir");

    }


    @Override
    public void tuz() {
        System.out.println("Kepekli ekmek %1,5 tuz içerir");

    }


    @Override
    public void maya() {
        System.out.println("Kepekli ekmek %1,5 maya içerir");

    }

    public void kepek() {
        System.out.println("Kepekli ekmek %9 kepek içerir");

    }

    public void sekil(){
        System.out.println("Kepekli ekmek yuvarlaktır");
    }






}
