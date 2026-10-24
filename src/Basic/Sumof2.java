package Basic;

import java.util.Scanner;

public class Sumof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter a number: ");
        int m = sc.nextInt();

        int c = n + m;
        System.out.println("The sum is: " + c);
    }
}
