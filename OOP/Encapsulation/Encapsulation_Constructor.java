
class Person {

    // private or protect restrict direct access
    private int number1 = 10, number2;

    // Default Constructor
    // Give direct access
    Person() {
        System.out.println("Default Constructor");
    }

    // Parameterized Constructor
    public Person(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;

        System.out.println("parameterized Constructor");
    }

    // private or protect restrict direct access
    private void privateShow() {
        System.out.printf("%d %d\n", this.number1, this.number2);
    }

    // Give direct access
    public void publicShow() {
        privateShow();
    }
}

public class Encapsulation_Constructor {

    public static String constructor = "Constructor";

    public static void main(String[] args) {
        System.out.println(constructor);

        Person object1 = new Person();
        object1.publicShow();

        System.out.println();

        Person object2 = new Person(60, 70);
        object2.publicShow();
    }
}
