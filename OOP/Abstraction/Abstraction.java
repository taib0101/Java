// Focuses on "hiding implementation details" and "showing only the essential features".
// Simplify complexity: Focus on what objects do.

// Hiding implementation details
abstract class Animal {

    protected String name = "", sound = "";

    // Constructor
    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
        System.out.println("Constructor Method in Abstraction class");
    }

    // abstract method, and show essential features
    abstract void show();

}

class Dog extends Animal {

    private String dick = "";

    Dog(String name, String sound, String dick) {
        super(name, sound);
        this.dick = dick;
    }

    @Override
    public void show() {
        System.out.println("Name :" + this.name);
        System.out.println("Sound :" + this.sound);
        System.out.println("dick :" + this.dick);
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Dog object1 = new Dog("Droopy", "Ghew", "Small");
        object1.show();

    }
}
