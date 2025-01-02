
public class exceptionHandling {

    public static void main(String[] args) {
        // Catching All Exceptions by Exception
        try {
            int sum = 10 / 0;

        } catch (Exception error) {
            System.out.println("Caught an exception : " + error.getClass().getName());
            System.out.println("Message : " + error.getMessage());
        } finally {
            System.out.println("Execution completed");
        }

        /**
         * Exception are ArithmeticException ; int result = 10 / 0; // Division
         * by zero ArrayIndexOutOfBoundsException ; int[] arr = {1} ;
         * System.out.println(arr[5]) // out of bound NullPointerException ;
         * String str = null ; System.out.println(str.lenght())
         * NumberFormatException ; int number = Integer.parseInt("abc");
         */
    }
}
