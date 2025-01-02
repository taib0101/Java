
class BluePrint {

    private int number1;

    public BluePrint(int number1) {
        this.number1 = number1;
    }

    // copy constructor
    public BluePrint(BluePrint instance) {
        this.number1 = instance.number1;
    }

    public int show() {
        return this.number1;
    }
}

public class copyConstructor {

    public static void main(String[] args) {
        BluePrint object1 = new BluePrint(30);

        BluePrint object2 = new BluePrint(object1);

        System.out.println(object2.show());
    }
}
