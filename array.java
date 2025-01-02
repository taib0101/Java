import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println(array.length);

        String str = scanner.next();
        System.out.println(str);
        System.out.println(str.length());
    }
}