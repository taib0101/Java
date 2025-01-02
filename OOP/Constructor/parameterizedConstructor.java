
class BluePrint {

    private int number1;

    // parameterized constructor
    public BluePrint(int number1) {
        this.number1 = number1;
    }

    public int show() {
        return this.number1;
    }
}

public class parameterizedConstructor {

    public static void main(String[] args) {
        BluePrint object = new BluePrint(30);
        System.out.println(object.show());
    }
}
