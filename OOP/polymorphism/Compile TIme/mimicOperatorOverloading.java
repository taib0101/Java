/*
    Java Doesn't support operator overloading
    mimic operator works as operator overloading

 */

class BluePrint {

    public int number1, number2;

    public BluePrint(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // mimic Method alonside Operator Overloading
    // it takes instance of it's own class and return new instance
    public BluePrint add(BluePrint newObject) {
        return new BluePrint(this.number1 + newObject.number1, this.number2 + newObject.number1);
    }
}

public class mimicOperatorOverloading {

    public static void main(String[] args) {
        BluePrint object1 = new BluePrint(10, 20);
        BluePrint object2 = new BluePrint(40, 50);

        BluePrint mimicOperator = object1.add(object2);
        System.out.println("Result is : " + mimicOperator.number1 + " " + mimicOperator.number2);
    }
}
