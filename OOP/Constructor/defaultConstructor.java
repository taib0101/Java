class BluePrint {
    private int number1;

    // default constructor
    public BluePrint() {
        this.number1 = 10;
    }

    public int show() {
        return this.number1;
    }
}

public class defaultConstructor {

    public static void main(String[] args) {
        BluePrint object = new BluePrint();
        System.out.println(object.show());
    }
}
