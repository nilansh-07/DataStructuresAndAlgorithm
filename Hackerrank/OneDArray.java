import java.util.*;

public class OneDArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Size of an Array:");
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the "+(i+1)+" number:");
            a[i] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        System.out.println("The Elements of an Array are:");
        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }
    }
}