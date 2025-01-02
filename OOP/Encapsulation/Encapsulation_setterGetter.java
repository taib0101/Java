
class Person {

    // private or protect restrict direct access
    private int number1, number2;

    // encapsulation
    public void setter(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;

        System.out.println("Setter");
        System.out.println("Number has set successfullyx. theye are " + this.number1 + " " + this.number2);
    }

    public void getter() {
        System.out.println();
        System.out.println("Getter");
        System.out.println("sum is " + (this.number1 + this.number2));
    }
}

public class Encapsulation_setterGetter {

    public static void main(String[] args) {
        Person object = new Person();
        object.setter(20, 40);

        object.getter();
    }
}
