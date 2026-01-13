
/*Q2. Write a Java program to input all basic data types (int, float, double, char, boolean) and print their values.
 Input:
 int = 10
 float = 5.5
 double = 99.99
 char = A
 boolean = true */
import java.util.*;

public class PQue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Int:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter String: ");
        String s = sc.nextLine();

        System.out.println("Enter Float: ");
        float f = sc.nextFloat();

        System.out.println("Enter Double: ");
        double d = sc.nextDouble();

        System.out.println("Enter Boolean: ");
        boolean b = sc.nextBoolean();
        System.out.println("Int: " + n);
        System.out.println("String: " + s);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Boolean: " + b);

    }

}
