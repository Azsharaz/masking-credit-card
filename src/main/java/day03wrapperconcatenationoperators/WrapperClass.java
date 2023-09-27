package day03wrapperconcatenationoperators;

public class WrapperClass {


    public static void main(String[] args) {

        // Java, primitive data typelarına bazı faydalı methodlar ekleyerek yeni bir veri yapısı oluşturmuştur.
        // Bu yeni yapı "Wrapper Class" olarak adlandırılır.

        // Primitive data:   char,   boolean, byte, short,   int,   long, float, double
        // Wrapper Class: Character, Boolean, Byte, Short, Integer, Long, Float, Double
        // Wrapper *Class* olunca büyük harfle yazılır. -- Primitive, Non-primitive'e dönüşür.--
        // WRAPPER CLASS=METHODLANDIRIR

        // Interview konusu- WRAPPER CLASS
        // Wrapper class'a dönüştürülen primitive datayı wrapper class'dan çıkarmak için UNBOXING
        // Non-primitive'i Wrapper Class'a eklemek de AUTOBOXING

        int n=12;

        Integer m=12;

        // ÖRNEK : Primitive int'i wrapper Integer'a çeviriniz. (AUTOBOXING)

        int num=13;
        Integer wrapperNum=num;

        // ÖRNEK : Wrapper Byte'ı primitive byte'a çeviriniz. (UNBOXING)

        Byte k=19;
        byte primitiveK=k;





    }


}
