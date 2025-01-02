
class Base {

    protected int number1, number2;

    public Base(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void overrideFunction() {
        System.out.println("From Base class");
    }

}

class Derived extends Base {

    private int number3;

    public Derived(int number1, int number2, int number3) {
        super(number1, number2);
        this.number3 = number3;
    }

    @Override
    public void overrideFunction () {
        System.out.println("Overriding From Derived class");
    }
}

public class functionOverriding {

    public static void main(String[] args) {
        Base object1 = new Base(30, 40);
        object1.overrideFunction();

        Derived object2 = new Derived(20, 50, 60);
        object2.overrideFunction();
    }
}
