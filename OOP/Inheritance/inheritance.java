
class Base {

    // for giving access to derived. 
    // only public and protected can give access of inheritated to derived, give access to assign
    // private only give access to set for inherit, don't give access to assign
    protected int number1 = 0, number2 = 10;

    public Base() {
        System.out.println("void Base Constructor");
    }

    public Base(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void show1() {
        System.out.println("From Base class");
        System.out.printf("%d %d\n", this.number1, this.number2);
    }
}

class Derived extends Base {

    private int number3 = 30;

    public Derived() {
        super();
        System.out.println("void Derived Constructor");
    }

    public Derived(int number1, int number2, int number3) {
        super(number1, number2);
        this.number3 = number3;
    }

    public void show2() {
        System.out.println("From Derived class");
        System.out.printf("%d %d %d\n", number1, number2, number3);
    }
}

public class inheritance {

    public static void main(String[] args) {
        Base object1 = new Base(40, 50);
        object1.show1();

        Derived object2 = new Derived(60, 70, 80);
        object2.show2();

        Derived object3 = new Derived();

        object3.show2();
    }
}
