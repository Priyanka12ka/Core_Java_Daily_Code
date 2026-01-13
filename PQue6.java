
/*Q6. Write a Java program to convert length from centimeter into meter and kilometer. */
import java.util.*;

public class PQue6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter centimeter: ");
        int cm = sc.nextInt();
        System.out.println("Cm to meter: " + (cm / 100));
        System.out.println("Cm to Kilometer: " + (cm / 100000));// 100,000
    }

}
