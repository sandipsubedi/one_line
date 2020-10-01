import java.util.Scanner;

public class BitCounting {
    private static Scanner scanner;
    public static void main (String[] args) {
        scanner =  new Scanner(System.in);
        System.out.println("Enter an int: ");
        System.out.println(bitCount(scanner.nextInt()));
        scanner.close();
    }

    private static int bitCount(int num) {
        System.out.println(Integer.toBinaryString(num));
        return Integer.toBinaryString(num).replaceAll("[0]", "").length();
    }
}
