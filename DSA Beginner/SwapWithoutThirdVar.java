/*
 * Program to demonstrate the swapping of two numbers without using third variable.
 */
import java.util.Scanner;

public class SwapWithoutThirdVar {
    static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print("Values after swapping: " + a + " " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("Values before swapping: " + a + " " + b);

        swap(a, b);
        sc.close();
    }
}