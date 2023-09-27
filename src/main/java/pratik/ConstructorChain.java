package pratik;

class ConstructorChain
{
    // default constructor 1
    ConstructorChain()
    {
        System.out.println("default");
    }

    // parameterized constructor 2
    ConstructorChain(int x)
    {
        // invokes default constructor
        this();
        System.out.println(x);
    }

    // parameterized constructor 3
    ConstructorChain(int x, int y)
    {
        // invokes parameterized constructor 2
        this(5);
        System.out.println(x * y);
    }

    public static void main(String args[])
    {
        // invokes parameterized constructor 3
        new ConstructorChain(8, 10);
    }
}

