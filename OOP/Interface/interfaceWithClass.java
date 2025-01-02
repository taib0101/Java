
interface Animal {
    // public String name = "Dog";
    String name = "Dog";

    void sound(); // Abstract method
    void sleep(); // Abstract method
}

// Class implementing the interface
class Dog implements Animal { // *** most important change
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }

    @Override
    public void sleep() {
        System.out.println("The dog sleeps.");
    }
}

public class interfaceWithClass {

    public static void main(String[] args) {
        // creating new instance based on interface 
        Animal object1 = new Dog(); // *** most important change

        System.out.println(object1.name);
        object1.sound();
        object1.sleep();
    }
}
