
class Base {

    public int number1, number2;

    public Base() {
        System.out.println("Function overloaded without parameter");
    }

    // Constructor function overloaded
    public Base(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        System.out.println("Function overloaded with parameter");
    }
}

public class functionOverloading {

    public static int add(int a, int b) {
        return a + b;
    }

    // function overloaded
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));

        System.out.println(add(20, 30, 50));

        Base object = new Base();
        object = new Base(20, 30);
    }
}
