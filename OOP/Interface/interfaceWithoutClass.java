
interface Animal {

    // public String type = "Dog";
    String type = "Dog";
    
    // as like abstract method
    void sound();

    // default method
    default void printType() {
        System.out.println("Animal type: " + type);
    }
}

public class interfaceWithoutClass {

    public static void main(String[] args) {
        Animal object1 = new Animal() {
            @Override
            public void sound() {
                System.out.println("Dow sound is ghew");
            }
        };

        System.out.println(object1.type);
        object1.sound();
        object1.printType();
    }
}
